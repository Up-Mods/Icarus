package dev.cammiescorner.icarus.neoforge.compat;

import dev.cammiescorner.icarus.util.IcarusCompatService;
import net.minecraftforge.fml.ModList;

public class IcarusNeoforgeCompatService implements IcarusCompatService {

    @Override
    public boolean isModLoaded(String modid) {
        return ModList.get().isLoaded(modid);
    }
}
