// Made with Model Converter by Globox_Z
// Generate all required imports
/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.*;
import net.minecraft.entity.LivingEntity;

public class DiscordsWingsModel<T extends LivingEntity> extends WingEntityModel<T> {
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

	public DiscordsWingsModel(ModelPart root) {
		super(root);
		
		this.leftWing01 = root.getChild("leftWing").getChild("leftWing01");
		this.rightWing01 = root.getChild("rightWing").getChild("rightWing01");
		this.rightWing02 = this.rightWing01.getChild("rightWing02");
		this.rightStrutLowest = this.rightWing02.getChild("rightStrutLowest");
		this.rightStrutLowestLeather02 = this.rightStrutLowest.getChild("rightStrutLowestLeather02");
		this.rightStrutLowestLeather01 = this.rightStrutLowest.getChild("rightStrutLowestLeather01");
		this.rightWing03 = this.rightWing02.getChild("rightWing03");
		this.rightWingStrut03 = this.rightWing03.getChild("rightWingStrut03");
		this.rightWingStrut03Leather = this.rightWingStrut03.getChild("rightWingStrut03Leather");
		this.rightWingStrut02 = this.rightWing03.getChild("rightWingStrut02");
		this.rightWingStrut02Leather = this.rightWingStrut02.getChild("rightWingStrut02Leather");
		this.rightWingStrut01 = this.rightWing03.getChild("rightWingStrut01");
		this.rightWingStrut01Leather = this.rightWingStrut01.getChild("rightWingStrut01Leather");
		this.rightWing04 = this.rightWing03.getChild("rightWing04");
		this.rightWing04Leather = this.rightWing04.getChild("rightWing04Leather");
		this.leftWing02 = this.leftWing01.getChild("leftWing02");
		this.lFeathers01 = this.leftWing02.getChild("lFeathers01");
		this.Box_r2 = this.lFeathers01.getChild("Box_r2");
		this.leftWing03 = this.leftWing02.getChild("leftWing03");
		this.leftWing04 = this.leftWing03.getChild("leftWing04");
		this.lFeathers02 = this.leftWing04.getChild("lFeathers02");
		this.Box_r1 = this.lFeathers02.getChild("Box_r1");
		this.leftWing05 = this.leftWing04.getChild("leftWing05");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = WingEntityModel.getModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData modelPartData1 = modelPartData.getChild("leftWing").addChild("leftWing01", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F),
				ModelTransform.of(-6.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.436332F));
		ModelPartData modelPartData2 = modelPartData1.addChild("leftWing02", ModelPartBuilder.create().uv(17, 0)
				.cuboid(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F),
				ModelTransform.of(-0.5F, 0.0F, 3.5F, 0.6109F, 0.3054F, 0.0F));
		ModelPartData modelPartData3 = modelPartData2.addChild("leftWing03", ModelPartBuilder.create().uv(36, 0)
				.cuboid(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F),
				ModelTransform.of(0.0F, -1.0F, 8.5F, -0.5672F, 0.3054F, 0.0F));
		ModelPartData modelPartData4 = modelPartData3.addChild("leftWing04", ModelPartBuilder.create().uv(55, 0)
				.cuboid(-0.7F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, true),
				ModelTransform.of(0.0F, 0.5F, 7.2F, 1.0908F, 0.0F, 0.0F));
		modelPartData4.addChild("leftWing05", ModelPartBuilder.create().uv(32, 31)
				.cuboid(0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, true),
				ModelTransform.pivot(-0.5F, 4.8F, -0.2F));
		ModelPartData modelPartData5 = modelPartData4.addChild("lFeathers02", ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -3.5F, -3.2F, 0.0F, 0.0F, 0.0873F));
		modelPartData5.addChild("Box_r1", ModelPartBuilder.create().uv(0, 36)
				.cuboid(0.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, true),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		ModelPartData modelPartData6 = modelPartData2.addChild("lFeathers01", ModelPartBuilder.create(),
				ModelTransform.of(0.6F, 1.3F, 1.5F, -0.1745F, -0.0873F, 0.0F));
		modelPartData6.addChild("Box_r2", ModelPartBuilder.create().uv(0, 10)
				.cuboid(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, true),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		ModelPartData modelPartData7 = modelPartData.getChild("rightWing").addChild("rightWing01", ModelPartBuilder.create().uv(66, 0)
				.cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, true),
				ModelTransform.of(6.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.436332F));
		ModelPartData modelPartData8 = modelPartData7.addChild("rightWing02", ModelPartBuilder.create().uv(81, 0)
				.cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 8.0F, true),
				ModelTransform.of(0.5F, 0.0F, 3.5F, 0.6109F, -0.48F, 0.0F));
		ModelPartData modelPartData9 = modelPartData8.addChild("rightWing03", ModelPartBuilder.create().uv(101, 0)
				.cuboid(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 8.0F, true),
				ModelTransform.of(0.0F, 1.0F, 6.5F, -0.5672F, -0.3054F, 0.0F));
		ModelPartData modelPartData10 = modelPartData9.addChild("rightWing04", ModelPartBuilder.create().uv(60, 13)
				.cuboid(-0.4F, -0.8F, -4.0F, 1.0F, 1.0F, 19.0F, true),
				ModelTransform.of(0.0F, 0.0F, 7.5F, -0.7418F, 0.0F, 0.0F));
		modelPartData10.addChild("rightWing04Leather", ModelPartBuilder.create().uv(95, 40)
				.cuboid(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, true),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		ModelPartData modelPartData11 = modelPartData9.addChild("rightWingStrut01", ModelPartBuilder.create().uv(83, 12)
				.cuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, true),
				ModelTransform.of(0.0F, 1.0F, 7.0F, -1.0036F, 0.0F, 0.0F));
		modelPartData11.addChild("rightWingStrut01Leather", ModelPartBuilder.create().uv(95, 34)
				.cuboid(0.05F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, true),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		ModelPartData modelPartData12 = modelPartData9.addChild("rightWingStrut02", ModelPartBuilder.create().uv(83, 12)
				.cuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, true),
				ModelTransform.of(0.0F, 1.0F, 6.0F, -1.309F, 0.0F, 0.0F));
		modelPartData12.addChild("rightWingStrut02Leather", ModelPartBuilder.create().uv(93, 25)
				.cuboid(0.1F, 0.0F, -1.0F, 0.0F, 6.0F, 16.0F, true),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		ModelPartData modelPartData13 = modelPartData9.addChild("rightWingStrut03", ModelPartBuilder.create().uv(83, 12)
				.cuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, true),
				ModelTransform.of(0.0F, 1.0F, 5.0F, -1.6581F, 0.0F, 0.0F));
		modelPartData13.addChild("rightWingStrut03Leather", ModelPartBuilder.create().uv(93, 19)
				.cuboid(0.15F, 0.0F, 0.0F, 0.0F, 6.0F, 15.0F, true),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		ModelPartData modelPartData14 = modelPartData8.addChild("rightStrutLowest", ModelPartBuilder.create().uv(104, 12)
				.cuboid(0.1F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, true),
				ModelTransform.of(-0.5F, 1.0F, 2.0F, -0.3491F, 0.0F, 0.0F));
		modelPartData14.addChild("rightStrutLowestLeather01", ModelPartBuilder.create().uv(79, 28)
				.cuboid(0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 6.0F, true),
				ModelTransform.pivot(0.5F, 0.0F, 0.0F));
		modelPartData14.addChild("rightStrutLowestLeather02", ModelPartBuilder.create().uv(60, 25)
				.cuboid(0.0F, -1.0F, -9.0F, 0.0F, 12.0F, 9.0F, true),
				ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		return TexturedModelData.of(modelData, 128, 64);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
		if(state == State.IDLE || state == State.CROUCHING)
			leftWing03.pitch = (float) Math.toRadians(-60);
		if(state == State.FLYING)
			leftWing03.pitch = (float) Math.toRadians(-32.5);
		rightWing03.pitch = leftWing03.pitch;
	}
}