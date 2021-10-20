package dev.cammiescorner.icarus;

import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import dev.cammiescorner.icarus.core.integration.IcarusOrigins;
import dev.cammiescorner.icarus.core.network.client.DeleteHungerMessage;
import dev.cammiescorner.icarus.core.registry.ModItems;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.function.Predicate;

public class Icarus implements ModInitializer {
	public static final String MOD_ID = "icarus";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.WHITE_FEATHERED_WINGS));
	public static final Predicate<Entity> HAS_POWERED_FLIGHT = FabricLoader.getInstance().isModLoaded("origins") ? IcarusOrigins::hasPoweredFlight : entity -> false;
	private static ConfigHolder<IcarusConfig> configHolder;

	@Override
	public void onInitialize() {
		AutoConfig.register(IcarusConfig.class, JanksonConfigSerializer::new);
		configHolder = AutoConfig.getConfigHolder(IcarusConfig.class);

		ServerPlayNetworking.registerGlobalReceiver(DeleteHungerMessage.ID, DeleteHungerMessage::handle);
		ModItems.register();
	}

	public static IcarusConfig getConfig() {
		return configHolder.getConfig();
	}
}
