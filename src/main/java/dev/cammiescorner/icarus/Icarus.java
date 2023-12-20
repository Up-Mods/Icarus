package dev.cammiescorner.icarus;

import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import dev.cammiescorner.icarus.core.integration.IcarusOrigins;
import dev.cammiescorner.icarus.core.network.c2s.DeleteHungerMessage;
import dev.cammiescorner.icarus.core.registry.ModItems;
import dev.cammiescorner.icarus.core.util.DefaultWingsValues;
import dev.cammiescorner.icarus.core.util.EventHandler;
import dev.cammiescorner.icarus.core.util.WingsValues;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.Entity;

import java.util.function.Function;
import java.util.function.Predicate;

public class Icarus implements ModInitializer {
	public static final String MOD_ID = "icarus";
	public static final Predicate<Entity> HAS_WINGS = FabricLoader.getInstance().isModLoaded("origins") ? IcarusOrigins::hasWings : entity -> false;
	public static final Function<Entity, WingsValues> WINGS = FabricLoader.getInstance().isModLoaded("origins") ? IcarusOrigins.getWingValues() : (entity) -> DefaultWingsValues.INSTANCE;

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, IcarusConfig.class);

		ServerPlayNetworking.registerGlobalReceiver(DeleteHungerMessage.ID, DeleteHungerMessage::handle);
		ModItems.register();
		EventHandler.commonEvents();

		if(FabricLoader.getInstance().isModLoaded("origins"))
			IcarusOrigins.register();
	}
}
