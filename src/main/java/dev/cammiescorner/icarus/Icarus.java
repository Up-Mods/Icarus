package dev.cammiescorner.icarus;

import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import dev.cammiescorner.icarus.core.network.c2s.DeleteHungerMessage;
import dev.cammiescorner.icarus.core.registry.ModItems;
import dev.cammiescorner.icarus.core.util.EventHandler;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class Icarus implements ModInitializer {
	public static final String MOD_ID = "icarus";

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, IcarusConfig.class);

		ServerPlayNetworking.registerGlobalReceiver(DeleteHungerMessage.ID, DeleteHungerMessage::handle);
		ModItems.register();
		EventHandler.commonEvents();
	}
}
