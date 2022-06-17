package dev.cammiescorner.icarus.client;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.models.*;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.cammiescorner.icarus.core.util.CameraSystem;
import dev.cammiescorner.icarus.core.util.ColourHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static dev.cammiescorner.icarus.core.registry.ModItems.*;

@Environment(EnvType.CLIENT)
public class IcarusClient implements ClientModInitializer {
	public static final EntityModelLayer FEATHERED = new EntityModelLayer(new Identifier(Icarus.MOD_ID, "feathered"), "main");
	public static final EntityModelLayer LEATHER = new EntityModelLayer(new Identifier(Icarus.MOD_ID, "leather"), "main");
	public static final EntityModelLayer LIGHT = new EntityModelLayer(new Identifier(Icarus.MOD_ID, "light"), "main");
	public static final EntityModelLayer FLANDRE = new EntityModelLayer(new Identifier(Icarus.MOD_ID, "flandre"), "main");
	public static final EntityModelLayer DISCORD = new EntityModelLayer(new Identifier(Icarus.MOD_ID, "discord"), "main");
	public static final EntityModelLayer ZANZA = new EntityModelLayer(new Identifier(Icarus.MOD_ID, "zanza"), "main");

	@Override
	public void onInitializeClient() {
		if(!FabricLoader.getInstance().isModLoaded("cameraoverhaul"))
			new CameraSystem();

		EntityModelLayerRegistry.registerModelLayer(FEATHERED, FeatheredWingsModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(LEATHER, LeatherWingsModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(LIGHT, LightWingsModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(FLANDRE, FlandresWingsModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(DISCORD, DiscordsWingsModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(ZANZA, ZanzasWingsModel::getTexturedModelData);

		ColorProviderRegistryImpl.ITEM.register((stack, tintIndex) -> tintIndex == 0 ? ColourHelper.dyeToDecimal(((WingItem) stack.getItem()).getPrimaryColour()) : ColourHelper.dyeToDecimal(((WingItem) stack.getItem()).getSecondaryColour()),
				WHITE_FEATHERED_WINGS, ORANGE_FEATHERED_WINGS, MAGENTA_FEATHERED_WINGS, LIGHT_BLUE_FEATHERED_WINGS, YELLOW_FEATHERED_WINGS, LIME_FEATHERED_WINGS, PINK_FEATHERED_WINGS, GREY_FEATHERED_WINGS, LIGHT_GREY_FEATHERED_WINGS, CYAN_FEATHERED_WINGS, PURPLE_FEATHERED_WINGS, BLUE_FEATHERED_WINGS, BROWN_FEATHERED_WINGS, GREEN_FEATHERED_WINGS, RED_FEATHERED_WINGS, BLACK_FEATHERED_WINGS,
				WHITE_DRAGON_WINGS, ORANGE_DRAGON_WINGS, MAGENTA_DRAGON_WINGS, LIGHT_BLUE_DRAGON_WINGS, YELLOW_DRAGON_WINGS, LIME_DRAGON_WINGS, PINK_DRAGON_WINGS, GREY_DRAGON_WINGS, LIGHT_GREY_DRAGON_WINGS, CYAN_DRAGON_WINGS, PURPLE_DRAGON_WINGS, BLUE_DRAGON_WINGS, BROWN_DRAGON_WINGS, GREEN_DRAGON_WINGS, RED_DRAGON_WINGS, BLACK_DRAGON_WINGS,
				WHITE_MECHANICAL_FEATHERED_WINGS, ORANGE_MECHANICAL_FEATHERED_WINGS, MAGENTA_MECHANICAL_FEATHERED_WINGS, LIGHT_BLUE_MECHANICAL_FEATHERED_WINGS, YELLOW_MECHANICAL_FEATHERED_WINGS, LIME_MECHANICAL_FEATHERED_WINGS, PINK_MECHANICAL_FEATHERED_WINGS, GREY_MECHANICAL_FEATHERED_WINGS, LIGHT_GREY_MECHANICAL_FEATHERED_WINGS, CYAN_MECHANICAL_FEATHERED_WINGS, PURPLE_MECHANICAL_FEATHERED_WINGS, BLUE_MECHANICAL_FEATHERED_WINGS, BROWN_MECHANICAL_FEATHERED_WINGS, GREEN_MECHANICAL_FEATHERED_WINGS, RED_MECHANICAL_FEATHERED_WINGS, BLACK_MECHANICAL_FEATHERED_WINGS,
				WHITE_MECHANICAL_LEATHER_WINGS, ORANGE_MECHANICAL_LEATHER_WINGS, MAGENTA_MECHANICAL_LEATHER_WINGS, LIGHT_BLUE_MECHANICAL_LEATHER_WINGS, YELLOW_MECHANICAL_LEATHER_WINGS, LIME_MECHANICAL_LEATHER_WINGS, PINK_MECHANICAL_LEATHER_WINGS, GREY_MECHANICAL_LEATHER_WINGS, LIGHT_GREY_MECHANICAL_LEATHER_WINGS, CYAN_MECHANICAL_LEATHER_WINGS, PURPLE_MECHANICAL_LEATHER_WINGS, BLUE_MECHANICAL_LEATHER_WINGS, BROWN_MECHANICAL_LEATHER_WINGS, GREEN_MECHANICAL_LEATHER_WINGS, RED_MECHANICAL_LEATHER_WINGS, BLACK_MECHANICAL_LEATHER_WINGS,
				WHITE_LIGHT_WINGS, ORANGE_LIGHT_WINGS, MAGENTA_LIGHT_WINGS, LIGHT_BLUE_LIGHT_WINGS, YELLOW_LIGHT_WINGS, LIME_LIGHT_WINGS, PINK_LIGHT_WINGS, GREY_LIGHT_WINGS, LIGHT_GREY_LIGHT_WINGS, CYAN_LIGHT_WINGS, PURPLE_LIGHT_WINGS, BLUE_LIGHT_WINGS, BROWN_LIGHT_WINGS, GREEN_LIGHT_WINGS, RED_LIGHT_WINGS, BLACK_LIGHT_WINGS);
	}
}
