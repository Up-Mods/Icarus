package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.Icarus;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class IcarusDimensionTags {

    public static final TagKey<Level> NO_FLYING_ALLOWED = TagKey.create(Registries.DIMENSION, Icarus.id("no_flying_allowed"));
}
