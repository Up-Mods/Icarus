package dev.cammiescorner.icarus.client;


import com.teamresourceful.resourcefulconfig.api.annotations.Category;
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigEntry;

@Category("client")
public final class IcarusClientConfig {

    @ConfigEntry(id = "can_loop_de_loop", translation = "config.icarus.can_loop_de_loop_client")
    public static boolean canLoopDeLoop = true;
}
