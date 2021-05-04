/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.entity.LivingEntity;

public class LightWingsModel<T extends LivingEntity> extends WingEntityModel<T>
{
	private final ModelPart rWingMain;
	private final ModelPart rWing01;
	private final ModelPart rWing02;
	private final ModelPart rWing03;
	private final ModelPart rWing04;
	private final ModelPart rWing05;
	private final ModelPart lWingMain;
	private final ModelPart lWing01;
	private final ModelPart lWing02;
	private final ModelPart lWing03;
	private final ModelPart lWing04;
	private final ModelPart lWing05;

	public LightWingsModel()
	{
		textureWidth = 32;
		textureHeight = 32;
		rWingMain = new ModelPart(this);
		rWingMain.setPivot(8.0F, 0.0F, 0.0F);
		setRotationAngle(rWingMain, 0.0F, 0.0F, -0.836332F);
		leftWing.addChild(rWingMain);

		rWing01 = new ModelPart(this);
		rWing01.setPivot(-3.0F, -1.0F, 1.0F);
		rWingMain.addChild(rWing01);
		setRotationAngle(rWing01, 0.0F, 0.0F, 0.3054F);
		rWing01.setTextureOffset(26, 18).addCuboid(-1.0F, -4.0F, 0.0F, 2.0F, 13.0F, 0.0F, 0.0F, true);

		rWing02 = new ModelPart(this);
		rWing02.setPivot(-6.0F, -3.0F, 1.0F);
		rWingMain.addChild(rWing02);
		setRotationAngle(rWing02, 0.0F, 0.0F, 0.48F);
		rWing02.setTextureOffset(25, 12).addCuboid(-1.5F, -4.0F, 0.0F, 3.0F, 19.0F, 0.0F, 0.0F, true);

		rWing03 = new ModelPart(this);
		rWing03.setPivot(-9.5F, -5.0F, 1.0F);
		rWingMain.addChild(rWing03);
		setRotationAngle(rWing03, 0.0F, 0.0F, 0.6981F);
		rWing03.setTextureOffset(25, 8).addCuboid(-1.5F, -4.0F, 0.0F, 3.0F, 23.0F, 0.0F, 0.0F, true);

		rWing04 = new ModelPart(this);
		rWing04.setPivot(-12.0F, -7.75F, 1.0F);
		rWingMain.addChild(rWing04);
		setRotationAngle(rWing04, 0.0F, 0.0F, 0.9599F);
		rWing04.setTextureOffset(19, 16).addCuboid(-1.0F, -4.0F, 0.0F, 2.0F, 15.0F, 0.0F, 0.0F, true);

		rWing05 = new ModelPart(this);
		rWing05.setPivot(-12.25F, -11.75F, 1.0F);
		rWingMain.addChild(rWing05);
		setRotationAngle(rWing05, 0.0F, 0.0F, 1.0908F);
		rWing05.setTextureOffset(12, 21).addCuboid(-0.5F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F, 0.0F, true);

		lWingMain = new ModelPart(this);
		lWingMain.setPivot(-8.0F, 0.0F, 0.0F);
		setRotationAngle(lWingMain, 0.0F, 0.0F, 0.836332F);
		rightWing.addChild(lWingMain);

		lWing01 = new ModelPart(this);
		lWing01.setPivot(3.0F, -1.0F, 1.0F);
		lWingMain.addChild(lWing01);
		setRotationAngle(lWing01, 0.0F, 0.0F, -0.3054F);
		lWing01.setTextureOffset(26, 18).addCuboid(-1.0F, -4.0F, 0.0F, 2.0F, 13.0F, 0.0F, 0.0F, false);

		lWing02 = new ModelPart(this);
		lWing02.setPivot(6.0F, -3.0F, 1.0F);
		lWingMain.addChild(lWing02);
		setRotationAngle(lWing02, 0.0F, 0.0F, -0.48F);
		lWing02.setTextureOffset(25, 12).addCuboid(-1.5F, -4.0F, 0.0F, 3.0F, 19.0F, 0.0F, 0.0F, false);

		lWing03 = new ModelPart(this);
		lWing03.setPivot(9.5F, -5.0F, 1.0F);
		lWingMain.addChild(lWing03);
		setRotationAngle(lWing03, 0.0F, 0.0F, -0.6981F);
		lWing03.setTextureOffset(25, 8).addCuboid(-1.5F, -4.0F, 0.0F, 3.0F, 23.0F, 0.0F, 0.0F, false);

		lWing04 = new ModelPart(this);
		lWing04.setPivot(12.0F, -7.75F, 1.0F);
		lWingMain.addChild(lWing04);
		setRotationAngle(lWing04, 0.0F, 0.0F, -0.9599F);
		lWing04.setTextureOffset(19, 16).addCuboid(-1.0F, -4.0F, 0.0F, 2.0F, 15.0F, 0.0F, 0.0F, false);

		lWing05 = new ModelPart(this);
		lWing05.setPivot(12.25F, -11.75F, 1.0F);
		lWingMain.addChild(lWing05);
		setRotationAngle(lWing05, 0.0F, 0.0F, -1.0908F);
		lWing05.setTextureOffset(12, 21).addCuboid(-1.5F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
	{
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z)
	{
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

}