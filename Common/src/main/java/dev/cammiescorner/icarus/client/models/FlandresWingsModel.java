// Made with Model Converter by Globox_Z
// Generate all required imports
/*
 * Model by cybercat5555
 */
package dev.cammiescorner.icarus.client.models;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

public class FlandresWingsModel<T extends LivingEntity> extends WingEntityModel<T> {
	private final ModelPart leftWing01;
	private final ModelPart leftWing02;
	private final ModelPart leftWing03;
	private final ModelPart leftWing04;
	private final ModelPart leftWing05;
	private final ModelPart lGem7;
	private final ModelPart sideB_r1;
	private final ModelPart sideF_r1;
	private final ModelPart largeTop_r1;
	private final ModelPart point_r1;
	private final ModelPart top_r1;
	private final ModelPart lGem8;
	private final ModelPart sideB_r2;
	private final ModelPart sideF_r2;
	private final ModelPart largeTop_r2;
	private final ModelPart point_r2;
	private final ModelPart top_r2;
	private final ModelPart lGem5;
	private final ModelPart sideB_r3;
	private final ModelPart sideF_r3;
	private final ModelPart largeTop_r3;
	private final ModelPart point_r3;
	private final ModelPart top_r3;
	private final ModelPart lGem6;
	private final ModelPart sideB_r4;
	private final ModelPart sideF_r4;
	private final ModelPart largeTop_r4;
	private final ModelPart point_r4;
	private final ModelPart top_r4;
	private final ModelPart lGem4;
	private final ModelPart sideB_r5;
	private final ModelPart sideF_r5;
	private final ModelPart largeTop_r5;
	private final ModelPart point_r5;
	private final ModelPart top_r5;
	private final ModelPart lGem01;
	private final ModelPart sideB_r6;
	private final ModelPart sideF_r6;
	private final ModelPart largeTop_r6;
	private final ModelPart point_r6;
	private final ModelPart top_r6;
	private final ModelPart lGem2;
	private final ModelPart sideB_r7;
	private final ModelPart sideF_r7;
	private final ModelPart largeTop_r7;
	private final ModelPart point_r7;
	private final ModelPart top_r7;
	private final ModelPart lGem3;
	private final ModelPart sideB_r8;
	private final ModelPart sideF_r8;
	private final ModelPart largeTop_r8;
	private final ModelPart point_r8;
	private final ModelPart top_r8;
	private final ModelPart rightWing01;
	private final ModelPart rightWing02;
	private final ModelPart rightWing03;
	private final ModelPart rightWing04;
	private final ModelPart rightWing05;
	private final ModelPart rGem07;
	private final ModelPart sideB_r9;
	private final ModelPart sideF_r9;
	private final ModelPart largeTop_r9;
	private final ModelPart point_r9;
	private final ModelPart top_r9;
	private final ModelPart rGem08;
	private final ModelPart sideB_r10;
	private final ModelPart sideF_r10;
	private final ModelPart largeTop_r10;
	private final ModelPart point_r10;
	private final ModelPart top_r10;
	private final ModelPart rGem05;
	private final ModelPart sideB_r11;
	private final ModelPart sideF_r11;
	private final ModelPart largeTop_r11;
	private final ModelPart point_r11;
	private final ModelPart top_r11;
	private final ModelPart rGem06;
	private final ModelPart sideB_r12;
	private final ModelPart sideF_r12;
	private final ModelPart largeTop_r12;
	private final ModelPart point_r12;
	private final ModelPart top_r12;
	private final ModelPart rGem04;
	private final ModelPart sideB_r13;
	private final ModelPart sideF_r13;
	private final ModelPart largeTop_r13;
	private final ModelPart point_r13;
	private final ModelPart top_r13;
	private final ModelPart rGem01;
	private final ModelPart sideB_r14;
	private final ModelPart sideF_r14;
	private final ModelPart largeTop_r14;
	private final ModelPart point_r14;
	private final ModelPart top_r14;
	private final ModelPart rGem02;
	private final ModelPart sideB_r15;
	private final ModelPart sideF_r15;
	private final ModelPart largeTop_r15;
	private final ModelPart point_r15;
	private final ModelPart top_r15;
	private final ModelPart rGem03;
	private final ModelPart sideB_r16;
	private final ModelPart sideF_r16;
	private final ModelPart largeTop_r16;
	private final ModelPart point_r16;
	private final ModelPart top_r16;

