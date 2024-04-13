/**
 * MIT License
 * <p>
 * Copyright (c) 2020 Mirsario
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.cammiescorner.icarus.quilt.compat;

import dev.cammiescorner.icarus.IcarusConfig;
import mirsario.cameraoverhaul.core.callbacks.CameraUpdateCallback;
import mirsario.cameraoverhaul.core.callbacks.ModifyCameraTransformCallback;
import mirsario.cameraoverhaul.core.structures.Transform;
import net.minecraft.client.Camera;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class CameraOverhaulCompat implements CameraUpdateCallback, ModifyCameraTransformCallback {

    private double prevRollOffset;
    private Transform storedTransform;

    public static void load() {
        CameraUpdateCallback.EVENT.Register(new CameraOverhaulCompat());
    }

    @Override
    public void OnCameraUpdate(Entity entity, Camera camera, Transform cameraTransform, float deltaTime) {
        float pitch = camera.getXRot();
        float rollAmount = (pitch < -90 || pitch > 90) ? IcarusConfig.rollAmount : -IcarusConfig.rollAmount;
        Vec3 velocity = camera.getEntity().getDeltaMovement();
        Vec2 relativeXZVelocity = rotate(new Vec2((float) velocity.x, (float) velocity.z), 360.0F - (float) cameraTransform.eulerRot.y);

        rollOffset(cameraTransform, relativeXZVelocity, deltaTime, rollAmount);

        storedTransform = cameraTransform;
    }

    public static Vec2 rotate(Vec2 vec, float degrees) {
        double radians = Math.toRadians(degrees);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);

        return new Vec2((cos * vec.x) - (sin * vec.y), (sin * vec.x) + (cos * vec.y));
    }

    private void rollOffset(Transform transform, Vec2 relativeXZVelocity, double deltaTime, float intensity) {
        double strafingRollOffset = -relativeXZVelocity.x * 15.0D;
        double lerpSpeed = 1.0D;

        prevRollOffset = strafingRollOffset = Mth.lerp(Mth.clamp(deltaTime * lerpSpeed, 0.0D, 1.0D), prevRollOffset, strafingRollOffset);

        transform.eulerRot = transform.eulerRot.add(0.0D, 0.0D, strafingRollOffset * intensity);
    }

    @Override
    public Transform ModifyCameraTransform(Camera camera, Transform transform) {
        return storedTransform != null ? storedTransform : transform;
    }
}
