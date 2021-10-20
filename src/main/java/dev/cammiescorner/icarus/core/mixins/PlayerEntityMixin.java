package dev.cammiescorner.icarus.core.mixins;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.core.network.client.DeleteHungerMessage;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
	@Shadow public abstract void stopFallFlying();
	@Shadow public abstract boolean isCreative();

	@Unique private boolean shouldSlowfall = false;

	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(method = "tick", at = @At("HEAD"))
	public void tick(CallbackInfo info) {
		if(Icarus.HAS_POWERED_FLIGHT.test(this)) {
			if(isFallFlying()) {
				if(forwardSpeed > 0)
					applySpeed();
				if(isSneaking())
					stopFlying();

				if(world.isClient)
					System.out.println(getVelocity().length());
			}
			else {
				if(isOnGround() || isTouchingWater())
					shouldSlowfall = false;

				if(shouldSlowfall) {
					fallDistance = 0F;
					setVelocity(getVelocity().x, -0.4, getVelocity().z);
				}
			}
		}
	}

	@Unique
	public void stopFlying() {
		shouldSlowfall = true;

		if(getPitch() < -90 || getPitch() > 90) {
			float offset = (getPitch() < -90 ? getPitch() + 180 : getPitch() - 180) * 2;
			setPitch((getPitch() < -90 ? 180 + offset : -180 - offset) + getPitch());
			setYaw(180 + getYaw());
		}

		stopFallFlying();
	}

	@Unique
	public void applySpeed() {
		shouldSlowfall = false;
		Vec3d rotation = getRotationVector();
		Vec3d velocity = getVelocity();
		float modifier = Icarus.getConfig().armourSlows ? Math.max(1F, (getArmor() / 30F) * Icarus.getConfig().maxSlowedMultiplier) : 1F;
		float speed = (Icarus.getConfig().wingsSpeed * (getPitch() < -80 && getPitch() > -100 ? 2.75F : 1)) / modifier;

		setVelocity(velocity.add(rotation.x * speed + (rotation.x * 1.5D - velocity.x) * speed,
							rotation.y * speed + (rotation.y * 1.5D - velocity.y) * speed,
							rotation.z * speed + (rotation.z * 1.5D - velocity.z) * speed));

		if(!isCreative())
			DeleteHungerMessage.send();
	}
}
