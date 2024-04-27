package dev.cammiescorner.icarus.util;

import dev.cammiescorner.icarus.IcarusConfig;
import dev.cammiescorner.icarus.api.IcarusPlayerValues;
import dev.cammiescorner.icarus.init.IcarusDimensionTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;

public class ServerPlayerFallbackValues implements IcarusPlayerValues {

    @Override
    public float wingsSpeed() {
        return IcarusConfig.wingsSpeed;
    }

    @Override
    public float maxSlowedMultiplier() {
        return IcarusConfig.maxSlowedMultiplier;
    }

    @Override
    public boolean armorSlows() {
        return IcarusConfig.armorSlows;
    }

    @Override
    public boolean canLoopDeLoop() {
        return IcarusConfig.canLoopDeLoop;
    }

    @Override
    public boolean canSlowFall() {
        return IcarusConfig.canSlowFall;
    }

    @Override
    public float exhaustionAmount() {
        return IcarusConfig.exhaustionAmount;
    }

    @Override
    public boolean maxHeightEnabled() {
        return IcarusConfig.maxHeightEnabled;
    }

    @Override
    public TagKey<Level> noFlyingAllowedInDimensions() {
        return IcarusDimensionTags.NO_FLYING_ALLOWED;
    }

    @Override
    public int maxHeightAboveWorld() {
        return IcarusConfig.maxHeightAboveWorld;
    }
}
