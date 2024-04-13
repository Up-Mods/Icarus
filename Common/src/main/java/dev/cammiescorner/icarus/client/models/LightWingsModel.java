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

	public static LayerDefinition getLayerDefinition() {
		MeshDefinition modelData = getModelData();
		PartDefinition modelPartData = modelData.getRoot();

		PartDefinition modelPartData1 = modelPartData.getChild("rightWing").addOrReplaceChild("rWingMain", CubeListBuilder.create(),
				PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.836332F));
		modelPartData1.addOrReplaceChild("rWing01", CubeListBuilder.create().texOffs(26, 18)
				.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 13.0F, 0.0F, true),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.3054F));
		modelPartData1.addOrReplaceChild("rWing02", CubeListBuilder.create().texOffs(25, 12)
				.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 19.0F, 0.0F, true),
				PartPose.offsetAndRotation(-6.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.48F));
		modelPartData1.addOrReplaceChild("rWing03", CubeListBuilder.create().texOffs(25, 8)
				.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 23.0F, 0.0F, true),
				PartPose.offsetAndRotation(-9.5F, -5.0F, 1.0F, 0.0F, 0.0F, 0.6981F));
		modelPartData1.addOrReplaceChild("rWing04", CubeListBuilder.create().texOffs(19, 16)
				.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 15.0F, 0.0F, true),
				PartPose.offsetAndRotation(-12.0F, -7.75F, 1.0F, 0.0F, 0.0F, 0.9599F));
		modelPartData1.addOrReplaceChild("rWing05", CubeListBuilder.create().texOffs(12, 21)
				.addBox(-0.5F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F, true),
				PartPose.offsetAndRotation(-12.25F, -11.75F, 1.0F, 0.0F, 0.0F, 1.0908F));
		PartDefinition modelPartData2 = modelPartData.getChild("leftWing").addOrReplaceChild("lWingMain", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.836332F));
		modelPartData2.addOrReplaceChild("lWing01", CubeListBuilder.create().texOffs(26, 18)
				.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 13.0F, 0.0F),
				PartPose.offsetAndRotation(3.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.3054F));
		modelPartData2.addOrReplaceChild("lWing02", CubeListBuilder.create().texOffs(25, 12)
				.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 19.0F, 0.0F),
				PartPose.offsetAndRotation(6.0F, -3.0F, 1.0F, 0.0F, 0.0F, -0.48F));
		modelPartData2.addOrReplaceChild("lWing03", CubeListBuilder.create().texOffs(25, 8)
				.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 23.0F, 0.0F),
				PartPose.offsetAndRotation(9.5F, -5.0F, 1.0F, 0.0F, 0.0F, -0.6981F));
		modelPartData2.addOrReplaceChild("lWing04", CubeListBuilder.create().texOffs(19, 16)
				.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 15.0F, 0.0F),
				PartPose.offsetAndRotation(12.0F, -7.75F, 1.0F, 0.0F, 0.0F, -0.9599F));
		modelPartData2.addOrReplaceChild("lWing05", CubeListBuilder.create().texOffs(12, 21)
				.addBox(-1.5F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F),
				PartPose.offsetAndRotation(12.25F, -11.75F, 1.0F, 0.0F, 0.0F, -1.0908F));

		return LayerDefinition.create(modelData, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setupAnim(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
	}
}
