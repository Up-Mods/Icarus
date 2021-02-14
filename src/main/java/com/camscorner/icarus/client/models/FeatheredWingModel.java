/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.entity.LivingEntity;

public class FeatheredWingModel extends WingEntityModel
{
	private final ModelPart leftWing01;
	private final ModelPart leftWing02;
	private final ModelPart leftWing03;
	private final ModelPart leftWing04;
	private final ModelPart leftWing05;
	private final ModelPart lFeathers02;
	private final ModelPart Box_r1;
	private final ModelPart lFeathers01;
	private final ModelPart Box_r2;
	private final ModelPart rightWing01;
	private final ModelPart rightWing02;
	private final ModelPart rightWing03;
	private final ModelPart rightWing04;
	private final ModelPart rightWing05;
	private final ModelPart rFeathers02;
	private final ModelPart Box_r3;
	private final ModelPart rFeathers01;
	private final ModelPart Box_r4;

	public FeatheredWingModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		leftWing01 = new ModelPart(this);
		leftWing01.setPivot(-6.0F, 0.0F, 0.0F);
		setRotationAngle(leftWing01, 0.0F, 1.5708F, 0.436332F);
		leftWing01.setTextureOffset(0, 0).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		rightWing.addChild(leftWing01);

		leftWing02 = new ModelPart(this);
		leftWing02.setPivot(-0.5F, 0.0F, 3.5F);
		leftWing01.addChild(leftWing02);
		setRotationAngle(leftWing02, 0.1309F, 0.3054F, 0.0F);
		leftWing02.setTextureOffset(0, 47).addCuboid(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftWing03 = new ModelPart(this);
		leftWing03.setPivot(0.0F, -1.0F, 8.5F);
		leftWing02.addChild(leftWing03);
		setRotationAngle(leftWing03, -0.5672F, 0.3054F, 0.0F);
		leftWing03.setTextureOffset(39, 0).addCuboid(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftWing04 = new ModelPart(this);
		leftWing04.setPivot(0.0F, 0.5F, 7.2F);
		leftWing03.addChild(leftWing04);
		setRotationAngle(leftWing04, 1.0908F, 0.0F, 0.0F);
		leftWing04.setTextureOffset(33, 25).addCuboid(-0.7F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, true);

		leftWing05 = new ModelPart(this);
		leftWing05.setPivot(-0.5F, 4.8F, -0.2F);
		leftWing04.addChild(leftWing05);
		leftWing05.setTextureOffset(0, 13).addCuboid(0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, 0.0F, true);

		lFeathers02 = new ModelPart(this);
		lFeathers02.setPivot(0.0F, -3.5F, -3.2F);
		leftWing04.addChild(lFeathers02);
		setRotationAngle(lFeathers02, 0.0F, 0.0F, 0.0873F);

		Box_r1 = new ModelPart(this);
		Box_r1.setPivot(0.0F, 0.0F, 0.0F);
		lFeathers02.addChild(Box_r1);
		setRotationAngle(Box_r1, 0.48F, 0.0F, 0.0F);
		Box_r1.setTextureOffset(26, 26).addCuboid(0.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, 0.0F, true);

		lFeathers01 = new ModelPart(this);
		lFeathers01.setPivot(0.6F, 1.3F, 1.5F);
		leftWing02.addChild(lFeathers01);
		setRotationAngle(lFeathers01, -0.1745F, -0.0873F, 0.0F);

		Box_r2 = new ModelPart(this);
		Box_r2.setPivot(0.0F, 0.0F, 0.0F);
		lFeathers01.addChild(Box_r2);
		setRotationAngle(Box_r2, 0.1745F, 0.0F, 0.0F);
		Box_r2.setTextureOffset(0, 0).addCuboid(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, 0.0F, true);

		rightWing01 = new ModelPart(this);
		rightWing01.setPivot(6.0F, 0.0F, 0.0F);
		setRotationAngle(rightWing01, 0.0F, -1.5708F, -0.436332F);
		rightWing01.setTextureOffset(0, 0).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F, 0.0F, true);
		leftWing.addChild(rightWing01);

		rightWing02 = new ModelPart(this);
		rightWing02.setPivot(0.5F, 0.0F, 3.5F);
		rightWing01.addChild(rightWing02);
		setRotationAngle(rightWing02, 0.1309F, -0.3054F, 0.0F);
		rightWing02.setTextureOffset(0, 47).addCuboid(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F, 0.0F, true);

		rightWing03 = new ModelPart(this);
		rightWing03.setPivot(0.0F, -1.0F, 8.5F);
		rightWing02.addChild(rightWing03);
		setRotationAngle(rightWing03, -0.5672F, -0.3054F, 0.0F);
		rightWing03.setTextureOffset(39, 0).addCuboid(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F, 0.0F, true);

		rightWing04 = new ModelPart(this);
		rightWing04.setPivot(0.0F, 0.5F, 7.2F);
		rightWing03.addChild(rightWing04);
		setRotationAngle(rightWing04, 1.0908F, 0.0F, 0.0F);
		rightWing04.setTextureOffset(33, 25).addCuboid(-0.3F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);

		rightWing05 = new ModelPart(this);
		rightWing05.setPivot(0.5F, 4.8F, -0.2F);
		rightWing04.addChild(rightWing05);
		rightWing05.setTextureOffset(0, 13).addCuboid(-0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, 0.0F, false);

		rFeathers02 = new ModelPart(this);
		rFeathers02.setPivot(0.0F, -3.5F, -3.2F);
		rightWing04.addChild(rFeathers02);
		setRotationAngle(rFeathers02, 0.0F, 0.0F, -0.0873F);

		Box_r3 = new ModelPart(this);
		Box_r3.setPivot(0.0F, 0.0F, 0.0F);
		rFeathers02.addChild(Box_r3);
		setRotationAngle(Box_r3, 0.48F, 0.0F, 0.0F);
		Box_r3.setTextureOffset(26, 26).addCuboid(-1.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, 0.0F, false);

		rFeathers01 = new ModelPart(this);
		rFeathers01.setPivot(-0.6F, 1.3F, 1.5F);
		rightWing02.addChild(rFeathers01);
		setRotationAngle(rFeathers01, -0.1745F, 0.0873F, 0.0F);

		Box_r4 = new ModelPart(this);
		Box_r4.setPivot(0.0F, 0.0F, 0.0F);
		rFeathers01.addChild(Box_r4);
		setRotationAngle(Box_r4, 0.1745F, 0.0F, 0.0F);
		Box_r4.setTextureOffset(0, 0).addCuboid(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setAngles(LivingEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
	{
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);

		if(state == State.IDLE || state == State.CROUCHING)
			leftWing03.pitch = (float) Math.toRadians(-60);
		if(state == State.FLYING)
			leftWing03.pitch = (float) Math.toRadians(-32.5);

		rightWing03.pitch = leftWing03.pitch;
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z)
	{
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
}