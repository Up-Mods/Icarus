/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.entity.LivingEntity;

public class LeatherWingModel extends WingEntityModel
{
	private final ModelPart leftWing01;
	private final ModelPart leftWing02;
	private final ModelPart leftWing03;
	private final ModelPart leftWing04;
	private final ModelPart leftWing04Leather;
	private final ModelPart leftWingStrut01;
	private final ModelPart leftWingStrut01Leather;
	private final ModelPart leftWingStrut02;
	private final ModelPart leftWingStrut02Leather;
	private final ModelPart leftWingStrut03;
	private final ModelPart leftWingStrut03Leather;
	private final ModelPart leftStrutLowest;
	private final ModelPart leftStrutLowestLeather01;
	private final ModelPart leftStrutLowestLeather02;
	private final ModelPart rightWing01;
	private final ModelPart rightWing02;
	private final ModelPart rightWing03;
	private final ModelPart rightWing04;
	private final ModelPart rightWing04Leather;
	private final ModelPart rightWingStrut01;
	private final ModelPart rightWingStrut01Leather;
	private final ModelPart rightWingStrut02;
	private final ModelPart rightWingStrut02Leather;
	private final ModelPart rightWingStrut03;
	private final ModelPart rightWingStrut03Leather;
	private final ModelPart rightStrutLowest;
	private final ModelPart rightStrutLowestLeather01;
	private final ModelPart rightStrutLowestLeather02;

