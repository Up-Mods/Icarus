package com.camscorner.icarus;

import com.camscorner.icarus.core.config.IcarusConfig;
import com.camscorner.icarus.core.network.client.DeleteHungerMessage;
import com.camscorner.icarus.core.registry.ModItems;
import com.camscorner.icarus.core.util.CameraSystem;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.network.ServerSidePacketRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Icarus implements ModInitializer
{
	public static final String MOD_ID = "icarus";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.WHITE_FEATHERED_WINGS));
	public static IcarusConfig config;
	public CameraSystem cameraSystem;

	@Override
	public void onInitialize()
	{
		AutoConfig.register(IcarusConfig.class, GsonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(IcarusConfig.class).getConfig();

		if(!FabricLoader.getInstance().isModLoaded("cameraoverhaul"))
			cameraSystem = new CameraSystem();

		ServerSidePacketRegistry.INSTANCE.register(DeleteHungerMessage.ID, DeleteHungerMessage::handle);
		ModItems.register();
	}
}
