package dev.cammiescorner.icarus.core.mixins;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.core.util.IcarusHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(method = "tick", at = @At("HEAD"))
	public void tick(CallbackInfo info) {
		if(Icarus.HAS_POWERED_FLIGHT.test(this) && isFallFlying()) {
			if(forwardSpeed > 0)
				IcarusHelper.applySpeed((PlayerEntity) (Object) this, null);
			if(isSubmergedInWater())
				IcarusHelper.stopFlying((PlayerEntity) (Object) this);
		}
	}
}
