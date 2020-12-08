package com.camscorner.icarus;

import com.camscorner.icarus.core.registry.ModItems;
import com.camscorner.icarus.core.util.CameraSystem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Icarus implements ModInitializer
{
	public static final String MOD_ID = "icarus";
	public CameraSystem cameraSystem;
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.WHITE_FEATHERED_WINGS));

	@Override
	public void onInitialize()
	{
		if(!FabricLoader.getInstance().isModLoaded("cameraoverhaul"))
			cameraSystem = new CameraSystem();

		ModItems.register();
	}
}
