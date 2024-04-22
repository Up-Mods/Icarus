package dev.cammiescorner.icarus.fabric.compat;

import dev.cammiescorner.icarus.util.IcarusCompatService;
import net.fabricmc.loader.api.FabricLoader;

public class IcarusFabricCompatService implements IcarusCompatService {

    @Override
    public boolean isModLoaded(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }
}
