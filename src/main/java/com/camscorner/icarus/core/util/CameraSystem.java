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

package com.camscorner.icarus.core.util;

import com.camscorner.icarus.Icarus;
import com.camscorner.icarus.core.events.callbacks.CameraUpdateCallback;
import net.minecraft.client.render.Camera;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public final class CameraSystem implements CameraUpdateCallback
{
	private static double prevRollOffset;
	private static double lerpSpeed = 1.0D;

	public CameraSystem()
	{
		CameraUpdateCallback.EVENT.Register(this);
	}

	@Override
	public Transform onCameraUpdate(Camera camera, Transform cameraTransform, float deltaTime)
	{
		Vec3d velocity = camera.getFocusedEntity().getVelocity();
		Vec2f relativeXZVelocity = rotate(new Vec2f((float)velocity.x, (float)velocity.z), 360.0F - (float)cameraTransform.eulerRot.y);

		rollOffset(cameraTransform, relativeXZVelocity, deltaTime, -Icarus.config.rollAmount);

		return cameraTransform;
	}

	public static Vec2f rotate(Vec2f vec, float degrees)
	{
		double radians = Math.toRadians(degrees);
		float sin = (float) Math.sin(radians);
		float cos = (float) Math.cos(radians);

		return new Vec2f((cos * vec.x) - (sin * vec.y), (sin * vec.x) + (cos * vec.y));
	}

	private void rollOffset(Transform transform, Vec2f relativeXZVelocity, double deltaTime, float intensity)
	{
		double strafingRollOffset = -relativeXZVelocity.x * 15.0D;

		prevRollOffset = strafingRollOffset = lerp(prevRollOffset, strafingRollOffset, deltaTime * lerpSpeed);

		transform.eulerRot = transform.eulerRot.add(0.0D, 0.0D, strafingRollOffset * intensity);
	}

	public static double clamp(double value)
	{
		return value < 0f ? 0f : (value > 1f ? 1f : value);
	}

	public static double lerp(double a, double b, double time)
	{
		return a + (b - a) * clamp(time);
	}
}
