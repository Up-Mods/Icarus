/**
 * MIT License
 *
 * Copyright (c) 2020 Mirsario
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.cammiescorner.icarus.core.mixins.client;

import dev.cammiescorner.icarus.common.items.WingItem;
import dev.cammiescorner.icarus.core.events.callbacks.CameraUpdateCallback;
import dev.cammiescorner.icarus.core.util.Transform;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.resource.SynchronousResourceReloader;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin implements SynchronousResourceReloader, AutoCloseable
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
		Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(client.player);
		boolean isWingItem = component.isPresent() && component.get().isEquipped(itemStack -> itemStack.getItem() instanceof WingItem);

		if(client.player.isFallFlying() && isWingItem)
		{
			Transform cameraTransform = new Transform(camera.getPos(), new Vec3d(camera.getPitch(), camera.getYaw(), 0D));

			cameraTransform = CameraUpdateCallback.EVENT.Invoker().onCameraUpdate(camera, cameraTransform, tickDelta);

			//Undo multiplications.
			matrix.multiply(Vec3f.NEGATIVE_Y.getDegreesQuaternion(camera.getYaw() + 180.0F));
			matrix.multiply(Vec3f.NEGATIVE_X.getDegreesQuaternion(camera.getPitch()));

			//And now redo them.
			matrix.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion((float) cameraTransform.eulerRot.z));
			matrix.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion((float) cameraTransform.eulerRot.x));
			matrix.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion((float) cameraTransform.eulerRot.y + 180.0F));
		}
	}
}
