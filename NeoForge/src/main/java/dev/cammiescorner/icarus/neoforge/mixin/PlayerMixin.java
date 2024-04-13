package dev.cammiescorner.icarus.neoforge.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Player.class)
public abstract class PlayerMixin {

    @WrapOperation(method = "tryToStartFallFlying", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;canElytraFly(Lnet/minecraft/world/entity/LivingEntity;)Z"))
    private boolean icarus$canElytraFly(ItemStack instance, LivingEntity entity, Operation<Boolean> original) {
        if (original.call(instance, entity)) {
            return true;
        }

        var item = IcarusHelper.getEquippedWings.apply(entity);
        return !item.isEmpty() && IcarusHelper.onFallFlyingTick(entity, item, false);
    }
}
