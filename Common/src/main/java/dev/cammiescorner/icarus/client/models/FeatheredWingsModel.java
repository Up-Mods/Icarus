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

	public static LayerDefinition getLayerDefinition() {
		MeshDefinition modelData = getModelData();
		PartDefinition modelPartData = modelData.getRoot();

		PartDefinition modelPartData1 = modelPartData.getChild("leftWing").addOrReplaceChild("leftWing01", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.436332F));
		PartDefinition modelPartData2 = modelPartData1.addOrReplaceChild("leftWing02", CubeListBuilder.create().texOffs(0, 47)
				.addBox(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 3.5F, 0.1309F, 0.3054F, 0.0F));
		PartDefinition modelPartData3 = modelPartData2.addOrReplaceChild("leftWing03", CubeListBuilder.create().texOffs(39, 0)
				.addBox(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F),
				PartPose.offsetAndRotation(0.0F, -1.0F, 8.5F, -0.5672F, 0.3054F, 0.0F));
		PartDefinition modelPartData4 = modelPartData3.addOrReplaceChild("leftWing04", CubeListBuilder.create().texOffs(33, 25)
				.addBox(-0.7F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.5F, 7.2F, 1.0908F, 0.0F, 0.0F));
		modelPartData4.addOrReplaceChild("leftWing05", CubeListBuilder.create().texOffs(0, 13)
				.addBox(0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F, true),
				PartPose.offset(-0.5F, 4.8F, -0.2F));
		PartDefinition modelPartData5 = modelPartData4.addOrReplaceChild("lFeathers02", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.5F, -3.2F, 0.0F, 0.0F, 0.0873F));
		modelPartData5.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(26, 26)
				.addBox(0.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition modelPartData6 = modelPartData2.addOrReplaceChild("lFeathers01", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.6F, 1.3F, 1.5F, -0.1745F, -0.0873F, 0.0F));
		modelPartData6.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition modelPartData7 = modelPartData.getChild("rightWing").addOrReplaceChild("rightWing01", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F, true),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.436332F));
		PartDefinition modelPartData8 = modelPartData7.addOrReplaceChild("rightWing02", CubeListBuilder.create().texOffs(0, 47)
				.addBox(-0.5F, -1.5F, 0.5F, 1.0F, 2.0F, 8.0F, true),
				PartPose.offsetAndRotation(0.5F, 0.0F, 3.5F, 0.1309F, -0.3054F, 0.0F));
		PartDefinition modelPartData9 = modelPartData8.addOrReplaceChild("rightWing03", CubeListBuilder.create().texOffs(39, 0)
				.addBox(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 8.0F, true),
				PartPose.offsetAndRotation(0.0F, -1.0F, 8.5F, -0.5672F, -0.3054F, 0.0F));
		PartDefinition modelPartData10 = modelPartData9.addOrReplaceChild("rightWing04", CubeListBuilder.create().texOffs(33, 25)
				.addBox(-0.3F, -0.2F, -0.5F, 1.0F, 14.0F, 1.0F),
				PartPose.offsetAndRotation(0.0F, 0.5F, 7.2F, 1.0908F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("rightWing05", CubeListBuilder.create().texOffs(0, 13)
				.addBox(-0.4F, -4.0F, -12.3F, 0.0F, 20.0F, 13.0F),
				PartPose.offset(0.5F, 4.8F, -0.2F));
		PartDefinition modelPartData11 = modelPartData10.addOrReplaceChild("rFeathers02", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.5F, -3.2F, 0.0F, 0.0F, -0.0873F));
		modelPartData11.addOrReplaceChild("Box_r3", CubeListBuilder.create().texOffs(26, 26)
				.addBox(-1.0F, -6.6F, -13.8F, 1.0F, 14.0F, 14.0F),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition modelPartData12 = modelPartData8.addOrReplaceChild("rFeathers01", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.6F, 1.3F, 1.5F, -0.1745F, 0.0873F, 0.0F));
		modelPartData12.addOrReplaceChild("Box_r4", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, -0.8F, -8.1F, 1.0F, 10.0F, 16.0F),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(modelData, 64, 64);
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
