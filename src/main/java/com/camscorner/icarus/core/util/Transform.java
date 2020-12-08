// From CameraOverhaul, licensed under MIT.

package com.camscorner.icarus.core.util;

import net.minecraft.util.math.Vec3d;

public class Transform
{
	public Vec3d position;
	public Vec3d eulerRot;

	public Transform(Vec3d position, Vec3d eulerRot)
	{
		this.position = position;
		this.eulerRot = eulerRot;
	}
}
