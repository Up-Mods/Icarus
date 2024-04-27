package dev.cammiescorner.icarus.api;

import dev.cammiescorner.icarus.init.IcarusDimensionTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;

public interface IcarusPlayerValues {

    float wingsSpeed();

    float maxSlowedMultiplier();

    boolean armorSlows();

    boolean canLoopDeLoop();

    boolean canSlowFall();

    float exhaustionAmount();

    int maxHeightAboveWorld();

    boolean maxHeightEnabled();

    default TagKey<Level> noFlyingAllowedInDimensions() {
        return IcarusDimensionTags.NO_FLYING_ALLOWED;
    }
}
