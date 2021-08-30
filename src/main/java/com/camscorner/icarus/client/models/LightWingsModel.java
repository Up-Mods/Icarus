// Made with Model Converter by Globox_Z
// Generate all required imports
/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.*;
import net.minecraft.entity.LivingEntity;

public class LightWingsModel<T extends LivingEntity> extends WingEntityModel<T> {
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

	public LightWingsModel(ModelPart root) {
		super(root);

		this.rWingMain = root.getChild("rightWing").getChild("rWingMain");
		this.rWing01 = this.rWingMain.getChild("rWing01");
		this.rWing02 = this.rWingMain.getChild("rWing02");
		this.rWing03 = this.rWingMain.getChild("rWing03");
		this.rWing04 = this.rWingMain.getChild("rWing04");
		this.rWing05 = this.rWingMain.getChild("rWing05");
		this.lWingMain = root.getChild("leftWing").getChild("lWingMain");
		this.lWing01 = this.lWingMain.getChild("lWing01");
		this.lWing02 = this.lWingMain.getChild("lWing02");
		this.lWing03 = this.lWingMain.getChild("lWing03");
		this.lWing04 = this.lWingMain.getChild("lWing04");
		this.lWing05 = this.lWingMain.getChild("lWing05");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = WingEntityModel.getModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData modelPartData1 = modelPartData.getChild("rightWing").addChild("rWingMain", ModelPartBuilder.create(),
				ModelTransform.of(8.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.836332F));
		modelPartData1.addChild("rWing01", ModelPartBuilder.create().uv(26, 18)
				.cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 13.0F, 0.0F, true),
				ModelTransform.of(-3.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.3054F));
		modelPartData1.addChild("rWing02", ModelPartBuilder.create().uv(25, 12)
				.cuboid(-1.5F, -4.0F, 0.0F, 3.0F, 19.0F, 0.0F, true),
				ModelTransform.of(-6.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.48F));
		modelPartData1.addChild("rWing03", ModelPartBuilder.create().uv(25, 8)
				.cuboid(-1.5F, -4.0F, 0.0F, 3.0F, 23.0F, 0.0F, true),
				ModelTransform.of(-9.5F, -5.0F, 1.0F, 0.0F, 0.0F, 0.6981F));
		modelPartData1.addChild("rWing04", ModelPartBuilder.create().uv(19, 16)
				.cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 15.0F, 0.0F, true),
				ModelTransform.of(-12.0F, -7.75F, 1.0F, 0.0F, 0.0F, 0.9599F));
		modelPartData1.addChild("rWing05", ModelPartBuilder.create().uv(12, 21)
				.cuboid(-0.5F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F, true),
				ModelTransform.of(-12.25F, -11.75F, 1.0F, 0.0F, 0.0F, 1.0908F));
		ModelPartData modelPartData2 = modelPartData.getChild("leftWing").addChild("lWingMain", ModelPartBuilder.create(),
				ModelTransform.of(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.836332F));
		modelPartData2.addChild("lWing01", ModelPartBuilder.create().uv(26, 18)
				.cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 13.0F, 0.0F),
				ModelTransform.of(3.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.3054F));
		modelPartData2.addChild("lWing02", ModelPartBuilder.create().uv(25, 12)
				.cuboid(-1.5F, -4.0F, 0.0F, 3.0F, 19.0F, 0.0F),
				ModelTransform.of(6.0F, -3.0F, 1.0F, 0.0F, 0.0F, -0.48F));
		modelPartData2.addChild("lWing03", ModelPartBuilder.create().uv(25, 8)
				.cuboid(-1.5F, -4.0F, 0.0F, 3.0F, 23.0F, 0.0F),
				ModelTransform.of(9.5F, -5.0F, 1.0F, 0.0F, 0.0F, -0.6981F));
		modelPartData2.addChild("lWing04", ModelPartBuilder.create().uv(19, 16)
				.cuboid(-1.0F, -4.0F, 0.0F, 2.0F, 15.0F, 0.0F),
				ModelTransform.of(12.0F, -7.75F, 1.0F, 0.0F, 0.0F, -0.9599F));
		modelPartData2.addChild("lWing05", ModelPartBuilder.create().uv(12, 21)
				.cuboid(-1.5F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F),
				ModelTransform.of(12.25F, -11.75F, 1.0F, 0.0F, 0.0F, -1.0908F));

		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
	}
}