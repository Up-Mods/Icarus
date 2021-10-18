// Made with Model Converter by Globox_Z
// Generate all required imports
/*
 * Model by cybercat5555
 */
package dev.cammiescorner.icarus.client.models;

import net.minecraft.client.model.*;
import net.minecraft.entity.LivingEntity;

public class ZanzasWingsModel<T extends LivingEntity> extends WingEntityModel<T> {
	private final ModelPart lWing01;
	private final ModelPart lWing02;
	private final ModelPart lWingCircle;
	private final ModelPart cube_r1;
	private final ModelPart rWing01;
	private final ModelPart rWing02;
	private final ModelPart rWingCircle;
	private final ModelPart cube_r2;

	public ZanzasWingsModel(ModelPart root) {
		super(root);

		this.lWing01 = root.getChild("leftWing").getChild("lWing01");
		this.lWing02 = this.lWing01.getChild("lWing02");
		this.lWingCircle = this.lWing02.getChild("lWingCircle");
		this.cube_r1 = this.lWingCircle.getChild("cube_r1");
		this.rWing01 = root.getChild("rightWing").getChild("rWing01");
		this.rWing02 = this.rWing01.getChild("rWing02");
		this.rWingCircle = this.rWing02.getChild("rWingCircle");
		this.cube_r2 = this.rWingCircle.getChild("cube_r2");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = getModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData modelPartData1 = modelPartData.getChild("leftWing").addChild("lWing01", ModelPartBuilder.create().uv(0, 18)
				.cuboid(0.0F, -5.0F, 0.25F, 14.0F, 15.0F, 0.0F),
				ModelTransform.of(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.436332F));
		ModelPartData modelPartData2 = modelPartData1.addChild("lWing02", ModelPartBuilder.create().uv(29, 17)
				.cuboid(0.0F, -6.0F, 0.25F, 17.0F, 17.0F, 0.0F),
				ModelTransform.of(14.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		ModelPartData modelPartData3 = modelPartData2.addChild("lWingCircle", ModelPartBuilder.create(),
				ModelTransform.of(2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0436F));
		modelPartData3.addChild("cube_r1", ModelPartBuilder.create().uv(0, 34)
				.cuboid(-7.5F, -8.5F, 0.25F, 13.0F, 13.0F, 0.0F),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3562F));
		ModelPartData modelPartData4 = modelPartData.getChild("rightWing").addChild("rWing01", ModelPartBuilder.create().uv(0, 18)
				.cuboid(-14.0F, -5.0F, 0.25F, 14.0F, 15.0F, 0.0F, true),
				ModelTransform.of(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.436332F));
		ModelPartData modelPartData5 = modelPartData4.addChild("rWing02", ModelPartBuilder.create().uv(29, 17)
				.cuboid(-17.0F, -6.0F, 0.25F, 17.0F, 17.0F, 0.0F, true),
				ModelTransform.of(-14.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));
		ModelPartData modelPartData6 = modelPartData5.addChild("rWingCircle", ModelPartBuilder.create(),
				ModelTransform.of(-2.0F, 6.0F, 1.0F, 0.0F, 0.0F, -0.0436F));
		modelPartData6.addChild("cube_r2", ModelPartBuilder.create().uv(0, 34)
				.cuboid(-5.5F, -8.5F, 0.25F, 13.0F, 13.0F, 0.0F, true),
				ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.3562F));

		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
	}
}