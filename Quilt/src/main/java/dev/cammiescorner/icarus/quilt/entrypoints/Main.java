package dev.cammiescorner.icarus.quilt.entrypoints;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.init.IcarusStatusEffects;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.util.IcarusHelper;
import dev.cammiescorner.icarus.util.Registrar;
import dev.emi.trinkets.TrinketSlot;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketInventory;
import dev.emi.trinkets.api.TrinketsApi;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.gameevent.GameEvent;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.entity.event.api.ServerEntityTickCallback;
import org.quiltmc.qsl.lifecycle.api.event.ServerLifecycleEvents;
import org.quiltmc.qsl.networking.api.server.ServerPlayConnectionEvents;

import java.util.function.Supplier;

public class Main implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        Icarus.init();

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> IcarusHelper.onServerPlayerJoin(handler.getPlayer()));

        IcarusHelper.getEquippedWings = entity -> {
            var component = TrinketsApi.getTrinketComponent(entity);
            if (component.isPresent()) {
                var items = component.get().getEquipped(stack -> stack.getItem() instanceof WingItem);
                if (!items.isEmpty()) {
                    return items.get(0).getB();
                }
            }

            return ItemStack.EMPTY;
        };

        IcarusHelper.hasWings = entity -> {
            var component = TrinketsApi.getTrinketComponent(entity);
            return component.isPresent() && component.get().isEquipped(stack -> stack.getItem() instanceof WingItem);
        };

        IcarusHelper.equipFunc = (user, stack) -> {
            var optional = TrinketsApi.getTrinketComponent(user);
            if (optional.isPresent()) {
                TrinketComponent comp = optional.get();
                for (var group : comp.getInventory().values()) {
                    for (TrinketInventory inv : group.values()) {
                        for (int i = 0; i < inv.getContainerSize(); i++) {
                            if (inv.getItem(i).isEmpty()) {
                                SlotReference ref = new SlotReference(inv, i);
                                if (TrinketSlot.canInsert(stack, ref, user)) {
                                    ItemStack newStack = stack.copy();
                                    newStack.setCount(1);
                                    inv.setItem(i, newStack);
                                    var soundEvent = stack.getItem() instanceof Equipable eq ? eq.getEquipSound() : null;
                                    if (!stack.isEmpty()) {
                                        user.gameEvent(GameEvent.EQUIP);
                                        if (soundEvent != null && !user.isSilent()) {
                                            user.level().playSeededSound(null, user.getX(), user.getY(), user.getZ(), soundEvent, user.getSoundSource(), 1.0F, 1.0F, user.getRandom().nextLong());
                                        }
                                    }
                                    stack.shrink(1);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        };

        EntityElytraEvents.CUSTOM.register((entity, tickElytra) -> IcarusHelper.onFallFlyingTick(entity, IcarusHelper.getEquippedWings(entity), tickElytra));

        ServerEntityTickCallback.EVENT.register((entity, isPassengerTick) -> {
            if (!isPassengerTick && entity instanceof Player player) {
                IcarusHelper.onPlayerTick(player);
            }
        });

        ServerLifecycleEvents.STARTING.register(Icarus::onServerStart);

        IcarusItems.register(new Registrar<>() {
            @Override
            public <T extends Item> Supplier<T> register(String name, Supplier<? extends T> factory) {
                var value = Registry.register(BuiltInRegistries.ITEM, Icarus.id(name), factory.get());
                return () -> value;
            }
        });

        IcarusStatusEffects.register(new Registrar<>() {
            @Override
            public <T extends MobEffect> Supplier<T> register(String name, Supplier<? extends T> factory) {
                var value = Registry.register(BuiltInRegistries.MOB_EFFECT, Icarus.id(name), factory.get());
                return () -> value;
            }
        });

        var group = IcarusItems.makeTab(FabricItemGroup.builder());
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Icarus.id("icarus"), group);
    }
}
