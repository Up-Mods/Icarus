package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.Icarus;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.dimension.DimensionType;

public class IcarusDimensionTypeTags {

    public static final TagKey<DimensionType> NO_FLYING_ALLOWED = TagKey.create(Registries.DIMENSION_TYPE, Icarus.id("no_flying_allowed"));
}
