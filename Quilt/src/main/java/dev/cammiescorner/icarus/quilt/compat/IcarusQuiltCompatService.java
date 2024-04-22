package dev.cammiescorner.icarus.quilt.compat;

import dev.cammiescorner.icarus.util.IcarusCompatService;
import org.quiltmc.loader.api.QuiltLoader;

public class IcarusQuiltCompatService implements IcarusCompatService {

    @Override
    public boolean isModLoaded(String modid) {
        return QuiltLoader.isModLoaded(modid);
    }
}
