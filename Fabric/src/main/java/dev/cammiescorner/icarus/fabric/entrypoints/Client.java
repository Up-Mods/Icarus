package dev.cammiescorner.icarus.fabric.entrypoints;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.IcarusModels;
import dev.cammiescorner.icarus.client.models.*;
import dev.cammiescorner.icarus.client.renderers.WingsLayer;
import dev.cammiescorner.icarus.fabric.compat.CameraOverhaulCompat;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.util.ColorHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(IcarusModels.FEATHERED, FeatheredWingsModel::getLayerDefinition);
        EntityModelLayerRegistry.registerModelLayer(IcarusModels.LEATHER, LeatherWingsModel::getLayerDefinition);
        EntityModelLayerRegistry.registerModelLayer(IcarusModels.LIGHT, LightWingsModel::getLayerDefinition);
        EntityModelLayerRegistry.registerModelLayer(IcarusModels.FLANDRE, FlandresWingsModel::getLayerDefinition);
        EntityModelLayerRegistry.registerModelLayer(IcarusModels.DISCORD, DiscordsWingsModel::getLayerDefinition);
        EntityModelLayerRegistry.registerModelLayer(IcarusModels.ZANZA, ZanzasWingsModel::getLayerDefinition);
        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper, context) -> {
            if (entityType == EntityType.PLAYER) {
                registrationHelper.register(new WingsLayer<>(entityRenderer, context.getModelSet()));
            }
        });

        BuiltInRegistries.ITEM.entrySet().forEach(entry -> {
            var item = entry.getValue();
            var key = entry.getKey();
            if (key.location().getNamespace().equals(Icarus.MODID) && item instanceof WingItem) {
                registerColorProvider(item);
            }
        });
        RegistryEntryAddedCallback.event(BuiltInRegistries.ITEM).register((rawId, id, object) -> {
            if (id.getNamespace().equals(Icarus.MODID) && object instanceof WingItem) {
                registerColorProvider(object);
            }
        });

        if (FabricLoader.getInstance().isModLoaded("cameraoverhaul")) {
            CameraOverhaulCompat.load();
        }
    }

    private static void registerColorProvider(Item item) {
        ColorProviderRegistry.ITEM.register((itemStack, tintIndex) -> tintIndex == 0 ? ColorHelper.dyeToDecimal(((WingItem) itemStack.getItem()).getPrimaryColor(itemStack)) : ColorHelper.dyeToDecimal(((WingItem) itemStack.getItem()).getSecondaryColor(itemStack)), item);
    }
}