	public FlandresWingsModel(ModelPart root) {
		super(root);

		this.leftWing01 = root.getChild("leftWing").getChild("leftWing01");
		this.rightWing01 = root.getChild("rightWing").getChild("rightWing01");
		this.rightWing02 = this.rightWing01.getChild("rightWing02");
		this.rGem03 = this.rightWing02.getChild("rGem03");
		this.top_r16 = this.rGem03.getChild("top_r16");
		this.point_r16 = this.rGem03.getChild("point_r16");
		this.largeTop_r16 = this.rGem03.getChild("largeTop_r16");
		this.sideF_r16 = this.rGem03.getChild("sideF_r16");
		this.sideB_r16 = this.rGem03.getChild("sideB_r16");
		this.rGem02 = this.rightWing02.getChild("rGem02");
		this.top_r15 = this.rGem02.getChild("top_r15");
		this.point_r15 = this.rGem02.getChild("point_r15");
		this.largeTop_r15 = this.rGem02.getChild("largeTop_r15");
		this.sideF_r15 = this.rGem02.getChild("sideF_r15");
		this.sideB_r15 = this.rGem02.getChild("sideB_r15");
		this.rGem01 = this.rightWing02.getChild("rGem01");
		this.top_r14 = this.rGem01.getChild("top_r14");
		this.point_r14 = this.rGem01.getChild("point_r14");
		this.largeTop_r14 = this.rGem01.getChild("largeTop_r14");
		this.sideF_r14 = this.rGem01.getChild("sideF_r14");
		this.sideB_r14 = this.rGem01.getChild("sideB_r14");
		this.rightWing03 = this.rightWing02.getChild("rightWing03");
		this.rGem04 = this.rightWing03.getChild("rGem04");
		this.top_r13 = this.rGem04.getChild("top_r13");
		this.point_r13 = this.rGem04.getChild("point_r13");
		this.largeTop_r13 = this.rGem04.getChild("largeTop_r13");
		this.sideF_r13 = this.rGem04.getChild("sideF_r13");
		this.sideB_r13 = this.rGem04.getChild("sideB_r13");
		this.rightWing04 = this.rightWing03.getChild("rightWing04");
		this.rGem06 = this.rightWing04.getChild("rGem06");
		this.top_r12 = this.rGem06.getChild("top_r12");
		this.point_r12 = this.rGem06.getChild("point_r12");
		this.largeTop_r12 = this.rGem06.getChild("largeTop_r12");
		this.sideF_r12 = this.rGem06.getChild("sideF_r12");
		this.sideB_r12 = this.rGem06.getChild("sideB_r12");
		this.rGem05 = this.rightWing04.getChild("rGem05");
		this.top_r11 = this.rGem05.getChild("top_r11");
		this.point_r11 = this.rGem05.getChild("point_r11");
		this.largeTop_r11 = this.rGem05.getChild("largeTop_r11");
		this.sideF_r11 = this.rGem05.getChild("sideF_r11");
		this.sideB_r11 = this.rGem05.getChild("sideB_r11");
		this.rightWing05 = this.rightWing04.getChild("rightWing05");
		this.rGem08 = this.rightWing05.getChild("rGem08");
		this.top_r10 = this.rGem08.getChild("top_r10");
		this.point_r10 = this.rGem08.getChild("point_r10");
		this.largeTop_r10 = this.rGem08.getChild("largeTop_r10");
		this.sideF_r10 = this.rGem08.getChild("sideF_r10");
		this.sideB_r10 = this.rGem08.getChild("sideB_r10");
		this.rGem07 = this.rightWing05.getChild("rGem07");
		this.top_r9 = this.rGem07.getChild("top_r9");
		this.point_r9 = this.rGem07.getChild("point_r9");
		this.largeTop_r9 = this.rGem07.getChild("largeTop_r9");
		this.sideF_r9 = this.rGem07.getChild("sideF_r9");
		this.sideB_r9 = this.rGem07.getChild("sideB_r9");
		this.leftWing02 = this.leftWing01.getChild("leftWing02");
		this.lGem3 = this.leftWing02.getChild("lGem3");
		this.top_r8 = this.lGem3.getChild("top_r8");
		this.point_r8 = this.lGem3.getChild("point_r8");
		this.largeTop_r8 = this.lGem3.getChild("largeTop_r8");
		this.sideF_r8 = this.lGem3.getChild("sideF_r8");
		this.sideB_r8 = this.lGem3.getChild("sideB_r8");
		this.lGem2 = this.leftWing02.getChild("lGem2");
		this.top_r7 = this.lGem2.getChild("top_r7");
		this.point_r7 = this.lGem2.getChild("point_r7");
		this.largeTop_r7 = this.lGem2.getChild("largeTop_r7");
		this.sideF_r7 = this.lGem2.getChild("sideF_r7");
		this.sideB_r7 = this.lGem2.getChild("sideB_r7");
		this.lGem01 = this.leftWing02.getChild("lGem01");
		this.top_r6 = this.lGem01.getChild("top_r6");
		this.point_r6 = this.lGem01.getChild("point_r6");
		this.largeTop_r6 = this.lGem01.getChild("largeTop_r6");
		this.sideF_r6 = this.lGem01.getChild("sideF_r6");
		this.sideB_r6 = this.lGem01.getChild("sideB_r6");
		this.leftWing03 = this.leftWing02.getChild("leftWing03");
		this.lGem4 = this.leftWing03.getChild("lGem4");
		this.top_r5 = this.lGem4.getChild("top_r5");
		this.point_r5 = this.lGem4.getChild("point_r5");
		this.largeTop_r5 = this.lGem4.getChild("largeTop_r5");
		this.sideF_r5 = this.lGem4.getChild("sideF_r5");
		this.sideB_r5 = this.lGem4.getChild("sideB_r5");
		this.leftWing04 = this.leftWing03.getChild("leftWing04");
		this.lGem6 = this.leftWing04.getChild("lGem6");
		this.top_r4 = this.lGem6.getChild("top_r4");
		this.point_r4 = this.lGem6.getChild("point_r4");
		this.largeTop_r4 = this.lGem6.getChild("largeTop_r4");
		this.sideF_r4 = this.lGem6.getChild("sideF_r4");
		this.sideB_r4 = this.lGem6.getChild("sideB_r4");
		this.lGem5 = this.leftWing04.getChild("lGem5");
		this.top_r3 = this.lGem5.getChild("top_r3");
		this.point_r3 = this.lGem5.getChild("point_r3");
		this.largeTop_r3 = this.lGem5.getChild("largeTop_r3");
		this.sideF_r3 = this.lGem5.getChild("sideF_r3");
		this.sideB_r3 = this.lGem5.getChild("sideB_r3");
		this.leftWing05 = this.leftWing04.getChild("leftWing05");
		this.lGem8 = this.leftWing05.getChild("lGem8");
		this.top_r2 = this.lGem8.getChild("top_r2");
		this.point_r2 = this.lGem8.getChild("point_r2");
		this.largeTop_r2 = this.lGem8.getChild("largeTop_r2");
		this.sideF_r2 = this.lGem8.getChild("sideF_r2");
		this.sideB_r2 = this.lGem8.getChild("sideB_r2");
		this.lGem7 = this.leftWing05.getChild("lGem7");
		this.top_r1 = this.lGem7.getChild("top_r1");
		this.point_r1 = this.lGem7.getChild("point_r1");
		this.largeTop_r1 = this.lGem7.getChild("largeTop_r1");
		this.sideF_r1 = this.lGem7.getChild("sideF_r1");
		this.sideB_r1 = this.lGem7.getChild("sideB_r1");
	}

