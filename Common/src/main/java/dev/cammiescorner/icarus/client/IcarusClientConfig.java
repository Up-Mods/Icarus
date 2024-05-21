package dev.cammiescorner.icarus.client;

import com.teamresourceful.resourcefulconfig.common.annotations.Category;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;

@Category(id = "client", translation = "config_category.icarus.client")
public final class IcarusClientConfig {

    @ConfigEntry(id = "can_loop_de_loop", type = EntryType.BOOLEAN, translation = "config.icarus.can_loop_de_loop_client")
    public static boolean canLoopDeLoop = true;
}
