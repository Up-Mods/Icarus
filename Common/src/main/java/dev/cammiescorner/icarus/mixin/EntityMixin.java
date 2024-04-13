package dev.cammiescorner.icarus.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Shadow public abstract float getXRot();

    @ModifyExpressionValue(method = "turn", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(FFF)F"))
    private float icarus$updateLookDirection(float original) {
        var self = (Entity)(Object) this;
        if(self instanceof LivingEntity living) {
            return IcarusHelper.hasWings.test(living) ? Mth.wrapDegrees(this.getXRot()) : original;
        }
        return original;
    }
}
