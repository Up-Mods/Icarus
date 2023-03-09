package dev.cammiescorner.icarus.common.powers;

import dev.cammiescorner.icarus.common.items.WingItem;
import dev.cammiescorner.icarus.core.registry.ModItems;
import dev.cammiescorner.icarus.core.util.WingsValues;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class WingsPower extends Power implements WingsValues {
	private Item wingsItem;
	private final Identifier wingsId;
	private final float speed, armourSlowMultiplier;
	private final boolean canFly, armourSlows;

	public WingsPower(PowerType<?> type, LivingEntity entity, Identifier wingsId, float speed, float armourSlowMultiplier, boolean canFly, boolean armourSlows) {
		super(type, entity);
		this.wingsId = wingsId;
		this.speed = speed;
		this.canFly = canFly;
		this.armourSlowMultiplier = armourSlowMultiplier;
		this.armourSlows = armourSlows;
	}

	@Override
	public Item getWings() {
		if(wingsItem == null)
			wingsItem = Registries.ITEM.get(wingsId) instanceof WingItem wings ? wings : ModItems.WHITE_FEATHERED_WINGS;

		return wingsItem;
	}

	@Override
	public float getArmourSlowMultiplier() {
		return armourSlowMultiplier;
	}

	@Override
	public float getSpeed() {
		return speed;
	}

	@Override
	public boolean canFly() {
		return canFly;
	}

	@Override
	public boolean doesArmourSlow() {
		return armourSlows;
	}
}
