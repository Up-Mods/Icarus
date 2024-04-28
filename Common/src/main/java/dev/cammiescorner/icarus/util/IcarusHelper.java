package dev.cammiescorner.icarus.util;

import dev.cammiescorner.icarus.api.IcarusPlayerValues;
import dev.cammiescorner.icarus.api.SlowFallingEntity;
import dev.cammiescorner.icarus.client.IcarusClient;
import dev.cammiescorner.icarus.init.IcarusItemTags;
import dev.cammiescorner.icarus.init.IcarusStatusEffects;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.network.s2c.SyncConfigValuesPacket;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class IcarusHelper {

    @ApiStatus.Internal
    public static Predicate<LivingEntity> hasWings = entity -> false;

    @ApiStatus.Internal
    public static Function<LivingEntity, ItemStack> getEquippedWings = entity -> ItemStack.EMPTY;
    @ApiStatus.Internal
    public static BiPredicate<LivingEntity, ItemStack> equipFunc = (entity, stack) -> false;

    @ApiStatus.Internal
    public static IcarusPlayerValues fallbackValues = new ServerPlayerFallbackValues();

    public static boolean onFallFlyingTick(LivingEntity entity, @Nullable ItemStack wings, boolean tick) {
        IcarusPlayerValues cfg = IcarusHelper.getConfigValues(entity);
        if (!entity.level().isClientSide() && entity.level().registryAccess().registryOrThrow(Registries.DIMENSION).getHolderOrThrow(entity.level().dimension()).is(cfg.noFlyingAllowedInDimensions())) {
            if (entity instanceof ServerPlayer player) {
                stopFlying(player);
                player.sendSystemMessage(Component.translatable("message.icarus.status.no_fly.dimension").withStyle(ChatFormatting.RED), true);
            }
            return false;
        }

        if (entity.hasEffect(IcarusStatusEffects.FLIGHTLESS.get())) {
            if (entity instanceof Player player) {
                stopFlying(player);
                Component message = Component.translatable("message.icarus.status.no_fly.status_effect").withStyle(ChatFormatting.BLUE);
                if (entity instanceof ServerPlayer serverPlayer) {
                    serverPlayer.sendSystemMessage(message, true);
                } else {
                    IcarusClient.sendActionbarMessage(player, message);
                }
            }
            return false;
        }


        if (wings != null && (!(wings.getItem() instanceof WingItem wingItem) || !wingItem.isUsable(entity, wings))) {
            if (entity instanceof Player player) {
                stopFlying(player);
            }
            return false;
        }

        if (tick) {
            if ((cfg.canSlowFall() && entity.isShiftKeyDown()) || entity.isUnderWater()) {
                if (entity instanceof Player player) {
                    stopFlying(player);
                }
                return false;
            }

            if ((wings == null || !wings.is(IcarusItemTags.FREE_FLIGHT)) && entity instanceof Player player && !player.isCreative()) {
                player.getFoodData().addExhaustion(cfg.exhaustionAmount());
                if (player.getFoodData().getFoodLevel() <= 6) {
                    stopFlying(player);
                    Component message = Component.translatable("message.icarus.status.no_fly.hunger").withStyle(ChatFormatting.BLUE);
                    if (entity instanceof ServerPlayer serverPlayer) {
                        serverPlayer.sendSystemMessage(message, true);
                    } else {
                        IcarusClient.sendActionbarMessage(player, message);
                    }
                    return false;
                }
            }

            if (wings != null && wings.getItem() instanceof WingItem wingItem && !wingItem.onFlightTick(entity, wings, entity.getFallFlyingTicks() + 1)) {
                if (entity instanceof Player player) {
                    stopFlying(player);
                }
                return false;
            }
        }

        return true;
    }

    public static boolean hasWings(LivingEntity entity) {
        return hasWings.test(entity);
    }

    public static ItemStack getEquippedWings(LivingEntity entity) {
        return getEquippedWings.apply(entity);
    }

    public static IcarusPlayerValues getConfigValues(LivingEntity entity) {
        return fallbackValues;
    }

    public static void onPlayerTick(Player player) {
        if (((SlowFallingEntity) player).icarus$isSlowFalling()) {
            player.fallDistance = 0F;

            if (player.onGround() || player.isInWater()) {
                ((SlowFallingEntity) player).icarus$setSlowFalling(false);
            } else {
                var move = player.getDeltaMovement();
                player.setDeltaMovement(move.x(), -0.4, move.z());
            }
        }
    }

    public static void stopFlying(Player player) {
        ((SlowFallingEntity) player).icarus$setSlowFalling(true);

        if (player.getXRot() < -90 || player.getXRot() > 90) {
            float offset = (player.getXRot() < -90 ? player.getXRot() + 180 : player.getXRot() - 180) * 2;
            player.setXRot((player.getXRot() < -90 ? 180 + offset : -180 - offset) + player.getXRot());
            player.setYRot(180 + player.getYRot());
        }
    }

    public static void onServerPlayerJoin(ServerPlayer player) {
        SyncConfigValuesPacket.send(player);
    }
}
