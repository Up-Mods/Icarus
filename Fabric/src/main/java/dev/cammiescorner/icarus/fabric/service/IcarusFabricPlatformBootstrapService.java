package dev.cammiescorner.icarus.fabric.service;

import dev.cammiescorner.icarus.util.IcarusPlatformBootstrapService;
import net.fabricmc.loader.api.FabricLoader;

public class IcarusFabricPlatformBootstrapService implements IcarusPlatformBootstrapService {

    @Override
    public boolean isModLoaded(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }
}