	public LeatherWingModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		leftWing01 = new ModelPart(this);
		leftWing01.setPivot(-6.0F, 0.0F, 0.0F);
		setRotationAngle(leftWing01, 0.0F, 1.5708F, 0.436332F);
		leftWing01.setTextureOffset(21, 0).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);
		rightWing.addChild(leftWing01);

		leftWing02 = new ModelPart(this);
		leftWing02.setPivot(-0.5F, 0.0F, 3.5F);
		leftWing01.addChild(leftWing02);
		setRotationAngle(leftWing02, 0.6109F, 0.48F, 0.0F);
		leftWing02.setTextureOffset(0, 47).addCuboid(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftWing03 = new ModelPart(this);
		leftWing03.setPivot(0.0F, 1.0F, 6.5F);
		leftWing02.addChild(leftWing03);
		setRotationAngle(leftWing03, -0.5672F, 0.3054F, 0.0F);
		leftWing03.setTextureOffset(39, 0).addCuboid(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftWing04 = new ModelPart(this);
		leftWing04.setPivot(0.0F, 0.0F, 7.5F);
		leftWing03.addChild(leftWing04);
		setRotationAngle(leftWing04, -0.7418F, 0.0F, 0.0F);
		leftWing04.setTextureOffset(0, 0).addCuboid(-0.6F, -0.8F, -4.0F, 1.0F, 1.0F, 19.0F, 0.0F, false);

		leftWing04Leather = new ModelPart(this);
		leftWing04Leather.setPivot(0.0F, 0.0F, 0.0F);
		leftWing04.addChild(leftWing04Leather);
		leftWing04Leather.setTextureOffset(0, 28).addCuboid(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, 0.0F, false);

		leftWingStrut01 = new ModelPart(this);
		leftWingStrut01.setPivot(0.0F, 1.0F, 7.0F);
		leftWing03.addChild(leftWingStrut01);
		setRotationAngle(leftWingStrut01, -1.0036F, 0.0F, 0.0F);
		leftWingStrut01.setTextureOffset(21, 0).addCuboid(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, false);

		leftWingStrut01Leather = new ModelPart(this);
		leftWingStrut01Leather.setPivot(0.0F, 0.0F, 0.0F);
		leftWingStrut01.addChild(leftWingStrut01Leather);
		leftWingStrut01Leather.setTextureOffset(0, 22).addCuboid(-0.05F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, 0.0F, false);

		leftWingStrut02 = new ModelPart(this);
		leftWingStrut02.setPivot(0.0F, 1.0F, 6.0F);
		leftWing03.addChild(leftWingStrut02);
		setRotationAngle(leftWingStrut02, -1.309F, 0.0F, 0.0F);
		leftWingStrut02.setTextureOffset(21, 0).addCuboid(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, false);

		leftWingStrut02Leather = new ModelPart(this);
		leftWingStrut02Leather.setPivot(0.0F, 0.0F, 0.0F);
		leftWingStrut02.addChild(leftWingStrut02Leather);
		leftWingStrut02Leather.setTextureOffset(0, 4).addCuboid(-0.1F, 0.0F, -1.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);

		leftWingStrut03 = new ModelPart(this);
		leftWingStrut03.setPivot(0.0F, 1.0F, 5.0F);
		leftWing03.addChild(leftWingStrut03);
		setRotationAngle(leftWingStrut03, -1.6581F, 0.0F, 0.0F);
		leftWingStrut03.setTextureOffset(21, 0).addCuboid(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, false);

		leftWingStrut03Leather = new ModelPart(this);
		leftWingStrut03Leather.setPivot(0.0F, 0.0F, 0.0F);
		leftWingStrut03.addChild(leftWingStrut03Leather);
		leftWingStrut03Leather.setTextureOffset(0, 12).addCuboid(-0.15F, 0.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, false);

		leftStrutLowest = new ModelPart(this);
		leftStrutLowest.setPivot(0.5F, 1.0F, 2.0F);
		leftWing02.addChild(leftStrutLowest);
		setRotationAngle(leftStrutLowest, -0.3491F, 0.0F, 0.0F);
		leftStrutLowest.setTextureOffset(12, 0).addCuboid(-1.1F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		leftStrutLowestLeather01 = new ModelPart(this);
		leftStrutLowestLeather01.setPivot(-0.5F, 0.0F, 0.0F);
		leftStrutLowest.addChild(leftStrutLowestLeather01);
		leftStrutLowestLeather01.setTextureOffset(0, 0).addCuboid(0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);

		leftStrutLowestLeather02 = new ModelPart(this);
		leftStrutLowestLeather02.setPivot(-0.5F, 0.0F, 0.0F);
		leftStrutLowest.addChild(leftStrutLowestLeather02);
		setRotationAngle(leftStrutLowestLeather02, 0.0F, -0.2618F, 0.0F);
		leftStrutLowestLeather02.setTextureOffset(28, 28).addCuboid(0.0F, -1.0F, -9.0F, 0.0F, 12.0F, 9.0F, 0.0F, false);

		rightWing01 = new ModelPart(this);
		rightWing01.setPivot(6.0F, 0.0F, 0.0F);
		setRotationAngle(rightWing01, 0.0F, -1.5708F, -0.436332F);
		rightWing01.setTextureOffset(21, 0).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, 0.0F, true);
		leftWing.addChild(rightWing01);

		rightWing02 = new ModelPart(this);
		rightWing02.setPivot(0.5F, 0.0F, 3.5F);
		rightWing01.addChild(rightWing02);
		setRotationAngle(rightWing02, 0.6109F, -0.48F, 0.0F);
		rightWing02.setTextureOffset(0, 47).addCuboid(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 8.0F, 0.0F, true);

		rightWing03 = new ModelPart(this);
		rightWing03.setPivot(0.0F, 1.0F, 6.5F);
		rightWing02.addChild(rightWing03);
		setRotationAngle(rightWing03, -0.5672F, -0.3054F, 0.0F);
		rightWing03.setTextureOffset(39, 0).addCuboid(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 8.0F, 0.0F, true);

		rightWing04 = new ModelPart(this);
		rightWing04.setPivot(0.0F, 0.0F, 7.5F);
		rightWing03.addChild(rightWing04);
		setRotationAngle(rightWing04, -0.7418F, 0.0F, 0.0F);
		rightWing04.setTextureOffset(0, 0).addCuboid(-0.4F, -0.8F, -4.0F, 1.0F, 1.0F, 19.0F, 0.0F, true);

		rightWing04Leather = new ModelPart(this);
		rightWing04Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWing04.addChild(rightWing04Leather);
		rightWing04Leather.setTextureOffset(0, 28).addCuboid(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, 0.0F, true);

		rightWingStrut01 = new ModelPart(this);
		rightWingStrut01.setPivot(0.0F, 1.0F, 7.0F);
		rightWing03.addChild(rightWingStrut01);
		setRotationAngle(rightWingStrut01, -1.0036F, 0.0F, 0.0F);
		rightWingStrut01.setTextureOffset(21, 0).addCuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, true);

		rightWingStrut01Leather = new ModelPart(this);
		rightWingStrut01Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWingStrut01.addChild(rightWingStrut01Leather);
		rightWingStrut01Leather.setTextureOffset(0, 22).addCuboid(0.05F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, 0.0F, true);

		rightWingStrut02 = new ModelPart(this);
		rightWingStrut02.setPivot(0.0F, 1.0F, 6.0F);
		rightWing03.addChild(rightWingStrut02);
		setRotationAngle(rightWingStrut02, -1.309F, 0.0F, 0.0F);
		rightWingStrut02.setTextureOffset(21, 0).addCuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, true);

		rightWingStrut02Leather = new ModelPart(this);
		rightWingStrut02Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWingStrut02.addChild(rightWingStrut02Leather);
		rightWingStrut02Leather.setTextureOffset(0, 4).addCuboid(0.1F, 0.0F, -1.0F, 0.0F, 6.0F, 16.0F, 0.0F, true);

		rightWingStrut03 = new ModelPart(this);
		rightWingStrut03.setPivot(0.0F, 1.0F, 5.0F);
		rightWing03.addChild(rightWingStrut03);
		setRotationAngle(rightWingStrut03, -1.6581F, 0.0F, 0.0F);
		rightWingStrut03.setTextureOffset(21, 0).addCuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, true);

		rightWingStrut03Leather = new ModelPart(this);
		rightWingStrut03Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWingStrut03.addChild(rightWingStrut03Leather);
		rightWingStrut03Leather.setTextureOffset(0, 12).addCuboid(0.15F, 0.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, true);

		rightStrutLowest = new ModelPart(this);
		rightStrutLowest.setPivot(-0.5F, 1.0F, 2.0F);
		rightWing02.addChild(rightStrutLowest);
		setRotationAngle(rightStrutLowest, -0.3491F, 0.0F, 0.0F);
		rightStrutLowest.setTextureOffset(12, 0).addCuboid(0.1F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, true);

		rightStrutLowestLeather01 = new ModelPart(this);
		rightStrutLowestLeather01.setPivot(0.5F, 0.0F, 0.0F);
		rightStrutLowest.addChild(rightStrutLowestLeather01);
		rightStrutLowestLeather01.setTextureOffset(0, 0).addCuboid(0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 6.0F, 0.0F, true);

		rightStrutLowestLeather02 = new ModelPart(this);
		rightStrutLowestLeather02.setPivot(0.5F, 0.0F, 0.0F);
		rightStrutLowest.addChild(rightStrutLowestLeather02);
		setRotationAngle(rightStrutLowestLeather02, 0.0F, 0.2618F, 0.0F);
		rightStrutLowestLeather02.setTextureOffset(28, 28).addCuboid(0.0F, -1.0F, -9.0F, 0.0F, 12.0F, 9.0F, 0.0F, true);
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