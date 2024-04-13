// Made with Model Converter by Globox_Z
// Generate all required imports
package dev.cammiescorner.icarus.client.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class WingEntityModel<T extends LivingEntity> extends AgeableListModel<T> {
	public final ModelPart rightWing;
	public final ModelPart leftWing;
	public State state = State.IDLE;

	public WingEntityModel(ModelPart root) {
		this.rightWing = root.getChild("rightWing");
		this.leftWing = root.getChild("leftWing");
	}

	public static MeshDefinition getModelData() {
		MeshDefinition modelData = new MeshDefinition();
		PartDefinition modelPartData = modelData.getRoot();

		modelPartData.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.0F));
		modelPartData.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.0F));

		return modelData;
	}
	@Override
	public void setupAnim(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		state = State.IDLE;
		float a = 0.125F;
		float b = 0.1F;
		float k = 0.4F;
		float l = -0.5F;
		float m = -1.0F;
		float n = 0.0F;

		if(entity.isFallFlying()) {
			state = State.FLYING;
			float o = 1.0F;
			Vec3 vec3d = entity.getDeltaMovement();

			if(vec3d.y < 0.0D) {
				Vec3 vec3d2 = vec3d.normalize();
				o = 1.0F - (float) Math.pow(-vec3d2.y, 1.5D);
			}

			k = o * 0.35F + (1.0F - o) * k;
			l = o * -1.6F + (0.3F - o) * l;

			if(entity.zza > 0) {
				a = 0.4F;
				b = 1.0F;
			}
		}
		else if(entity.isCrouching()) {
			state = State.CROUCHING;
			k = 0.7F;
			m = 0.0F;
			n = 0.09F;
		}

		k += Mth.sin(entity.tickCount * a) * b;
		this.leftWing.x = 7.0F;
		this.leftWing.y = m;

		if(entity instanceof AbstractClientPlayer) {
			AbstractClientPlayer player = (AbstractClientPlayer) entity;
			player.elytraRotX = (player.elytraRotX + (k - player.elytraRotX) * 0.1F);
			player.elytraRotY = (player.elytraRotY + (n - player.elytraRotY) * 0.1F);
			player.elytraRotZ = (player.elytraRotZ + (l - player.elytraRotZ) * 0.1F);
			this.leftWing.xRot = player.elytraRotX;
			this.leftWing.yRot = player.elytraRotY;
			this.leftWing.zRot = player.elytraRotZ;
		}
		else {
			this.leftWing.xRot = k;
			this.leftWing.zRot = l;
			this.leftWing.yRot = n;
		}

		this.rightWing.x = -this.leftWing.x;
		this.rightWing.yRot = -this.leftWing.yRot;
		this.rightWing.y = this.leftWing.y;
		this.rightWing.xRot = this.leftWing.xRot;
		this.rightWing.zRot = -this.leftWing.zRot;
	}

	@Override
	protected Iterable<ModelPart> headParts() {
		return ImmutableList.of();
	}

	@Override
	protected Iterable<ModelPart> bodyParts() {
		return ImmutableList.of(this.rightWing, this.leftWing);
	}

	public enum State {
		IDLE, CROUCHING, FLYING
	}
}
