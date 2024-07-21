package dev.cammiescorner.icarus;

import com.teamresourceful.resourcefulconfig.api.loader.Configurator;
import commonnetwork.api.Network;
import dev.cammiescorner.icarus.network.s2c.SyncConfigValuesPacket;
import dev.cammiescorner.icarus.util.IcarusHelper;
import dev.cammiescorner.icarus.util.ServerPlayerFallbackValues;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;

public class Icarus {

    public static final String MODID = "icarus";
    public static final Configurator CONFIGURATOR = new Configurator(MODID);

    public static void init() {
        CONFIGURATOR.register(IcarusConfig.class);

        Network.registerPacket(SyncConfigValuesPacket.ID, SyncConfigValuesPacket.class, SyncConfigValuesPacket::encode, SyncConfigValuesPacket::decode, SyncConfigValuesPacket::handle);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, path);
    }

    public static void onServerStart(MinecraftServer server) {
        IcarusHelper.fallbackValues = new ServerPlayerFallbackValues();
    }
}
