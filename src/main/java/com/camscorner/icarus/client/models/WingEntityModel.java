package com.camscorner.icarus.client.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class WingEntityModel<T extends LivingEntity> extends AnimalModel<T>
{
	private final ModelPart rightWing;
	private final ModelPart leftWing;

	public WingEntityModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		rightWing = new ModelPart(this);
		rightWing.setPivot(0.0F, 5.0F, 0.0F);
		rightWing.setTextureOffset(22, 0).addCuboid(-8.0F, -1.0F, -1.0F, 10.0F, 20.0F, 2.0F, 0.0F, true);

		leftWing = new ModelPart(this);
		leftWing.setPivot(0.0F, 5.0F, 0.0F);
		leftWing.setTextureOffset(22, 22).addCuboid(-2.0F, -1.0F, -1.0F, 10.0F, 20.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
	{
		float a = 0.125F;
		float b = 0.1F;
		float k = 0.3F;
		float l = -0.7F;
		float m = -2.0F;
		float n = 0.0F;

		if(entity.isFallFlying())
		{
			float o = 1.0F;
			Vec3d vec3d = entity.getVelocity();

			if(vec3d.y < 0.0D)
			{
				Vec3d vec3d2 = vec3d.normalize();
				o = 1.0F - (float) Math.pow(-vec3d2.y, 1.5D);
			}

			k = o * 0.35F + (1.0F - o) * k;
			l = o * -1.6F + (0.3F - o) * l;

			if(entity.forwardSpeed > 0)
			{
				a = 0.4F;
				b = 1.0F;
			}
		}
		else if(entity.isInSneakingPose())
		{
			k = 0.7F;
			m = 0.0F;
			n = 0.09F;
		}

		k += MathHelper.sin(entity.age * a) * b;
		this.rightWing.pivotX = 7.0F;
		this.rightWing.pivotY = m;

		if(entity instanceof AbstractClientPlayerEntity)
		{
			AbstractClientPlayerEntity player = (AbstractClientPlayerEntity) entity;
			player.elytraPitch = (player.elytraPitch + (k - player.elytraPitch) * 0.1F);
			player.elytraYaw = (player.elytraYaw + (n - player.elytraYaw) * 0.1F);
			player.elytraRoll = (player.elytraRoll + (l - player.elytraRoll) * 0.1F);
			this.rightWing.pitch = player.elytraPitch;
			this.rightWing.yaw = player.elytraYaw;
			this.rightWing.roll = player.elytraRoll;
		}
		else
		{
			this.rightWing.pitch = k;
			this.rightWing.roll = l;
			this.rightWing.yaw = n;
		}

		this.leftWing.pivotX = -this.rightWing.pivotX;
		this.leftWing.yaw = -this.rightWing.yaw;
		this.leftWing.pivotY = this.rightWing.pivotY;
		this.leftWing.pitch = this.rightWing.pitch;
		this.leftWing.roll = -this.rightWing.roll;
	}

	@Override
	protected Iterable<ModelPart> getHeadParts()
	{
		return ImmutableList.of();
	}

	@Override
	protected Iterable<ModelPart> getBodyParts()
	{
		return ImmutableList.of(this.rightWing, this.leftWing);
	}
}