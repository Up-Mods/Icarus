// From CameraOverhaul, licensed under MIT.

package com.camscorner.icarus.core.mixins;

import com.camscorner.icarus.core.callbacks.CameraUpdateCallback;
import com.camscorner.icarus.core.util.Transform;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.resource.SynchronousResourceReloadListener;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin implements SynchronousResourceReloadListener, AutoCloseable
{
	@Shadow
	@Final
	private MinecraftClient client;

	@Shadow
	@Final
	private Camera camera;

	@Inject(method = "renderWorld", at = @At(value = "INVOKE", shift = At.Shift.BEFORE, target = "Lnet/minecraft/client/render/WorldRenderer;render(Lnet/minecraft/client/util/math/MatrixStack;FJZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lnet/minecraft/client/render/LightmapTextureManager;Lnet/minecraft/util/math/Matrix4f;)V"))
	private void PostCameraUpdate(float tickDelta, long limitTime, MatrixStack matrix, CallbackInfo info)
	{
		if(client.player.isFallFlying())
		{
			Transform cameraTransform = new Transform(camera.getPos(), new Vec3d(camera.getPitch(), camera.getYaw(), 0D));

			cameraTransform = CameraUpdateCallback.EVENT.Invoker().onCameraUpdate(camera, cameraTransform, tickDelta);

			//Undo multiplications.
			matrix.multiply(Vector3f.NEGATIVE_Y.getDegreesQuaternion(camera.getYaw() + 180.0F));
			matrix.multiply(Vector3f.NEGATIVE_X.getDegreesQuaternion(camera.getPitch()));

			//And now redo them.
			matrix.multiply(Vector3f.POSITIVE_Z.getDegreesQuaternion((float) cameraTransform.eulerRot.z));
			matrix.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion((float) cameraTransform.eulerRot.x));
			matrix.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion((float) cameraTransform.eulerRot.y + 180.0F));
		}
	}
}