	public static LayerDefinition getLayerDefinition() {
		MeshDefinition modelData = getModelData();
		PartDefinition modelPartData = modelData.getRoot();

		PartDefinition modelPartData1 = modelPartData.getChild("leftWing").addOrReplaceChild("leftWing01", CubeListBuilder.create().texOffs(11, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 6.0F),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.436332F));
		PartDefinition modelPartData2 = modelPartData1.addOrReplaceChild("leftWing02", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 9.0F),
				PartPose.offsetAndRotation(0.0F, 0.5F, 5.0F, 0.2618F, 0.3054F, 0.0F));
		PartDefinition modelPartData3 = modelPartData2.addOrReplaceChild("leftWing03", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.6F, -1.8F, 0.0F, 1.0F, 2.0F, 9.0F),
				PartPose.offsetAndRotation(-0.5F, 0.5F, 8.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData4 = modelPartData3.addOrReplaceChild("leftWing04", CubeListBuilder.create().texOffs(0, 21)
				.addBox(-0.7F, 0.0F, -0.6F, 1.0F, 11.0F, 1.0F),
				PartPose.offsetAndRotation(0.0F, -1.0F, 9.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition modelPartData5 = modelPartData4.addOrReplaceChild("leftWing05", CubeListBuilder.create().texOffs(0, 21)
				.addBox(-0.8F, -0.3F, -0.7F, 1.0F, 11.0F, 1.0F),
				PartPose.offsetAndRotation(0.0F, 10.8F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition modelPartData6 = modelPartData5.addOrReplaceChild("lGem7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0308F, 2.2372F, 0.0333F, -0.9599F, 0.0F, 0.0F));
		modelPartData6.addOrReplaceChild("sideB_r1", CubeListBuilder.create().texOffs(36, 30)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData6.addOrReplaceChild("sideF_r1", CubeListBuilder.create().texOffs(36, 30)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData6.addOrReplaceChild("largeTop_r1", CubeListBuilder.create().texOffs(40, 37)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData6.addOrReplaceChild("point_r1", CubeListBuilder.create().texOffs(40, 43)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData6.addOrReplaceChild("top_r1", CubeListBuilder.create().texOffs(40, 43)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData7 = modelPartData5.addOrReplaceChild("lGem8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.4383F, 8.6075F, 0.5953F, -0.9599F, 0.0F, 0.0F));
		modelPartData7.addOrReplaceChild("sideB_r2", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData7.addOrReplaceChild("sideF_r2", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData7.addOrReplaceChild("largeTop_r2", CubeListBuilder.create().texOffs(4, 18)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData7.addOrReplaceChild("point_r2", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData7.addOrReplaceChild("top_r2", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData8 = modelPartData4.addOrReplaceChild("lGem5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.142F, 0.7935F, 0.1272F, -1.0472F, 0.0F, 0.0F));
		modelPartData8.addOrReplaceChild("sideB_r3", CubeListBuilder.create().texOffs(4, 30)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData8.addOrReplaceChild("sideF_r3", CubeListBuilder.create().texOffs(4, 30)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData8.addOrReplaceChild("largeTop_r3", CubeListBuilder.create().texOffs(8, 37)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData8.addOrReplaceChild("point_r3", CubeListBuilder.create().texOffs(8, 43)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData8.addOrReplaceChild("top_r3", CubeListBuilder.create().texOffs(8, 43)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData9 = modelPartData4.addOrReplaceChild("lGem6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.3039F, 5.7996F, 0.357F, -1.0472F, 0.0F, 0.0F));
		modelPartData9.addOrReplaceChild("sideB_r4", CubeListBuilder.create().texOffs(20, 30)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData9.addOrReplaceChild("sideF_r4", CubeListBuilder.create().texOffs(20, 30)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData9.addOrReplaceChild("largeTop_r4", CubeListBuilder.create().texOffs(24, 37)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData9.addOrReplaceChild("point_r4", CubeListBuilder.create().texOffs(24, 43)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData9.addOrReplaceChild("top_r4", CubeListBuilder.create().texOffs(24, 43)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData10 = modelPartData3.addOrReplaceChild("lGem4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4345F, -0.814F, 3.3462F, -0.1309F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("sideB_r5", CubeListBuilder.create().texOffs(45, 11)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("sideF_r5", CubeListBuilder.create().texOffs(45, 11)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("largeTop_r5", CubeListBuilder.create().texOffs(49, 18)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("point_r5", CubeListBuilder.create().texOffs(49, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData10.addOrReplaceChild("top_r5", CubeListBuilder.create().texOffs(49, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData11 = modelPartData2.addOrReplaceChild("lGem01", CubeListBuilder.create(),
				PartPose.offset(0.6635F, 0.2041F, -1.1535F));
		modelPartData11.addOrReplaceChild("sideB_r6", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData11.addOrReplaceChild("sideF_r6", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData11.addOrReplaceChild("largeTop_r6", CubeListBuilder.create().texOffs(4, 18)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData11.addOrReplaceChild("point_r6", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData11.addOrReplaceChild("top_r6", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData12 = modelPartData2.addOrReplaceChild("lGem2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.267F, -0.1566F, 4.027F, 0.0873F, 0.0F, 0.0F));
		modelPartData12.addOrReplaceChild("sideB_r7", CubeListBuilder.create().texOffs(15, 11)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData12.addOrReplaceChild("sideF_r7", CubeListBuilder.create().texOffs(15, 11)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData12.addOrReplaceChild("largeTop_r7", CubeListBuilder.create().texOffs(19, 18)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData12.addOrReplaceChild("point_r7", CubeListBuilder.create().texOffs(19, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData12.addOrReplaceChild("top_r7", CubeListBuilder.create().texOffs(19, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData13 = modelPartData2.addOrReplaceChild("lGem3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1582F, -0.1549F, 7.1073F, 0.48F, 0.0F, 0.0F));
		modelPartData13.addOrReplaceChild("sideB_r8", CubeListBuilder.create().texOffs(30, 11)
				.addBox(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData13.addOrReplaceChild("sideF_r8", CubeListBuilder.create().texOffs(30, 11)
				.addBox(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData13.addOrReplaceChild("largeTop_r8", CubeListBuilder.create().texOffs(34, 18)
				.addBox(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData13.addOrReplaceChild("point_r8", CubeListBuilder.create().texOffs(34, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData13.addOrReplaceChild("top_r8", CubeListBuilder.create().texOffs(34, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offsetAndRotation(-0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData14 = modelPartData.getChild("rightWing").addOrReplaceChild("rightWing01", CubeListBuilder.create().texOffs(11, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 6.0F, true),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.436332F));
		PartDefinition modelPartData15 = modelPartData14.addOrReplaceChild("rightWing02", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 9.0F, true),
				PartPose.offsetAndRotation(0.0F, 0.5F, 5.0F, 0.2618F, -0.3054F, 0.0F));
		PartDefinition modelPartData16 = modelPartData15.addOrReplaceChild("rightWing03", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.4F, -1.8F, 0.0F, 1.0F, 2.0F, 9.0F, true),
				PartPose.offsetAndRotation(0.5F, 0.5F, 8.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData17 = modelPartData16.addOrReplaceChild("rightWing04", CubeListBuilder.create().texOffs(0, 21)
				.addBox(-0.3F, 0.0F, -0.6F, 1.0F, 11.0F, 1.0F, true),
				PartPose.offsetAndRotation(0.0F, -1.0F, 9.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition modelPartData18 = modelPartData17.addOrReplaceChild("rightWing05", CubeListBuilder.create().texOffs(0, 21)
				.addBox(-0.2F, -0.3F, -0.7F, 1.0F, 11.0F, 1.0F, true),
				PartPose.offsetAndRotation(0.0F, 10.8F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition modelPartData19 = modelPartData18.addOrReplaceChild("rGem07", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.0308F, 2.2372F, 0.0333F, -0.9599F, 0.0F, 0.0F));
		modelPartData19.addOrReplaceChild("sideB_r9", CubeListBuilder.create().texOffs(36, 30)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData19.addOrReplaceChild("sideF_r9", CubeListBuilder.create().texOffs(36, 30)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData19.addOrReplaceChild("largeTop_r9", CubeListBuilder.create().texOffs(40, 37)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData19.addOrReplaceChild("point_r9", CubeListBuilder.create().texOffs(40, 43)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData19.addOrReplaceChild("top_r9", CubeListBuilder.create().texOffs(40, 43)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData20 = modelPartData18.addOrReplaceChild("rGem08", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4383F, 8.6075F, 0.5953F, -0.9599F, 0.0F, 0.0F));
		modelPartData20.addOrReplaceChild("sideB_r10", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData20.addOrReplaceChild("sideF_r10", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData20.addOrReplaceChild("largeTop_r10", CubeListBuilder.create().texOffs(4, 18)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData20.addOrReplaceChild("point_r10", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData20.addOrReplaceChild("top_r10", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData21 = modelPartData17.addOrReplaceChild("rGem05", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.142F, 0.7935F, 0.1272F, -1.0472F, 0.0F, 0.0F));
		modelPartData21.addOrReplaceChild("sideB_r11", CubeListBuilder.create().texOffs(4, 30)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData21.addOrReplaceChild("sideF_r11", CubeListBuilder.create().texOffs(4, 30)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData21.addOrReplaceChild("largeTop_r11", CubeListBuilder.create().texOffs(8, 37)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData21.addOrReplaceChild("point_r11", CubeListBuilder.create().texOffs(8, 43)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData21.addOrReplaceChild("top_r11", CubeListBuilder.create().texOffs(8, 43)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData22 = modelPartData17.addOrReplaceChild("rGem06", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.3039F, 5.7996F, 0.357F, -1.0472F, 0.0F, 0.0F));
		modelPartData22.addOrReplaceChild("sideB_r12", CubeListBuilder.create().texOffs(20, 30)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData22.addOrReplaceChild("sideF_r12", CubeListBuilder.create().texOffs(20, 30)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData22.addOrReplaceChild("largeTop_r12", CubeListBuilder.create().texOffs(24, 37)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData22.addOrReplaceChild("point_r12", CubeListBuilder.create().texOffs(24, 43)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData22.addOrReplaceChild("top_r12", CubeListBuilder.create().texOffs(24, 43)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData23 = modelPartData16.addOrReplaceChild("rGem04", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.4345F, -0.814F, 3.3462F, -0.1309F, 0.0F, 0.0F));
		modelPartData23.addOrReplaceChild("sideB_r13", CubeListBuilder.create().texOffs(45, 11)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData23.addOrReplaceChild("sideF_r13", CubeListBuilder.create().texOffs(45, 11)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData23.addOrReplaceChild("largeTop_r13", CubeListBuilder.create().texOffs(49, 18)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData23.addOrReplaceChild("point_r13", CubeListBuilder.create().texOffs(49, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData23.addOrReplaceChild("top_r13", CubeListBuilder.create().texOffs(49, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData24 = modelPartData15.addOrReplaceChild("rGem01", CubeListBuilder.create(),
				PartPose.offset(-0.6635F, 0.2041F, -1.1535F));
		modelPartData24.addOrReplaceChild("sideB_r14", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData24.addOrReplaceChild("sideF_r14", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData24.addOrReplaceChild("largeTop_r14", CubeListBuilder.create().texOffs(4, 18)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData24.addOrReplaceChild("point_r14", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData24.addOrReplaceChild("top_r14", CubeListBuilder.create().texOffs(4, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData25 = modelPartData15.addOrReplaceChild("rGem02", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.267F, -0.1566F, 4.027F, 0.0873F, 0.0F, 0.0F));
		modelPartData25.addOrReplaceChild("sideB_r15", CubeListBuilder.create().texOffs(15, 11)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData25.addOrReplaceChild("sideF_r15", CubeListBuilder.create().texOffs(15, 11)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData25.addOrReplaceChild("largeTop_r15", CubeListBuilder.create().texOffs(19, 18)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData25.addOrReplaceChild("point_r15", CubeListBuilder.create().texOffs(19, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData25.addOrReplaceChild("top_r15", CubeListBuilder.create().texOffs(19, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition modelPartData26 = modelPartData15.addOrReplaceChild("rGem03", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1582F, -0.1549F, 7.1073F, 0.48F, 0.0F, 0.0F));
		modelPartData26.addOrReplaceChild("sideB_r16", CubeListBuilder.create().texOffs(30, 11)
				.addBox(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, -1.7453F, 0.0F, 0.0F));
		modelPartData26.addOrReplaceChild("sideF_r16", CubeListBuilder.create().texOffs(30, 11)
				.addBox(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, true),
				PartPose.offsetAndRotation(0.5F, 6.0F, -1.0F, -1.3963F, 0.0F, 0.0F));
		modelPartData26.addOrReplaceChild("largeTop_r16", CubeListBuilder.create().texOffs(34, 18)
				.addBox(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, true),
				PartPose.offsetAndRotation(0.5F, 4.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData26.addOrReplaceChild("point_r16", CubeListBuilder.create().texOffs(34, 24)
				.addBox(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(),
				PartPose.offsetAndRotation(0.5F, 10.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		modelPartData26.addOrReplaceChild("top_r16", CubeListBuilder.create().texOffs(34, 24)
				.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, true),
				PartPose.offsetAndRotation(0.5F, 2.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(modelData, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		super.setupAnim(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
		if(state == State.IDLE || state == State.CROUCHING)
			leftWing03.xRot = (float) Math.toRadians(-50);
		if(state == State.FLYING)
			leftWing03.xRot = (float) Math.toRadians(45);
		rightWing03.xRot = leftWing03.xRot;
	}
}
