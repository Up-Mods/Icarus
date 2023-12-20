package dev.cammiescorner.icarus.core.util;

import dev.cammiescorner.icarus.core.registry.ModItems;
import net.minecraft.item.Item;

public class DefaultWingsValues implements WingsValues {
	public static final WingsValues INSTANCE = new DefaultWingsValues();

	@Override
	public Item getWings() {
		return ModItems.WHITE_FEATHERED_WINGS;
	}

	@Override
	public float getArmourSlowMultiplier() {
		return 3;
	}

	@Override
	public float getSpeed() {
		return 0.02F;
	}

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public boolean doesArmourSlow() {
		return true;
	}
}
