package com.camscorner.icarus;

import com.camscorner.icarus.core.config.IcarusConfig;
import com.camscorner.icarus.core.network.client.DeleteHungerMessage;
import com.camscorner.icarus.core.registry.ModItems;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Icarus implements ModInitializer
{
	public static final String MOD_ID = "icarus";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.WHITE_FEATHERED_WINGS));
	public static IcarusConfig config;

	@Override
	public void onInitialize()
	{
		AutoConfig.register(IcarusConfig.class, JanksonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(IcarusConfig.class).getConfig();

		ServerPlayNetworking.registerGlobalReceiver(DeleteHungerMessage.ID, DeleteHungerMessage::handle);
		ModItems.register();
	}
}
