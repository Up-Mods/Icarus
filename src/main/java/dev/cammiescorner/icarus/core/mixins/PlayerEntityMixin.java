package dev.cammiescorner.icarus.core.mixins;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.core.util.IcarusHelper;
import dev.cammiescorner.icarus.core.util.SlowFallEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements SlowFallEntity {
	@Unique public boolean slowFalling = false;

	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(method = "tick", at = @At("HEAD"))
	public void tick(CallbackInfo info) {
		if(Icarus.HAS_POWERED_FLIGHT.test(this)) {
			if(isFallFlying()) {
				if(forwardSpeed > 0)
					IcarusHelper.applySpeed((PlayerEntity) (Object) this, null);
				if((Icarus.getConfig().canSlowFall && isSneaking()) || isSubmergedInWater())
					IcarusHelper.stopFlying((PlayerEntity) (Object) this);
			}
			else {
				if(isOnGround() || isTouchingWater())
					setSlowFalling(false);

				if(isSlowFalling()) {
					fallDistance = 0F;
					setVelocity(getVelocity().x, -0.4, getVelocity().z);
				}
			}
		}
	}

	@Override
	public void setSlowFalling(boolean slowFalling) {
		this.slowFalling = slowFalling;
	}

	@Override
	public boolean isSlowFalling() {
		return slowFalling;
	}
}
