package dev.cammiescorner.icarus.core.util;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;

public class EventHandler {
	public static void commonEvents() {
		EntityElytraEvents.CUSTOM.register((entity, tickElytra) -> TrinketsApi.getTrinketComponent(entity).filter(trinketComponent -> trinketComponent.isEquipped(stack -> stack.getItem() instanceof WingItem) || Icarus.HAS_POWERED_FLIGHT.test(entity)).isPresent());
	}
}
