/*
 * Model by cybercat5555
 */
package com.camscorner.icarus.client.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.entity.LivingEntity;

public class FlandresWingsModel<T extends LivingEntity> extends WingEntityModel<T>
{
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

	public FlandresWingsModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		leftWing01 = new ModelPart(this);
		leftWing01.setPivot(-6.0F, 0.0F, 0.0F);
		setRotationAngle(leftWing01, 0.0F, 1.5708F, 0.436332F);
		leftWing01.setTextureOffset(11, 0).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
		rightWing.addChild(leftWing01);

		leftWing02 = new ModelPart(this);
		leftWing02.setPivot(0.0F, 0.5F, 5.0F);
		leftWing01.addChild(leftWing02);
		setRotationAngle(leftWing02, 0.2618F, 0.3054F, 0.0F);
		leftWing02.setTextureOffset(0, 0).addCuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);

		leftWing03 = new ModelPart(this);
		leftWing03.setPivot(-0.5F, 0.5F, 8.0F);
		leftWing02.addChild(leftWing03);
		setRotationAngle(leftWing03, 0.7854F, 0.0F, 0.0F);
		leftWing03.setTextureOffset(0, 0).addCuboid(-0.6F, -1.8F, 0.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);

		leftWing04 = new ModelPart(this);
		leftWing04.setPivot(0.0F, -1.0F, 9.0F);
		leftWing03.addChild(leftWing04);
		setRotationAngle(leftWing04, 0.6981F, 0.0F, 0.0F);
		leftWing04.setTextureOffset(0, 21).addCuboid(-0.7F, 0.0F, -0.6F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		leftWing05 = new ModelPart(this);
		leftWing05.setPivot(0.0F, 10.8F, 0.0F);
		leftWing04.addChild(leftWing05);
		setRotationAngle(leftWing05, -0.3054F, 0.0F, 0.0F);
		leftWing05.setTextureOffset(0, 21).addCuboid(-0.8F, -0.3F, -0.7F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		lGem7 = new ModelPart(this);
		lGem7.setPivot(0.0308F, 2.2372F, 0.0333F);
		leftWing05.addChild(lGem7);
		setRotationAngle(lGem7, -0.9599F, 0.0F, 0.0F);
		

		sideB_r1 = new ModelPart(this);
		sideB_r1.setPivot(-0.5F, 6.0F, 2.0F);
		lGem7.addChild(sideB_r1);
		setRotationAngle(sideB_r1, -1.7453F, 0.0F, 0.0F);
		sideB_r1.setTextureOffset(36, 30).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r1 = new ModelPart(this);
		sideF_r1.setPivot(-0.5F, 6.0F, -1.0F);
		lGem7.addChild(sideF_r1);
		setRotationAngle(sideF_r1, -1.3963F, 0.0F, 0.0F);
		sideF_r1.setTextureOffset(36, 30).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r1 = new ModelPart(this);
		largeTop_r1.setPivot(-0.5F, 4.0F, 0.5F);
		lGem7.addChild(largeTop_r1);
		setRotationAngle(largeTop_r1, -0.7854F, 0.0F, 0.0F);
		largeTop_r1.setTextureOffset(40, 37).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r1 = new ModelPart(this);
		point_r1.setPivot(-0.5F, 10.0F, 0.5F);
		lGem7.addChild(point_r1);
		setRotationAngle(point_r1, -0.7854F, 0.0F, 0.0F);
		point_r1.setTextureOffset(40, 43).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r1 = new ModelPart(this);
		top_r1.setPivot(-0.5F, 2.0F, 1.0F);
		lGem7.addChild(top_r1);
		setRotationAngle(top_r1, -0.7854F, 0.0F, 0.0F);
		top_r1.setTextureOffset(40, 43).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem8 = new ModelPart(this);
		lGem8.setPivot(0.4383F, 8.6075F, 0.5953F);
		leftWing05.addChild(lGem8);
		setRotationAngle(lGem8, -0.9599F, 0.0F, 0.0F);
		

		sideB_r2 = new ModelPart(this);
		sideB_r2.setPivot(-0.5F, 6.0F, 2.0F);
		lGem8.addChild(sideB_r2);
		setRotationAngle(sideB_r2, -1.7453F, 0.0F, 0.0F);
		sideB_r2.setTextureOffset(0, 11).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r2 = new ModelPart(this);
		sideF_r2.setPivot(-0.5F, 6.0F, -1.0F);
		lGem8.addChild(sideF_r2);
		setRotationAngle(sideF_r2, -1.3963F, 0.0F, 0.0F);
		sideF_r2.setTextureOffset(0, 11).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r2 = new ModelPart(this);
		largeTop_r2.setPivot(-0.5F, 4.0F, 0.5F);
		lGem8.addChild(largeTop_r2);
		setRotationAngle(largeTop_r2, -0.7854F, 0.0F, 0.0F);
		largeTop_r2.setTextureOffset(4, 18).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r2 = new ModelPart(this);
		point_r2.setPivot(-0.5F, 10.0F, 0.5F);
		lGem8.addChild(point_r2);
		setRotationAngle(point_r2, -0.7854F, 0.0F, 0.0F);
		point_r2.setTextureOffset(4, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r2 = new ModelPart(this);
		top_r2.setPivot(-0.5F, 2.0F, 1.0F);
		lGem8.addChild(top_r2);
		setRotationAngle(top_r2, -0.7854F, 0.0F, 0.0F);
		top_r2.setTextureOffset(4, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem5 = new ModelPart(this);
		lGem5.setPivot(-0.142F, 0.7935F, 0.1272F);
		leftWing04.addChild(lGem5);
		setRotationAngle(lGem5, -1.0472F, 0.0F, 0.0F);
		

		sideB_r3 = new ModelPart(this);
		sideB_r3.setPivot(-0.5F, 6.0F, 2.0F);
		lGem5.addChild(sideB_r3);
		setRotationAngle(sideB_r3, -1.7453F, 0.0F, 0.0F);
		sideB_r3.setTextureOffset(4, 30).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r3 = new ModelPart(this);
		sideF_r3.setPivot(-0.5F, 6.0F, -1.0F);
		lGem5.addChild(sideF_r3);
		setRotationAngle(sideF_r3, -1.3963F, 0.0F, 0.0F);
		sideF_r3.setTextureOffset(4, 30).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r3 = new ModelPart(this);
		largeTop_r3.setPivot(-0.5F, 4.0F, 0.5F);
		lGem5.addChild(largeTop_r3);
		setRotationAngle(largeTop_r3, -0.7854F, 0.0F, 0.0F);
		largeTop_r3.setTextureOffset(8, 37).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r3 = new ModelPart(this);
		point_r3.setPivot(-0.5F, 10.0F, 0.5F);
		lGem5.addChild(point_r3);
		setRotationAngle(point_r3, -0.7854F, 0.0F, 0.0F);
		point_r3.setTextureOffset(8, 43).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r3 = new ModelPart(this);
		top_r3.setPivot(-0.5F, 2.0F, 1.0F);
		lGem5.addChild(top_r3);
		setRotationAngle(top_r3, -0.7854F, 0.0F, 0.0F);
		top_r3.setTextureOffset(8, 43).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem6 = new ModelPart(this);
		lGem6.setPivot(0.3039F, 5.7996F, 0.357F);
		leftWing04.addChild(lGem6);
		setRotationAngle(lGem6, -1.0472F, 0.0F, 0.0F);
		

		sideB_r4 = new ModelPart(this);
		sideB_r4.setPivot(-0.5F, 6.0F, 2.0F);
		lGem6.addChild(sideB_r4);
		setRotationAngle(sideB_r4, -1.7453F, 0.0F, 0.0F);
		sideB_r4.setTextureOffset(20, 30).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r4 = new ModelPart(this);
		sideF_r4.setPivot(-0.5F, 6.0F, -1.0F);
		lGem6.addChild(sideF_r4);
		setRotationAngle(sideF_r4, -1.3963F, 0.0F, 0.0F);
		sideF_r4.setTextureOffset(20, 30).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r4 = new ModelPart(this);
		largeTop_r4.setPivot(-0.5F, 4.0F, 0.5F);
		lGem6.addChild(largeTop_r4);
		setRotationAngle(largeTop_r4, -0.7854F, 0.0F, 0.0F);
		largeTop_r4.setTextureOffset(24, 37).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r4 = new ModelPart(this);
		point_r4.setPivot(-0.5F, 10.0F, 0.5F);
		lGem6.addChild(point_r4);
		setRotationAngle(point_r4, -0.7854F, 0.0F, 0.0F);
		point_r4.setTextureOffset(24, 43).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r4 = new ModelPart(this);
		top_r4.setPivot(-0.5F, 2.0F, 1.0F);
		lGem6.addChild(top_r4);
		setRotationAngle(top_r4, -0.7854F, 0.0F, 0.0F);
		top_r4.setTextureOffset(24, 43).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem4 = new ModelPart(this);
		lGem4.setPivot(-0.4345F, -0.814F, 3.3462F);
		leftWing03.addChild(lGem4);
		setRotationAngle(lGem4, -0.1309F, 0.0F, 0.0F);
		

		sideB_r5 = new ModelPart(this);
		sideB_r5.setPivot(-0.5F, 6.0F, 2.0F);
		lGem4.addChild(sideB_r5);
		setRotationAngle(sideB_r5, -1.7453F, 0.0F, 0.0F);
		sideB_r5.setTextureOffset(45, 11).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r5 = new ModelPart(this);
		sideF_r5.setPivot(-0.5F, 6.0F, -1.0F);
		lGem4.addChild(sideF_r5);
		setRotationAngle(sideF_r5, -1.3963F, 0.0F, 0.0F);
		sideF_r5.setTextureOffset(45, 11).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r5 = new ModelPart(this);
		largeTop_r5.setPivot(-0.5F, 4.0F, 0.5F);
		lGem4.addChild(largeTop_r5);
		setRotationAngle(largeTop_r5, -0.7854F, 0.0F, 0.0F);
		largeTop_r5.setTextureOffset(49, 18).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r5 = new ModelPart(this);
		point_r5.setPivot(-0.5F, 10.0F, 0.5F);
		lGem4.addChild(point_r5);
		setRotationAngle(point_r5, -0.7854F, 0.0F, 0.0F);
		point_r5.setTextureOffset(49, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r5 = new ModelPart(this);
		top_r5.setPivot(-0.5F, 2.0F, 1.0F);
		lGem4.addChild(top_r5);
		setRotationAngle(top_r5, -0.7854F, 0.0F, 0.0F);
		top_r5.setTextureOffset(49, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem01 = new ModelPart(this);
		lGem01.setPivot(0.6635F, 0.2041F, -1.1535F);
		leftWing02.addChild(lGem01);
		

		sideB_r6 = new ModelPart(this);
		sideB_r6.setPivot(-0.5F, 6.0F, 2.0F);
		lGem01.addChild(sideB_r6);
		setRotationAngle(sideB_r6, -1.7453F, 0.0F, 0.0F);
		sideB_r6.setTextureOffset(0, 11).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r6 = new ModelPart(this);
		sideF_r6.setPivot(-0.5F, 6.0F, -1.0F);
		lGem01.addChild(sideF_r6);
		setRotationAngle(sideF_r6, -1.3963F, 0.0F, 0.0F);
		sideF_r6.setTextureOffset(0, 11).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r6 = new ModelPart(this);
		largeTop_r6.setPivot(-0.5F, 4.0F, 0.5F);
		lGem01.addChild(largeTop_r6);
		setRotationAngle(largeTop_r6, -0.7854F, 0.0F, 0.0F);
		largeTop_r6.setTextureOffset(4, 18).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r6 = new ModelPart(this);
		point_r6.setPivot(-0.5F, 10.0F, 0.5F);
		lGem01.addChild(point_r6);
		setRotationAngle(point_r6, -0.7854F, 0.0F, 0.0F);
		point_r6.setTextureOffset(4, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r6 = new ModelPart(this);
		top_r6.setPivot(-0.5F, 2.0F, 1.0F);
		lGem01.addChild(top_r6);
		setRotationAngle(top_r6, -0.7854F, 0.0F, 0.0F);
		top_r6.setTextureOffset(4, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem2 = new ModelPart(this);
		lGem2.setPivot(0.267F, -0.1566F, 4.027F);
		leftWing02.addChild(lGem2);
		setRotationAngle(lGem2, 0.0873F, 0.0F, 0.0F);
		

		sideB_r7 = new ModelPart(this);
		sideB_r7.setPivot(-0.5F, 6.0F, 2.0F);
		lGem2.addChild(sideB_r7);
		setRotationAngle(sideB_r7, -1.7453F, 0.0F, 0.0F);
		sideB_r7.setTextureOffset(15, 11).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r7 = new ModelPart(this);
		sideF_r7.setPivot(-0.5F, 6.0F, -1.0F);
		lGem2.addChild(sideF_r7);
		setRotationAngle(sideF_r7, -1.3963F, 0.0F, 0.0F);
		sideF_r7.setTextureOffset(15, 11).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r7 = new ModelPart(this);
		largeTop_r7.setPivot(-0.5F, 4.0F, 0.5F);
		lGem2.addChild(largeTop_r7);
		setRotationAngle(largeTop_r7, -0.7854F, 0.0F, 0.0F);
		largeTop_r7.setTextureOffset(19, 18).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r7 = new ModelPart(this);
		point_r7.setPivot(-0.5F, 10.0F, 0.5F);
		lGem2.addChild(point_r7);
		setRotationAngle(point_r7, -0.7854F, 0.0F, 0.0F);
		point_r7.setTextureOffset(19, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r7 = new ModelPart(this);
		top_r7.setPivot(-0.5F, 2.0F, 1.0F);
		lGem2.addChild(top_r7);
		setRotationAngle(top_r7, -0.7854F, 0.0F, 0.0F);
		top_r7.setTextureOffset(19, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lGem3 = new ModelPart(this);
		lGem3.setPivot(0.1582F, -0.1549F, 7.1073F);
		leftWing02.addChild(lGem3);
		setRotationAngle(lGem3, 0.48F, 0.0F, 0.0F);
		

		sideB_r8 = new ModelPart(this);
		sideB_r8.setPivot(-0.5F, 6.0F, 2.0F);
		lGem3.addChild(sideB_r8);
		setRotationAngle(sideB_r8, -1.7453F, 0.0F, 0.0F);
		sideB_r8.setTextureOffset(30, 11).addCuboid(-0.89F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		sideF_r8 = new ModelPart(this);
		sideF_r8.setPivot(-0.5F, 6.0F, -1.0F);
		lGem3.addChild(sideF_r8);
		setRotationAngle(sideF_r8, -1.3963F, 0.0F, 0.0F);
		sideF_r8.setTextureOffset(30, 11).addCuboid(-0.88F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		largeTop_r8 = new ModelPart(this);
		largeTop_r8.setPivot(-0.5F, 4.0F, 0.5F);
		lGem3.addChild(largeTop_r8);
		setRotationAngle(largeTop_r8, -0.7854F, 0.0F, 0.0F);
		largeTop_r8.setTextureOffset(34, 18).addCuboid(-0.9F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		point_r8 = new ModelPart(this);
		point_r8.setPivot(-0.5F, 10.0F, 0.5F);
		lGem3.addChild(point_r8);
		setRotationAngle(point_r8, -0.7854F, 0.0F, 0.0F);
		point_r8.setTextureOffset(34, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		top_r8 = new ModelPart(this);
		top_r8.setPivot(-0.5F, 2.0F, 1.0F);
		lGem3.addChild(top_r8);
		setRotationAngle(top_r8, -0.7854F, 0.0F, 0.0F);
		top_r8.setTextureOffset(34, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightWing01 = new ModelPart(this);
		rightWing01.setPivot(6.0F, 0.0F, 0.0F);
		setRotationAngle(rightWing01, 0.0F, -1.5708F, -0.436332F);
		rightWing01.setTextureOffset(11, 0).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 6.0F, 0.0F, true);
		leftWing.addChild(rightWing01);

		rightWing02 = new ModelPart(this);
		rightWing02.setPivot(0.0F, 0.5F, 5.0F);
		rightWing01.addChild(rightWing02);
		setRotationAngle(rightWing02, 0.2618F, -0.3054F, 0.0F);
		rightWing02.setTextureOffset(0, 0).addCuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 9.0F, 0.0F, true);

		rightWing03 = new ModelPart(this);
		rightWing03.setPivot(0.5F, 0.5F, 8.0F);
		rightWing02.addChild(rightWing03);
		setRotationAngle(rightWing03, 0.7854F, 0.0F, 0.0F);
		rightWing03.setTextureOffset(0, 0).addCuboid(-0.4F, -1.8F, 0.0F, 1.0F, 2.0F, 9.0F, 0.0F, true);

		rightWing04 = new ModelPart(this);
		rightWing04.setPivot(0.0F, -1.0F, 9.0F);
		rightWing03.addChild(rightWing04);
		setRotationAngle(rightWing04, 0.6981F, 0.0F, 0.0F);
		rightWing04.setTextureOffset(0, 21).addCuboid(-0.3F, 0.0F, -0.6F, 1.0F, 11.0F, 1.0F, 0.0F, true);

		rightWing05 = new ModelPart(this);
		rightWing05.setPivot(0.0F, 10.8F, 0.0F);
		rightWing04.addChild(rightWing05);
		setRotationAngle(rightWing05, -0.3054F, 0.0F, 0.0F);
		rightWing05.setTextureOffset(0, 21).addCuboid(-0.2F, -0.3F, -0.7F, 1.0F, 11.0F, 1.0F, 0.0F, true);

		rGem07 = new ModelPart(this);
		rGem07.setPivot(-0.0308F, 2.2372F, 0.0333F);
		rightWing05.addChild(rGem07);
		setRotationAngle(rGem07, -0.9599F, 0.0F, 0.0F);
		

		sideB_r9 = new ModelPart(this);
		sideB_r9.setPivot(0.5F, 6.0F, 2.0F);
		rGem07.addChild(sideB_r9);
		setRotationAngle(sideB_r9, -1.7453F, 0.0F, 0.0F);
		sideB_r9.setTextureOffset(36, 30).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r9 = new ModelPart(this);
		sideF_r9.setPivot(0.5F, 6.0F, -1.0F);
		rGem07.addChild(sideF_r9);
		setRotationAngle(sideF_r9, -1.3963F, 0.0F, 0.0F);
		sideF_r9.setTextureOffset(36, 30).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r9 = new ModelPart(this);
		largeTop_r9.setPivot(0.5F, 4.0F, 0.5F);
		rGem07.addChild(largeTop_r9);
		setRotationAngle(largeTop_r9, -0.7854F, 0.0F, 0.0F);
		largeTop_r9.setTextureOffset(40, 37).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r9 = new ModelPart(this);
		point_r9.setPivot(0.5F, 10.0F, 0.5F);
		rGem07.addChild(point_r9);
		setRotationAngle(point_r9, -0.7854F, 0.0F, 0.0F);
		point_r9.setTextureOffset(40, 43).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r9 = new ModelPart(this);
		top_r9.setPivot(0.5F, 2.0F, 1.0F);
		rGem07.addChild(top_r9);
		setRotationAngle(top_r9, -0.7854F, 0.0F, 0.0F);
		top_r9.setTextureOffset(40, 43).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem08 = new ModelPart(this);
		rGem08.setPivot(-0.4383F, 8.6075F, 0.5953F);
		rightWing05.addChild(rGem08);
		setRotationAngle(rGem08, -0.9599F, 0.0F, 0.0F);
		

		sideB_r10 = new ModelPart(this);
		sideB_r10.setPivot(0.5F, 6.0F, 2.0F);
		rGem08.addChild(sideB_r10);
		setRotationAngle(sideB_r10, -1.7453F, 0.0F, 0.0F);
		sideB_r10.setTextureOffset(0, 11).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r10 = new ModelPart(this);
		sideF_r10.setPivot(0.5F, 6.0F, -1.0F);
		rGem08.addChild(sideF_r10);
		setRotationAngle(sideF_r10, -1.3963F, 0.0F, 0.0F);
		sideF_r10.setTextureOffset(0, 11).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r10 = new ModelPart(this);
		largeTop_r10.setPivot(0.5F, 4.0F, 0.5F);
		rGem08.addChild(largeTop_r10);
		setRotationAngle(largeTop_r10, -0.7854F, 0.0F, 0.0F);
		largeTop_r10.setTextureOffset(4, 18).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r10 = new ModelPart(this);
		point_r10.setPivot(0.5F, 10.0F, 0.5F);
		rGem08.addChild(point_r10);
		setRotationAngle(point_r10, -0.7854F, 0.0F, 0.0F);
		point_r10.setTextureOffset(4, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r10 = new ModelPart(this);
		top_r10.setPivot(0.5F, 2.0F, 1.0F);
		rGem08.addChild(top_r10);
		setRotationAngle(top_r10, -0.7854F, 0.0F, 0.0F);
		top_r10.setTextureOffset(4, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem05 = new ModelPart(this);
		rGem05.setPivot(0.142F, 0.7935F, 0.1272F);
		rightWing04.addChild(rGem05);
		setRotationAngle(rGem05, -1.0472F, 0.0F, 0.0F);
		

		sideB_r11 = new ModelPart(this);
		sideB_r11.setPivot(0.5F, 6.0F, 2.0F);
		rGem05.addChild(sideB_r11);
		setRotationAngle(sideB_r11, -1.7453F, 0.0F, 0.0F);
		sideB_r11.setTextureOffset(4, 30).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r11 = new ModelPart(this);
		sideF_r11.setPivot(0.5F, 6.0F, -1.0F);
		rGem05.addChild(sideF_r11);
		setRotationAngle(sideF_r11, -1.3963F, 0.0F, 0.0F);
		sideF_r11.setTextureOffset(4, 30).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r11 = new ModelPart(this);
		largeTop_r11.setPivot(0.5F, 4.0F, 0.5F);
		rGem05.addChild(largeTop_r11);
		setRotationAngle(largeTop_r11, -0.7854F, 0.0F, 0.0F);
		largeTop_r11.setTextureOffset(8, 37).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r11 = new ModelPart(this);
		point_r11.setPivot(0.5F, 10.0F, 0.5F);
		rGem05.addChild(point_r11);
		setRotationAngle(point_r11, -0.7854F, 0.0F, 0.0F);
		point_r11.setTextureOffset(8, 43).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r11 = new ModelPart(this);
		top_r11.setPivot(0.5F, 2.0F, 1.0F);
		rGem05.addChild(top_r11);
		setRotationAngle(top_r11, -0.7854F, 0.0F, 0.0F);
		top_r11.setTextureOffset(8, 43).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem06 = new ModelPart(this);
		rGem06.setPivot(-0.3039F, 5.7996F, 0.357F);
		rightWing04.addChild(rGem06);
		setRotationAngle(rGem06, -1.0472F, 0.0F, 0.0F);
		

		sideB_r12 = new ModelPart(this);
		sideB_r12.setPivot(0.5F, 6.0F, 2.0F);
		rGem06.addChild(sideB_r12);
		setRotationAngle(sideB_r12, -1.7453F, 0.0F, 0.0F);
		sideB_r12.setTextureOffset(20, 30).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r12 = new ModelPart(this);
		sideF_r12.setPivot(0.5F, 6.0F, -1.0F);
		rGem06.addChild(sideF_r12);
		setRotationAngle(sideF_r12, -1.3963F, 0.0F, 0.0F);
		sideF_r12.setTextureOffset(20, 30).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r12 = new ModelPart(this);
		largeTop_r12.setPivot(0.5F, 4.0F, 0.5F);
		rGem06.addChild(largeTop_r12);
		setRotationAngle(largeTop_r12, -0.7854F, 0.0F, 0.0F);
		largeTop_r12.setTextureOffset(24, 37).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r12 = new ModelPart(this);
		point_r12.setPivot(0.5F, 10.0F, 0.5F);
		rGem06.addChild(point_r12);
		setRotationAngle(point_r12, -0.7854F, 0.0F, 0.0F);
		point_r12.setTextureOffset(24, 43).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r12 = new ModelPart(this);
		top_r12.setPivot(0.5F, 2.0F, 1.0F);
		rGem06.addChild(top_r12);
		setRotationAngle(top_r12, -0.7854F, 0.0F, 0.0F);
		top_r12.setTextureOffset(24, 43).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem04 = new ModelPart(this);
		rGem04.setPivot(0.4345F, -0.814F, 3.3462F);
		rightWing03.addChild(rGem04);
		setRotationAngle(rGem04, -0.1309F, 0.0F, 0.0F);
		

		sideB_r13 = new ModelPart(this);
		sideB_r13.setPivot(0.5F, 6.0F, 2.0F);
		rGem04.addChild(sideB_r13);
		setRotationAngle(sideB_r13, -1.7453F, 0.0F, 0.0F);
		sideB_r13.setTextureOffset(45, 11).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r13 = new ModelPart(this);
		sideF_r13.setPivot(0.5F, 6.0F, -1.0F);
		rGem04.addChild(sideF_r13);
		setRotationAngle(sideF_r13, -1.3963F, 0.0F, 0.0F);
		sideF_r13.setTextureOffset(45, 11).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r13 = new ModelPart(this);
		largeTop_r13.setPivot(0.5F, 4.0F, 0.5F);
		rGem04.addChild(largeTop_r13);
		setRotationAngle(largeTop_r13, -0.7854F, 0.0F, 0.0F);
		largeTop_r13.setTextureOffset(49, 18).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r13 = new ModelPart(this);
		point_r13.setPivot(0.5F, 10.0F, 0.5F);
		rGem04.addChild(point_r13);
		setRotationAngle(point_r13, -0.7854F, 0.0F, 0.0F);
		point_r13.setTextureOffset(49, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r13 = new ModelPart(this);
		top_r13.setPivot(0.5F, 2.0F, 1.0F);
		rGem04.addChild(top_r13);
		setRotationAngle(top_r13, -0.7854F, 0.0F, 0.0F);
		top_r13.setTextureOffset(49, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem01 = new ModelPart(this);
		rGem01.setPivot(-0.6635F, 0.2041F, -1.1535F);
		rightWing02.addChild(rGem01);
		

		sideB_r14 = new ModelPart(this);
		sideB_r14.setPivot(0.5F, 6.0F, 2.0F);
		rGem01.addChild(sideB_r14);
		setRotationAngle(sideB_r14, -1.7453F, 0.0F, 0.0F);
		sideB_r14.setTextureOffset(0, 11).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r14 = new ModelPart(this);
		sideF_r14.setPivot(0.5F, 6.0F, -1.0F);
		rGem01.addChild(sideF_r14);
		setRotationAngle(sideF_r14, -1.3963F, 0.0F, 0.0F);
		sideF_r14.setTextureOffset(0, 11).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r14 = new ModelPart(this);
		largeTop_r14.setPivot(0.5F, 4.0F, 0.5F);
		rGem01.addChild(largeTop_r14);
		setRotationAngle(largeTop_r14, -0.7854F, 0.0F, 0.0F);
		largeTop_r14.setTextureOffset(4, 18).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r14 = new ModelPart(this);
		point_r14.setPivot(0.5F, 10.0F, 0.5F);
		rGem01.addChild(point_r14);
		setRotationAngle(point_r14, -0.7854F, 0.0F, 0.0F);
		point_r14.setTextureOffset(4, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r14 = new ModelPart(this);
		top_r14.setPivot(0.5F, 2.0F, 1.0F);
		rGem01.addChild(top_r14);
		setRotationAngle(top_r14, -0.7854F, 0.0F, 0.0F);
		top_r14.setTextureOffset(4, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem02 = new ModelPart(this);
		rGem02.setPivot(-0.267F, -0.1566F, 4.027F);
		rightWing02.addChild(rGem02);
		setRotationAngle(rGem02, 0.0873F, 0.0F, 0.0F);
		

		sideB_r15 = new ModelPart(this);
		sideB_r15.setPivot(0.5F, 6.0F, 2.0F);
		rGem02.addChild(sideB_r15);
		setRotationAngle(sideB_r15, -1.7453F, 0.0F, 0.0F);
		sideB_r15.setTextureOffset(15, 11).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r15 = new ModelPart(this);
		sideF_r15.setPivot(0.5F, 6.0F, -1.0F);
		rGem02.addChild(sideF_r15);
		setRotationAngle(sideF_r15, -1.3963F, 0.0F, 0.0F);
		sideF_r15.setTextureOffset(15, 11).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r15 = new ModelPart(this);
		largeTop_r15.setPivot(0.5F, 4.0F, 0.5F);
		rGem02.addChild(largeTop_r15);
		setRotationAngle(largeTop_r15, -0.7854F, 0.0F, 0.0F);
		largeTop_r15.setTextureOffset(19, 18).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r15 = new ModelPart(this);
		point_r15.setPivot(0.5F, 10.0F, 0.5F);
		rGem02.addChild(point_r15);
		setRotationAngle(point_r15, -0.7854F, 0.0F, 0.0F);
		point_r15.setTextureOffset(19, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r15 = new ModelPart(this);
		top_r15.setPivot(0.5F, 2.0F, 1.0F);
		rGem02.addChild(top_r15);
		setRotationAngle(top_r15, -0.7854F, 0.0F, 0.0F);
		top_r15.setTextureOffset(19, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		rGem03 = new ModelPart(this);
		rGem03.setPivot(-0.1582F, -0.1549F, 7.1073F);
		rightWing02.addChild(rGem03);
		setRotationAngle(rGem03, 0.48F, 0.0F, 0.0F);
		

		sideB_r16 = new ModelPart(this);
		sideB_r16.setPivot(0.5F, 6.0F, 2.0F);
		rGem03.addChild(sideB_r16);
		setRotationAngle(sideB_r16, -1.7453F, 0.0F, 0.0F);
		sideB_r16.setTextureOffset(30, 11).addCuboid(-1.11F, -0.7F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		sideF_r16 = new ModelPart(this);
		sideF_r16.setPivot(0.5F, 6.0F, -1.0F);
		rGem03.addChild(sideF_r16);
		setRotationAngle(sideF_r16, -1.3963F, 0.0F, 0.0F);
		sideF_r16.setTextureOffset(30, 11).addCuboid(-1.12F, -1.6F, -0.5F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		largeTop_r16 = new ModelPart(this);
		largeTop_r16.setPivot(0.5F, 4.0F, 0.5F);
		rGem03.addChild(largeTop_r16);
		setRotationAngle(largeTop_r16, -0.7854F, 0.0F, 0.0F);
		largeTop_r16.setTextureOffset(34, 18).addCuboid(-1.1F, -0.5F, -0.3F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		point_r16 = new ModelPart(this);
		point_r16.setPivot(0.5F, 10.0F, 0.5F);
		rGem03.addChild(point_r16);
		setRotationAngle(point_r16, -0.7854F, 0.0F, 0.0F);
		point_r16.setTextureOffset(34, 24).addCuboid(-1.0F, -0.7F, -0.5F, 2.0F, 2.0F, 2.0F, -0.1F, true);

		top_r16 = new ModelPart(this);
		top_r16.setPivot(0.5F, 2.0F, 1.0F);
		rGem03.addChild(top_r16);
		setRotationAngle(top_r16, -0.7854F, 0.0F, 0.0F);
		top_r16.setTextureOffset(34, 24).addCuboid(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
	{
		super.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);

		if(state == State.IDLE || state == State.CROUCHING)
			leftWing03.pitch = (float) Math.toRadians(-50);
		if(state == State.FLYING)
			leftWing03.pitch = (float) Math.toRadians(45);

		rightWing03.pitch = leftWing03.pitch;
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z)
	{
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
}