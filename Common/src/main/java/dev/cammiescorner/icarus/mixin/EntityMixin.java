package dev.cammiescorner.icarus.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@SuppressWarnings("UnreachableCode")
@Mixin(Entity.class)
public abstract class EntityMixin {

    @Shadow public abstract float getXRot();

    @Shadow public float xRotO;

    @ModifyExpressionValue(method = "turn", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(FFF)F", ordinal = 0))
    private float icarus$updateLookDirection(float original) {
        if(((Object) this) instanceof LivingEntity living) {
            return living.isFallFlying() && IcarusHelper.hasWings.test(living) ? Mth.wrapDegrees(this.getXRot()) : original;
        }
        return original;
    }

    @ModifyExpressionValue(method = "turn", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(FFF)F", ordinal = 1))
    private float icarus$updateLookDirection0(float original) {
        if (((Object) this) instanceof LivingEntity living) {
            return living.isFallFlying() && IcarusHelper.hasWings.test(living) ? Mth.wrapDegrees(this.xRotO) : original;
        }
        return original;
    }
}
