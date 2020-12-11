package com.camscorner.icarus.core.config;

import com.camscorner.icarus.Icarus;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = Icarus.MOD_ID)
public class IcarusConfig implements ConfigData
{
	public float wingsSpeed = 0.05F;
	public float wingsAcceleration = 0.05F;
	public float exhaustionAmount = 0.05F;
	public float rollAmount = 1.0F;
}
