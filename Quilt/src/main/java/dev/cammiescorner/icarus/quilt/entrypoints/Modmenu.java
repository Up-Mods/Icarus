package dev.cammiescorner.icarus.quilt.entrypoints;

import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.IcarusConfig;

public class Modmenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> new ConfigScreen(parent, null, Icarus.CONFIGURATOR.getConfig(IcarusConfig.class));
    }
}
