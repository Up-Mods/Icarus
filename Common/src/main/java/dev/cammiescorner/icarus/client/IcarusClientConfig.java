package dev.cammiescorner.icarus.client;


import com.teamresourceful.resourcefulconfig.api.annotations.Category;
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.api.types.options.EntryType;

@Category("client")
public final class IcarusClientConfig {

    @ConfigEntry(id = "can_loop_de_loop", type = EntryType.BOOLEAN, translation = "config.icarus.can_loop_de_loop_client")
    public static boolean canLoopDeLoop = true;
}
