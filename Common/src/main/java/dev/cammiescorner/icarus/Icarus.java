package dev.cammiescorner.icarus;

import com.teamresourceful.resourcefulconfig.api.loader.Configurator;
import commonnetwork.api.Network;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.init.IcarusStatusEffects;
import dev.cammiescorner.icarus.network.s2c.SyncConfigValuesPacket;
import dev.cammiescorner.icarus.util.IcarusHelper;
import dev.cammiescorner.icarus.util.ServerPlayerFallbackValues;
import dev.upcraft.sparkweave.api.entrypoint.MainEntryPoint;
import dev.upcraft.sparkweave.api.event.EntityTickEvents;
import dev.upcraft.sparkweave.api.event.LifeCycleEvents;
import dev.upcraft.sparkweave.api.platform.ModContainer;
import dev.upcraft.sparkweave.api.platform.services.RegistryService;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

public class Icarus implements MainEntryPoint {

    public static final String MODID = "icarus";
    private static final Configurator CONFIGURATOR = new Configurator(MODID);

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    @Override
    public void onInitialize(ModContainer mod) {
        CONFIGURATOR.register(IcarusConfig.class);

        Network.registerPacket(SyncConfigValuesPacket.TYPE, SyncConfigValuesPacket.class, SyncConfigValuesPacket.STREAM_CODEC, SyncConfigValuesPacket::handle);

        LifeCycleEvents.SERVER_STARTING.register(server -> IcarusHelper.fallbackValues = new ServerPlayerFallbackValues());
        EntityTickEvents.startTick(ServerPlayer.class).register(IcarusHelper::onPlayerTick);

        var registryService = RegistryService.get();
        IcarusItems.ITEMS.accept(registryService);
        IcarusItems.CREATIVE_TABS.accept(registryService);
        IcarusStatusEffects.STATUS_EFFECTS.accept(registryService);
    }
}
