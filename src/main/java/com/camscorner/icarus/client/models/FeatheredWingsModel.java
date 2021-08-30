// Made with Model Converter by Globox_Z
// Generate all required imports
/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.*;
import net.minecraft.entity.LivingEntity;

public class FeatheredWingsModel<T extends LivingEntity> extends WingEntityModel<T> {
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

	public FeatheredWingsModel(ModelPart root) {
		super(root);

		this.leftWing01 = root.getChild("leftWing").getChild("leftWing01");
		this.rightWing01 = root.getChild("rightWing").getChild("rightWing01");
		this.rightWing02 = this.rightWing01.getChild("rightWing02");
		this.rFeathers01 = this.rightWing02.getChild("rFeathers01");
		this.Box_r4 = this.rFeathers01.getChild("Box_r4");
		this.rightWing03 = this.rightWing02.getChild("rightWing03");
		this.rightWing04 = this.rightWing03.getChild("rightWing04");
		this.rFeathers02 = this.rightWing04.getChild("rFeathers02");
		this.Box_r3 = this.rFeathers02.getChild("Box_r3");
		this.rightWing05 = this.rightWing04.getChild("rightWing05");
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
		ModelPartData modelPartData2 = modelPartData1.addChild("leftWing02", ModelPartBuilder.create().uv(0, 47)
				.cuboid(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F), 
				ModelTransform.of(-0.5F, 0.0F, 3.5F, 0.1309F, 0.3054F, 0.0F));
		ModelPartData modelPartData3 = modelPartData2.addChild("leftWing03", ModelPartBuilder.create().uv(39, 0)
				.cuboid(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F),
				ModelTransform.of(0.0F, -1.0F, 8.5F, -0.5672F, 0.3054F, 0.0F));
		ModelPartData modelPartData4 = modelPartData3.addChild("leftWing04", ModelPartBuilder.create().uv(33, 25)
				.cuboid(-0.7F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, true),
				ModelTransform.of(0.0F, 0.5F, 7.2F, 1.0908F, 0.0F, 0.0F));
		modelPartData4.addChild("leftWing05", ModelPartBuilder.create().uv(0, 13)
				.cuboid(0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, true),
				ModelTransform.pivot(-0.5F, 4.8F, -0.2F));
		ModelPartData modelPartData5 = modelPartData4.addChild("lFeathers02", ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -3.5F, -3.2F, 0.0F, 0.0F, 0.0873F));
		modelPartData5.addChild("Box_r1", ModelPartBuilder.create().uv(26, 26)
				.cuboid(0.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, true),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		ModelPartData modelPartData6 = modelPartData2.addChild("lFeathers01", ModelPartBuilder.create(),
				ModelTransform.of(0.6F, 1.3F, 1.5F, -0.1745F, -0.0873F, 0.0F));
		modelPartData6.addChild("Box_r2", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, true),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		ModelPartData modelPartData7 = modelPartData.getChild("rightWing").addChild("rightWing01", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F, true),
				ModelTransform.of(6.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.436332F));
		ModelPartData modelPartData8 = modelPartData7.addChild("rightWing02", ModelPartBuilder.create().uv(0, 47)
				.cuboid(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F, true),
				ModelTransform.of(0.5F, 0.0F, 3.5F, 0.1309F, -0.3054F, 0.0F));
		ModelPartData modelPartData9 = modelPartData8.addChild("rightWing03", ModelPartBuilder.create().uv(39, 0)
				.cuboid(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F, true),
				ModelTransform.of(0.0F, -1.0F, 8.5F, -0.5672F, -0.3054F, 0.0F));
		ModelPartData modelPartData10 = modelPartData9.addChild("rightWing04", ModelPartBuilder.create().uv(33, 25)
				.cuboid(-0.3F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F),
				ModelTransform.of(0.0F, 0.5F, 7.2F, 1.0908F, 0.0F, 0.0F));
		modelPartData10.addChild("rightWing05", ModelPartBuilder.create().uv(0, 13)
				.cuboid(-0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F),
				ModelTransform.pivot(0.5F, 4.8F, -0.2F));
		ModelPartData modelPartData11 = modelPartData10.addChild("rFeathers02", ModelPartBuilder.create(),
				ModelTransform.of(0.0F, -3.5F, -3.2F, 0.0F, 0.0F, -0.0873F));
		modelPartData11.addChild("Box_r3", ModelPartBuilder.create().uv(26, 26)
				.cuboid(-1.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		ModelPartData modelPartData12 = modelPartData8.addChild("rFeathers01", ModelPartBuilder.create(),
				ModelTransform.of(-0.6F, 1.3F, 1.5F, -0.1745F, 0.0873F, 0.0F));
		modelPartData12.addChild("Box_r4", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
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