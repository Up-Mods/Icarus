/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

public class ZanzasWingsModel/*<T extends LivingEntity> extends WingEntityModelOld<T>*/ {
	/*private final ModelPart lWing01;
	private final ModelPart lWing02;
	private final ModelPart lWingCircle;
	private final ModelPart cube_r1;
	private final ModelPart rWing01;
	private final ModelPart rWing02;
	private final ModelPart rWingCircle;
	private final ModelPart cube_r2;

	public ZanzasWingsModel() {
		textureWidth = 64;
		textureHeight = 64;
		lWing01 = new ModelPart(this);
		lWing01.setPivot(-6.0F, 0.0F, 0.0F);
		setRotationAngle(lWing01, 0.0F, 0.0F, 0.436332F);
		lWing01.setTextureOffset(0, 18).addCuboid(0.0F, -5.0F, 0.25F, 14.0F, 15.0F, 0.0F, 0.0F, false);
		rightWing.addChild(lWing01);

		lWing02 = new ModelPart(this);
		lWing02.setPivot(14.0F, 0.0F, 0.0F);
		lWing01.addChild(lWing02);
		setRotationAngle(lWing02, 0.0F, -0.2182F, 0.0F);
		lWing02.setTextureOffset(29, 17).addCuboid(0.0F, -6.0F, 0.25F, 17.0F, 17.0F, 0.0F, 0.0F, false);

		lWingCircle = new ModelPart(this);
		lWingCircle.setPivot(2.0F, 6.0F, 1.0F);
		lWing02.addChild(lWingCircle);
		setRotationAngle(lWingCircle, 0.0F, 0.0F, 0.0436F);

		cube_r1 = new ModelPart(this);
		cube_r1.setPivot(0.0F, 0.0F, 0.0F);
		lWingCircle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -2.3562F);
		cube_r1.setTextureOffset(0, 34).addCuboid(-7.5F, -8.5F, 0.25F, 13.0F, 13.0F, 0.0F, 0.0F, false);

		rWing01 = new ModelPart(this);
		rWing01.setPivot(6.0F, 0.0F, 0.0F);
		setRotationAngle(rWing01, 0.0F, 0.0F, -0.436332F);
		rWing01.setTextureOffset(0, 18).addCuboid(-14.0F, -5.0F, 0.25F, 14.0F, 15.0F, 0.0F, 0.0F, true);
		leftWing.addChild(rWing01);

		rWing02 = new ModelPart(this);
		rWing02.setPivot(-14.0F, 0.0F, 0.0F);
		rWing01.addChild(rWing02);
		setRotationAngle(rWing02, 0.0F, 0.2182F, 0.0F);
		rWing02.setTextureOffset(29, 17).addCuboid(-17.0F, -6.0F, 0.25F, 17.0F, 17.0F, 0.0F, 0.0F, true);

		rWingCircle = new ModelPart(this);
		rWingCircle.setPivot(-2.0F, 6.0F, 1.0F);
		rWing02.addChild(rWingCircle);
		setRotationAngle(rWingCircle, 0.0F, 0.0F, -0.0436F);

		cube_r2 = new ModelPart(this);
		cube_r2.setPivot(0.0F, 0.0F, 0.0F);
		rWingCircle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 2.3562F);
		cube_r2.setTextureOffset(0, 34).addCuboid(-5.5F, -8.5F, 0.25F, 13.0F, 13.0F, 0.0F, 0.0F, true);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}*/
}