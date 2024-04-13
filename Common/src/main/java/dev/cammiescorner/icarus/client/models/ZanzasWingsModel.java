// Made with Model Converter by Globox_Z
// Generate all required imports
/*
 * Model by cybercat5555
 */
package dev.cammiescorner.icarus.client.models;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.LivingEntity;

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

	public static LayerDefinition getLayerDefinition() {
		MeshDefinition modelData = getModelData();
		PartDefinition modelPartData = modelData.getRoot();

		PartDefinition modelPartData1 = modelPartData.getChild("leftWing").addOrReplaceChild("lWing01", CubeListBuilder.create().texOffs(0, 18)
				.addBox(0.0F, -5.0F, 0.25F, 14.0F, 15.0F, 0.0F),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.436332F));
		PartDefinition modelPartData2 = modelPartData1.addOrReplaceChild("lWing02", CubeListBuilder.create().texOffs(29, 17)
				.addBox(0.0F, -6.0F, 0.25F, 17.0F, 17.0F, 0.0F),
				PartPose.offsetAndRotation(14.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition modelPartData3 = modelPartData2.addOrReplaceChild("lWingCircle", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0436F));
		modelPartData3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-7.5F, -8.5F, 0.25F, 13.0F, 13.0F, 0.0F),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3562F));
		PartDefinition modelPartData4 = modelPartData.getChild("rightWing").addOrReplaceChild("rWing01", CubeListBuilder.create().texOffs(0, 18)
				.addBox(-14.0F, -5.0F, 0.25F, 14.0F, 15.0F, 0.0F, true),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.436332F));
		PartDefinition modelPartData5 = modelPartData4.addOrReplaceChild("rWing02", CubeListBuilder.create().texOffs(29, 17)
				.addBox(-17.0F, -6.0F, 0.25F, 17.0F, 17.0F, 0.0F, true),
				PartPose.offsetAndRotation(-14.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition modelPartData6 = modelPartData5.addOrReplaceChild("rWingCircle", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 6.0F, 1.0F, 0.0F, 0.0F, -0.0436F));
		modelPartData6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-5.5F, -8.5F, 0.25F, 13.0F, 13.0F, 0.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.3562F));

		return LayerDefinition.create(modelData, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setupAnim(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
	}
}
