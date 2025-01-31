package dev.cammiescorner.icarus.neoforge.service;

import dev.cammiescorner.icarus.util.IcarusPlatformBootstrapService;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.moddiscovery.ModInfo;

public class IcarusNeoforgePlatformBootstrapService implements IcarusPlatformBootstrapService {

    @Override
    public boolean isModLoaded(String modid) {
        return FMLLoader.getLoadingModList().getMods().stream().map(ModInfo::getModId).anyMatch(modid::equals);
    }
}
