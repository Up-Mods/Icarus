package dev.cammiescorner.icarus.core.util;

import net.minecraft.item.Item;

public interface WingsValues {
	Item getWings();

	float getArmourSlowMultiplier();

	float getSpeed();

	boolean canFly();

	boolean doesArmourSlow();
}
