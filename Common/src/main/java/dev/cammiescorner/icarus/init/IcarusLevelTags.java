package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.Icarus;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.dimension.LevelStem;

public class IcarusLevelTags {

    public static final TagKey<LevelStem> NO_FLYING_ALLOWED = TagKey.create(Registries.LEVEL_STEM, Icarus.id("no_flying_allowed"));
}
