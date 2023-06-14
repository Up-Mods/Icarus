package dev.cammiescorner.icarus.core.mixins;

import dev.cammiescorner.icarus.core.util.SlowFallEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements SlowFallEntity {
	@Unique public boolean slowFalling = false;

	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) { super(entityType, world); }

	@Override
	public void setSlowFalling(boolean slowFalling) {
		this.slowFalling = slowFalling;
	}

	@Override
	public boolean isSlowFalling() {
		return slowFalling;
	}
}
