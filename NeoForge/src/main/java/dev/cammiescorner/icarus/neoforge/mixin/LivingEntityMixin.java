package dev.cammiescorner.icarus.neoforge.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @WrapOperation(method = "updateFallFlying", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;canElytraFly(Lnet/minecraft/world/entity/LivingEntity;)Z"))
    private boolean icarus$canElytraFly(ItemStack instance, LivingEntity entity, Operation<Boolean> original, @Share("icarus$wings") LocalRef<ItemStack> wings) {
        if (original.call(instance, entity)) {
            return true;
        }

        var item = IcarusHelper.getEquippedWings.apply(entity);
        if (!item.isEmpty() && IcarusHelper.onFallFlyingTick(entity, item, false)) {
            wings.set(item);
            return true;
        }

        return false;
    }

    @WrapOperation(method = "updateFallFlying", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;elytraFlightTick(Lnet/minecraft/world/entity/LivingEntity;I)Z"))
    private boolean icarus$elytraFlightTick(ItemStack instance, LivingEntity entity, int ticks, Operation<Boolean> original, @Share("icarus$wings") LocalRef<ItemStack> wings) {
        var item = wings.get();
        if (item == null) {
            return original.call(instance, entity, ticks);
        }

        return IcarusHelper.onFallFlyingTick(entity, item, true);
    }
}
