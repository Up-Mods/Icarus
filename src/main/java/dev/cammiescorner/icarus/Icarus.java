package dev.cammiescorner.icarus;

import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import dev.cammiescorner.icarus.core.integration.IcarusOrigins;
import dev.cammiescorner.icarus.core.network.client.DeleteHungerMessage;
import dev.cammiescorner.icarus.core.registry.ModItems;
import dev.cammiescorner.icarus.core.util.EventHandler;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.Entity;

import java.util.function.Predicate;

public class Icarus implements ModInitializer {
	public static final String MOD_ID = "icarus";
	public static final Predicate<Entity> HAS_POWERED_FLIGHT = FabricLoader.getInstance().isModLoaded("origins") ? IcarusOrigins::hasPoweredFlight : entity -> false;

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, IcarusConfig.class);

		ServerPlayNetworking.registerGlobalReceiver(DeleteHungerMessage.ID, DeleteHungerMessage::handle);
		ModItems.register();
		EventHandler.commonEvents();
	}
}
