package dev.cammiescorner.icarus.core.util;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.cammiescorner.icarus.core.network.s2c.SyncConfigValuesPacket;
import dev.emi.trinkets.api.TrinketsApi;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class EventHandler {
	public static void commonEvents() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> SyncConfigValuesPacket.send(handler.player));

		EntityElytraEvents.CUSTOM.register((entity, tickElytra) -> TrinketsApi.getTrinketComponent(entity).filter(trinketComponent -> trinketComponent.isEquipped(stack -> stack.getItem() instanceof WingItem) || Icarus.HAS_WINGS.test(entity)).isPresent());
	}
}
