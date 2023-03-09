package dev.cammiescorner.icarus.core.integration;

import eu.midnightdust.lib.config.MidnightConfig;

public class IcarusConfig extends MidnightConfig {
	@Entry public static boolean canLoopDeLoop = true;
	@Entry public static boolean armourSlows = true;
	@Entry public static boolean canSlowFall = false;
	@Entry public static float maxSlowedMultiplier = 3F;
	@Entry public static float wingsSpeed = 0.02F;
	@Entry public static int wingsDurability = 0;
	@Entry public static float exhaustionAmount = 0.03F;
	@Entry public static float rollAmount = 1.0F;
}
