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

	public static LayerDefinition getLayerDefinition() {
		MeshDefinition modelData = WingEntityModel.getModelData();
		PartDefinition modelPartData = modelData.getRoot();

		PartDefinition modelPartData1 = modelPartData.getChild("leftWing").addOrReplaceChild("leftWing01", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.436332F));
		PartDefinition modelPartData2 = modelPartData1.addOrReplaceChild("leftWing02", CubeListBuilder.create().texOffs(17, 0)
				.addBox(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 3.5F, 0.6109F, 0.3054F, 0.0F));
		PartDefinition modelPartData3 = modelPartData2.addOrReplaceChild("leftWing03", CubeListBuilder.create().texOffs(36, 0)
				.addBox(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F),
				PartPose.offsetAndRotation(0.0F, -1.0F, 8.5F, -0.5672F, 0.3054F, 0.0F));
		PartDefinition modelPartData4 = modelPartData3.addOrReplaceChild("leftWing04", CubeListBuilder.create().texOffs(55, 0)
				.addBox(-0.7F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.5F, 7.2F, 1.0908F, 0.0F, 0.0F));
		modelPartData4.addOrReplaceChild("leftWing05", CubeListBuilder.create().texOffs(32, 31)
				.addBox(0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, true),
				PartPose.offset(-0.5F, 4.8F, -0.2F));
		PartDefinition modelPartData5 = modelPartData4.addOrReplaceChild("lFeathers02", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.5F, -3.2F, 0.0F, 0.0F, 0.0873F));
		modelPartData5.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(0, 36)
				.addBox(0.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition modelPartData6 = modelPartData2.addOrReplaceChild("lFeathers01", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.6F, 1.3F, 1.5F, -0.1745F, -0.0873F, 0.0F));
		modelPartData6.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(0, 10)
				.addBox(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition modelPartData7 = modelPartData.getChild("rightWing").addOrReplaceChild("rightWing01", CubeListBuilder.create().texOffs(66, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 5.0F, true),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.436332F));
		PartDefinition modelPartData8 = modelPartData7.addOrReplaceChild("rightWing02", CubeListBuilder.create().texOffs(81, 0)
				.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 8.0F, true),
				PartPose.offsetAndRotation(0.5F, 0.0F, 3.5F, 0.6109F, -0.48F, 0.0F));
		PartDefinition modelPartData9 = modelPartData8.addOrReplaceChild("rightWing03", CubeListBuilder.create().texOffs(101, 0)
				.addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 8.0F, true),
				PartPose.offsetAndRotation(0.0F, 1.0F, 6.5F, -0.5672F, -0.3054F, 0.0F));
		PartDefinition modelPartData10 = modelPartData9.addOrReplaceChild("rightWing04", CubeListBuilder.create().texOffs(60, 13)
				.addBox(-0.4F, -0.8F, -4.0F, 1.0F, 1.0F, 19.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.5F, -0.7418F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("rightWing04Leather", CubeListBuilder.create().texOffs(95, 40)
				.addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, true),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition modelPartData11 = modelPartData9.addOrReplaceChild("rightWingStrut01", CubeListBuilder.create().texOffs(83, 12)
				.addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, true),
				PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, -1.0036F, 0.0F, 0.0F));
		modelPartData11.addOrReplaceChild("rightWingStrut01Leather", CubeListBuilder.create().texOffs(95, 34)
				.addBox(0.05F, 0.0F, 0.0F, 0.0F, 5.0F, 14.0F, true),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition modelPartData12 = modelPartData9.addOrReplaceChild("rightWingStrut02", CubeListBuilder.create().texOffs(83, 12)
				.addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, true),
				PartPose.offsetAndRotation(0.0F, 1.0F, 6.0F, -1.309F, 0.0F, 0.0F));
		modelPartData12.addOrReplaceChild("rightWingStrut02Leather", CubeListBuilder.create().texOffs(93, 25)
				.addBox(0.1F, 0.0F, -1.0F, 0.0F, 6.0F, 16.0F, true),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition modelPartData13 = modelPartData9.addOrReplaceChild("rightWingStrut03", CubeListBuilder.create().texOffs(83, 12)
				.addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 16.0F, true),
				PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -1.6581F, 0.0F, 0.0F));
		modelPartData13.addOrReplaceChild("rightWingStrut03Leather", CubeListBuilder.create().texOffs(93, 19)
				.addBox(0.15F, 0.0F, 0.0F, 0.0F, 6.0F, 15.0F, true),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition modelPartData14 = modelPartData8.addOrReplaceChild("rightStrutLowest", CubeListBuilder.create().texOffs(104, 12)
				.addBox(0.1F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, true),
				PartPose.offsetAndRotation(-0.5F, 1.0F, 2.0F, -0.3491F, 0.0F, 0.0F));
		modelPartData14.addOrReplaceChild("rightStrutLowestLeather01", CubeListBuilder.create().texOffs(79, 28)
				.addBox(0.0F, -1.0F, 0.0F, 0.0F, 12.0F, 6.0F, true),
				PartPose.offset(0.5F, 0.0F, 0.0F));
		modelPartData14.addOrReplaceChild("rightStrutLowestLeather02", CubeListBuilder.create().texOffs(60, 25)
				.addBox(0.0F, -1.0F, -9.0F, 0.0F, 12.0F, 9.0F, true),
				PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		return LayerDefinition.create(modelData, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setupAnim(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
		if(state == State.IDLE || state == State.CROUCHING)
			leftWing03.xRot = (float) Math.toRadians(-60);
		if(state == State.FLYING)
			leftWing03.xRot = (float) Math.toRadians(-32.5);
		rightWing03.xRot = leftWing03.xRot;
	}
}
