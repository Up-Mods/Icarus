/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

public class DiscordsWingsModel {//<T extends LivingEntity> extends WingEntityModelOld<T> {
	/*private final ModelPart leftWing01;
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

	public DiscordsWingsModel() {
		textureWidth = 128;
		textureHeight = 64;
		leftWing01 = new ModelPart(this);
		leftWing01.setPivot(-6.0F, 0.0F, 0.0F);
		setRotationAngle(leftWing01, 0.0F, 1.5708F, 0.436332F);
		leftWing01.setTextureOffset(0, 0).addCuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		rightWing.addChild(leftWing01);

		leftWing02 = new ModelPart(this);
		leftWing02.setPivot(-0.5F, 0.0F, 3.5F);
		leftWing01.addChild(leftWing02);
		setRotationAngle(leftWing02, 0.6109F, 0.3054F, 0.0F);
		leftWing02.setTextureOffset(17, 0).addCuboid(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftWing03 = new ModelPart(this);
		leftWing03.setPivot(0.0F, -1.0F, 8.5F);
		leftWing02.addChild(leftWing03);
		setRotationAngle(leftWing03, -0.5672F, 0.3054F, 0.0F);
		leftWing03.setTextureOffset(36, 0).addCuboid(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftWing04 = new ModelPart(this);
		leftWing04.setPivot(0.0F, 0.5F, 7.2F);
		leftWing03.addChild(leftWing04);
		setRotationAngle(leftWing04, 1.0908F, 0.0F, 0.0F);
		leftWing04.setTextureOffset(55, 0).addCuboid(-0.7F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, true);

		leftWing05 = new ModelPart(this);
		leftWing05.setPivot(-0.5F, 4.8F, -0.2F);
		leftWing04.addChild(leftWing05);
		leftWing05.setTextureOffset(32, 31).addCuboid(0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, 0.0F, true);

		lFeathers02 = new ModelPart(this);
		lFeathers02.setPivot(0.0F, -3.5F, -3.2F);
		leftWing04.addChild(lFeathers02);
		setRotationAngle(lFeathers02, 0.0F, 0.0F, 0.0873F);

		Box_r1 = new ModelPart(this);
		Box_r1.setPivot(0.0F, 0.0F, 0.0F);
		lFeathers02.addChild(Box_r1);
		setRotationAngle(Box_r1, 0.48F, 0.0F, 0.0F);
		Box_r1.setTextureOffset(0, 36).addCuboid(0.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, 0.0F, true);

		lFeathers01 = new ModelPart(this);
		lFeathers01.setPivot(0.6F, 1.3F, 1.5F);
		leftWing02.addChild(lFeathers01);
		setRotationAngle(lFeathers01, -0.1745F, -0.0873F, 0.0F);

		Box_r2 = new ModelPart(this);
		Box_r2.setPivot(0.0F, 0.0F, 0.0F);
		lFeathers01.addChild(Box_r2);
		setRotationAngle(Box_r2, 0.1745F, 0.0F, 0.0F);
		Box_r2.setTextureOffset(0, 10).addCuboid(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, 0.0F, true);

		rightWing01 = new ModelPart(this);
		rightWing01.setPivot(6.0F, 0.0F, 0.0F);
		setRotationAngle(rightWing01, 0.0F, -1.5708F, -0.436332F);
		rightWing01.setTextureOffset(66, 0).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, 0.0F, true);
		leftWing.addChild(rightWing01);

		rightWing02 = new ModelPart(this);
		rightWing02.setPivot(0.5F, 0.0F, 3.5F);
		rightWing01.addChild(rightWing02);
		setRotationAngle(rightWing02, 0.6109F, -0.48F, 0.0F);
		rightWing02.setTextureOffset(81, 0).addCuboid(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 8.0F, 0.0F, true);

		rightWing03 = new ModelPart(this);
		rightWing03.setPivot(0.0F, 1.0F, 6.5F);
		rightWing02.addChild(rightWing03);
		setRotationAngle(rightWing03, -0.5672F, -0.3054F, 0.0F);
		rightWing03.setTextureOffset(101, 0).addCuboid(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 8.0F, 0.0F, true);

		rightWing04 = new ModelPart(this);
		rightWing04.setPivot(0.0F, 0.0F, 7.5F);
		rightWing03.addChild(rightWing04);
		setRotationAngle(rightWing04, -0.7418F, 0.0F, 0.0F);
		rightWing04.setTextureOffset(60, 13).addCuboid(-0.4F, -0.8F, -4.0F, 1.0F, 1.0F, 19.0F, 0.0F, true);

		rightWing04Leather = new ModelPart(this);
		rightWing04Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWing04.addChild(rightWing04Leather);
		rightWing04Leather.setTextureOffset(95, 40).addCuboid(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, 0.0F, true);

		rightWingStrut01 = new ModelPart(this);
		rightWingStrut01.setPivot(0.0F, 1.0F, 7.0F);
		rightWing03.addChild(rightWingStrut01);
		setRotationAngle(rightWingStrut01, -1.0036F, 0.0F, 0.0F);
		rightWingStrut01.setTextureOffset(83, 12).addCuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, true);

		rightWingStrut01Leather = new ModelPart(this);
		rightWingStrut01Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWingStrut01.addChild(rightWingStrut01Leather);
		rightWingStrut01Leather.setTextureOffset(95, 34).addCuboid(0.05F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, 0.0F, true);

		rightWingStrut02 = new ModelPart(this);
		rightWingStrut02.setPivot(0.0F, 1.0F, 6.0F);
		rightWing03.addChild(rightWingStrut02);
		setRotationAngle(rightWingStrut02, -1.309F, 0.0F, 0.0F);
		rightWingStrut02.setTextureOffset(83, 12).addCuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, true);

		rightWingStrut02Leather = new ModelPart(this);
		rightWingStrut02Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWingStrut02.addChild(rightWingStrut02Leather);
		rightWingStrut02Leather.setTextureOffset(93, 25).addCuboid(0.1F, 0.0F, -1.0F, 0.0F, 6.0F, 16.0F, 0.0F, true);

		rightWingStrut03 = new ModelPart(this);
		rightWingStrut03.setPivot(0.0F, 1.0F, 5.0F);
		rightWing03.addChild(rightWingStrut03);
		setRotationAngle(rightWingStrut03, -1.6581F, 0.0F, 0.0F);
		rightWingStrut03.setTextureOffset(83, 12).addCuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, 0.0F, true);

		rightWingStrut03Leather = new ModelPart(this);
		rightWingStrut03Leather.setPivot(0.0F, 0.0F, 0.0F);
		rightWingStrut03.addChild(rightWingStrut03Leather);
		rightWingStrut03Leather.setTextureOffset(93, 19).addCuboid(0.15F, 0.0F, 0.0F, 0.0F, 6.0F, 15.0F, 0.0F, true);

		rightStrutLowest = new ModelPart(this);
		rightStrutLowest.setPivot(-0.5F, 1.0F, 2.0F);
		rightWing02.addChild(rightStrutLowest);
		setRotationAngle(rightStrutLowest, -0.3491F, 0.0F, 0.0F);
		rightStrutLowest.setTextureOffset(104, 12).addCuboid(0.1F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, true);

		rightStrutLowestLeather01 = new ModelPart(this);
		rightStrutLowestLeather01.setPivot(0.5F, 0.0F, 0.0F);
		rightStrutLowest.addChild(rightStrutLowestLeather01);
		rightStrutLowestLeather01.setTextureOffset(79, 28).addCuboid(0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 6.0F, 0.0F, true);

		rightStrutLowestLeather02 = new ModelPart(this);
		rightStrutLowestLeather02.setPivot(0.5F, 0.0F, 0.0F);
		rightStrutLowest.addChild(rightStrutLowestLeather02);
		setRotationAngle(rightStrutLowestLeather02, 0.0F, 0.2618F, 0.0F);
		rightStrutLowestLeather02.setTextureOffset(60, 25).addCuboid(0.0F, -1.0F, -9.0F, 0.0F, 12.0F, 9.0F, 0.0F, true);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);

		if(state == WingEntityModelOld.State.IDLE || state == State.CROUCHING)
			leftWing03.pitch = (float) Math.toRadians(-60);
		if(state == State.FLYING)
			leftWing03.pitch = (float) Math.toRadians(-32.5);

		rightWing03.pitch = leftWing03.pitch;
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}*/
}