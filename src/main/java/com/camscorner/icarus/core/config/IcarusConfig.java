package com.camscorner.icarus.core.config;

import com.camscorner.icarus.Icarus;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = Icarus.MOD_ID)
public class IcarusConfig implements ConfigData {
	public boolean armourSlows = true;
	public float maxSlowedMultiplier = 3F;
	public float wingsSpeed = 0.05F;
	public int wingsDurability = 431;
	public float wingsAcceleration = 0.05F;
	public float exhaustionAmount = 0.05F;
	public float rollAmount = 1.0F;
}
