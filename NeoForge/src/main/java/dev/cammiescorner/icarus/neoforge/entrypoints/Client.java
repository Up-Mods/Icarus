package dev.cammiescorner.icarus.neoforge.entrypoints;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.IcarusModels;
import dev.cammiescorner.icarus.client.models.*;
import dev.cammiescorner.icarus.client.renderers.WingsLayer;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.util.ColorHelper;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = Icarus.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client {

    @SubscribeEvent
    public static void onRegisterColorHandlers(RegisterColorHandlersEvent.Item event) {
        BuiltInRegistries.ITEM.entrySet().forEach(entry -> {
            var item = entry.getValue();
            var key = entry.getKey();
            if(key.location().getNamespace().equals(Icarus.MODID) && item instanceof WingItem) {
                event.register((itemStack, tintIndex) -> tintIndex == 0 ? ColorHelper.asARGB(((WingItem) itemStack.getItem()).getPrimaryColor(itemStack)) : ColorHelper.asARGB(((WingItem) itemStack.getItem()).getSecondaryColor(itemStack)), item);
            }
        });
    }

    @SubscribeEvent
    public static void onRegisterModelLayers(EntityRenderersEvent.AddLayers event) {
        for (var skin : event.getSkins()) {
            LivingEntityRenderer<Player, EntityModel<Player>> renderer = event.getSkin(skin);
            if (renderer != null) {
                renderer.addLayer(new WingsLayer<>(renderer, event.getEntityModels()));
            }
        }
    }

    @SubscribeEvent
    public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(IcarusModels.FEATHERED, FeatheredWingsModel::getLayerDefinition);
        event.registerLayerDefinition(IcarusModels.LEATHER, LeatherWingsModel::getLayerDefinition);
        event.registerLayerDefinition(IcarusModels.LIGHT, LightWingsModel::getLayerDefinition);
        event.registerLayerDefinition(IcarusModels.FLANDRE, FlandresWingsModel::getLayerDefinition);
        event.registerLayerDefinition(IcarusModels.DISCORD, DiscordsWingsModel::getLayerDefinition);
        event.registerLayerDefinition(IcarusModels.ZANZA, ZanzasWingsModel::getLayerDefinition);
    }
}
