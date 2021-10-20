package dev.cammiescorner.icarus.core.integration;

import dev.cammiescorner.icarus.Icarus;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = Icarus.MOD_ID)
public class IcarusConfig implements ConfigData {
	public boolean canLoopdeloop = true;
	public boolean armourSlows = true;
	public float maxSlowedMultiplier = 3F;
	public float wingsSpeed = 0.02F;
	public int wingsDurability = 432;
	public float exhaustionAmount = 0.03F;
	public float rollAmount = 1.0F;
}
