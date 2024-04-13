package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.Icarus;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class IcarusItemTags {

    public static final TagKey<Item> MELTS = TagKey.create(Registries.ITEM, Icarus.id("melts"));
    public static final TagKey<Item> WING_REPAIR_ITEMS = TagKey.create(Registries.ITEM, Icarus.id("wing_repair_items"));
    public static final TagKey<Item> FREE_FLIGHT = TagKey.create(Registries.ITEM, Icarus.id("free_flight"));
}
