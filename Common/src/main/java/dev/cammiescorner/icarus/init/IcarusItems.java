package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.item.WingItem;
import dev.upcraft.sparkweave.api.item.CreativeTabHelper;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class IcarusItems {

    public static final RegistryHandler<CreativeModeTab> CREATIVE_TABS = RegistryHandler.create(Registries.CREATIVE_MODE_TAB, Icarus.MODID);
    public static final RegistryHandler<Item> ITEMS = RegistryHandler.create(Registries.ITEM, Icarus.MODID);

    public static final RegistrySupplier<WingItem> WHITE_FEATHERED_WINGS = ITEMS.register("white_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> ORANGE_FEATHERED_WINGS = ITEMS.register("orange_feathered_wings", () -> new WingItem(DyeColor.ORANGE, DyeColor.ORANGE, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> MAGENTA_FEATHERED_WINGS = ITEMS.register("magenta_feathered_wings", () -> new WingItem(DyeColor.MAGENTA, DyeColor.MAGENTA, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> LIGHT_BLUE_FEATHERED_WINGS = ITEMS.register("light_blue_feathered_wings", () -> new WingItem(DyeColor.LIGHT_BLUE, DyeColor.LIGHT_BLUE, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> YELLOW_FEATHERED_WINGS = ITEMS.register("yellow_feathered_wings", () -> new WingItem(DyeColor.YELLOW, DyeColor.YELLOW, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> LIME_FEATHERED_WINGS = ITEMS.register("lime_feathered_wings", () -> new WingItem(DyeColor.LIME, DyeColor.LIME, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> PINK_FEATHERED_WINGS = ITEMS.register("pink_feathered_wings", () -> new WingItem(DyeColor.PINK, DyeColor.PINK, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> GRAY_FEATHERED_WINGS = ITEMS.register("gray_feathered_wings", () -> new WingItem(DyeColor.GRAY, DyeColor.GRAY, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> LIGHT_GRAY_FEATHERED_WINGS = ITEMS.register("light_gray_feathered_wings", () -> new WingItem(DyeColor.LIGHT_GRAY, DyeColor.LIGHT_GRAY, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> CYAN_FEATHERED_WINGS = ITEMS.register("cyan_feathered_wings", () -> new WingItem(DyeColor.CYAN, DyeColor.CYAN, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> PURPLE_FEATHERED_WINGS = ITEMS.register("purple_feathered_wings", () -> new WingItem(DyeColor.PURPLE, DyeColor.PURPLE, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> BLUE_FEATHERED_WINGS = ITEMS.register("blue_feathered_wings", () -> new WingItem(DyeColor.BLUE, DyeColor.BLUE, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> BROWN_FEATHERED_WINGS = ITEMS.register("brown_feathered_wings", () -> new WingItem(DyeColor.BROWN, DyeColor.BROWN, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> GREEN_FEATHERED_WINGS = ITEMS.register("green_feathered_wings", () -> new WingItem(DyeColor.GREEN, DyeColor.GREEN, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> RED_FEATHERED_WINGS = ITEMS.register("red_feathered_wings", () -> new WingItem(DyeColor.RED, DyeColor.RED, WingItem.WingType.FEATHERED));
    public static final RegistrySupplier<WingItem> BLACK_FEATHERED_WINGS = ITEMS.register("black_feathered_wings", () -> new WingItem(DyeColor.BLACK, DyeColor.BLACK, WingItem.WingType.FEATHERED));

    public static final RegistrySupplier<WingItem> WHITE_DRAGON_WINGS = ITEMS.register("white_dragon_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> ORANGE_DRAGON_WINGS = ITEMS.register("orange_dragon_wings", () -> new WingItem(DyeColor.ORANGE, DyeColor.ORANGE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> MAGENTA_DRAGON_WINGS = ITEMS.register("magenta_dragon_wings", () -> new WingItem(DyeColor.MAGENTA, DyeColor.PINK, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> LIGHT_BLUE_DRAGON_WINGS = ITEMS.register("light_blue_dragon_wings", () -> new WingItem(DyeColor.LIGHT_BLUE, DyeColor.WHITE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> YELLOW_DRAGON_WINGS = ITEMS.register("yellow_dragon_wings", () -> new WingItem(DyeColor.YELLOW, DyeColor.YELLOW, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> LIME_DRAGON_WINGS = ITEMS.register("lime_dragon_wings", () -> new WingItem(DyeColor.LIME, DyeColor.PINK, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> PINK_DRAGON_WINGS = ITEMS.register("pink_dragon_wings", () -> new WingItem(DyeColor.PINK, DyeColor.WHITE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> GRAY_DRAGON_WINGS = ITEMS.register("gray_dragon_wings", () -> new WingItem(DyeColor.GRAY, DyeColor.LIGHT_GRAY, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> LIGHT_GRAY_DRAGON_WINGS = ITEMS.register("light_gray_dragon_wings", () -> new WingItem(DyeColor.LIGHT_GRAY, DyeColor.WHITE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> CYAN_DRAGON_WINGS = ITEMS.register("cyan_dragon_wings", () -> new WingItem(DyeColor.CYAN, DyeColor.LIGHT_BLUE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> PURPLE_DRAGON_WINGS = ITEMS.register("purple_dragon_wings", () -> new WingItem(DyeColor.PURPLE, DyeColor.MAGENTA, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> BLUE_DRAGON_WINGS = ITEMS.register("blue_dragon_wings", () -> new WingItem(DyeColor.BLUE, DyeColor.LIGHT_BLUE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> BROWN_DRAGON_WINGS = ITEMS.register("brown_dragon_wings", () -> new WingItem(DyeColor.BROWN, DyeColor.ORANGE, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> GREEN_DRAGON_WINGS = ITEMS.register("green_dragon_wings", () -> new WingItem(DyeColor.GREEN, DyeColor.LIME, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> RED_DRAGON_WINGS = ITEMS.register("red_dragon_wings", () -> new WingItem(DyeColor.RED, DyeColor.YELLOW, WingItem.WingType.DRAGON));
    public static final RegistrySupplier<WingItem> BLACK_DRAGON_WINGS = ITEMS.register("black_dragon_wings", () -> new WingItem(DyeColor.BLACK, DyeColor.PURPLE, WingItem.WingType.DRAGON));

    public static final RegistrySupplier<WingItem> WHITE_MECHANICAL_FEATHERED_WINGS = ITEMS.register("white_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> ORANGE_MECHANICAL_FEATHERED_WINGS = ITEMS.register("orange_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.ORANGE, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> MAGENTA_MECHANICAL_FEATHERED_WINGS = ITEMS.register("magenta_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.MAGENTA, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> LIGHT_BLUE_MECHANICAL_FEATHERED_WINGS = ITEMS.register("light_blue_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.LIGHT_BLUE, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> YELLOW_MECHANICAL_FEATHERED_WINGS = ITEMS.register("yellow_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.YELLOW, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> LIME_MECHANICAL_FEATHERED_WINGS = ITEMS.register("lime_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.LIME, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> PINK_MECHANICAL_FEATHERED_WINGS = ITEMS.register("pink_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.PINK, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> GRAY_MECHANICAL_FEATHERED_WINGS = ITEMS.register("gray_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.GRAY, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> LIGHT_GRAY_MECHANICAL_FEATHERED_WINGS = ITEMS.register("light_gray_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.LIGHT_GRAY, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> CYAN_MECHANICAL_FEATHERED_WINGS = ITEMS.register("cyan_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.CYAN, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> PURPLE_MECHANICAL_FEATHERED_WINGS = ITEMS.register("purple_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.PURPLE, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> BLUE_MECHANICAL_FEATHERED_WINGS = ITEMS.register("blue_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.BLUE, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> BROWN_MECHANICAL_FEATHERED_WINGS = ITEMS.register("brown_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.BROWN, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> GREEN_MECHANICAL_FEATHERED_WINGS = ITEMS.register("green_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.GREEN, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> RED_MECHANICAL_FEATHERED_WINGS = ITEMS.register("red_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.RED, WingItem.WingType.MECHANICAL_FEATHERED));
    public static final RegistrySupplier<WingItem> BLACK_MECHANICAL_FEATHERED_WINGS = ITEMS.register("black_mechanical_feathered_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.BLACK, WingItem.WingType.MECHANICAL_FEATHERED));

    public static final RegistrySupplier<WingItem> WHITE_MECHANICAL_LEATHER_WINGS = ITEMS.register("white_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> ORANGE_MECHANICAL_LEATHER_WINGS = ITEMS.register("orange_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.ORANGE, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> MAGENTA_MECHANICAL_LEATHER_WINGS = ITEMS.register("magenta_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.MAGENTA, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> LIGHT_BLUE_MECHANICAL_LEATHER_WINGS = ITEMS.register("light_blue_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.LIGHT_BLUE, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> YELLOW_MECHANICAL_LEATHER_WINGS = ITEMS.register("yellow_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.YELLOW, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> LIME_MECHANICAL_LEATHER_WINGS = ITEMS.register("lime_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.LIME, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> PINK_MECHANICAL_LEATHER_WINGS = ITEMS.register("pink_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.PINK, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> GRAY_MECHANICAL_LEATHER_WINGS = ITEMS.register("gray_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.GRAY, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> LIGHT_GRAY_MECHANICAL_LEATHER_WINGS = ITEMS.register("light_gray_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.LIGHT_GRAY, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> CYAN_MECHANICAL_LEATHER_WINGS = ITEMS.register("cyan_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.CYAN, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> PURPLE_MECHANICAL_LEATHER_WINGS = ITEMS.register("purple_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.PURPLE, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> BLUE_MECHANICAL_LEATHER_WINGS = ITEMS.register("blue_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.BLUE, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> BROWN_MECHANICAL_LEATHER_WINGS = ITEMS.register("brown_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.BROWN, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> GREEN_MECHANICAL_LEATHER_WINGS = ITEMS.register("green_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.GREEN, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> RED_MECHANICAL_LEATHER_WINGS = ITEMS.register("red_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.RED, WingItem.WingType.MECHANICAL_LEATHER));
    public static final RegistrySupplier<WingItem> BLACK_MECHANICAL_LEATHER_WINGS = ITEMS.register("black_mechanical_leather_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.BLACK, WingItem.WingType.MECHANICAL_LEATHER));

    public static final RegistrySupplier<WingItem> WHITE_LIGHT_WINGS = ITEMS.register("white_light_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> ORANGE_LIGHT_WINGS = ITEMS.register("orange_light_wings", () -> new WingItem(DyeColor.ORANGE, DyeColor.ORANGE, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> MAGENTA_LIGHT_WINGS = ITEMS.register("magenta_light_wings", () -> new WingItem(DyeColor.MAGENTA, DyeColor.MAGENTA, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> LIGHT_BLUE_LIGHT_WINGS = ITEMS.register("light_blue_light_wings", () -> new WingItem(DyeColor.LIGHT_BLUE, DyeColor.LIGHT_BLUE, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> YELLOW_LIGHT_WINGS = ITEMS.register("yellow_light_wings", () -> new WingItem(DyeColor.YELLOW, DyeColor.YELLOW, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> LIME_LIGHT_WINGS = ITEMS.register("lime_light_wings", () -> new WingItem(DyeColor.LIME, DyeColor.LIME, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> PINK_LIGHT_WINGS = ITEMS.register("pink_light_wings", () -> new WingItem(DyeColor.PINK, DyeColor.PINK, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> GRAY_LIGHT_WINGS = ITEMS.register("gray_light_wings", () -> new WingItem(DyeColor.GRAY, DyeColor.GRAY, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> LIGHT_GRAY_LIGHT_WINGS = ITEMS.register("light_gray_light_wings", () -> new WingItem(DyeColor.LIGHT_GRAY, DyeColor.LIGHT_GRAY, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> CYAN_LIGHT_WINGS = ITEMS.register("cyan_light_wings", () -> new WingItem(DyeColor.CYAN, DyeColor.CYAN, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> PURPLE_LIGHT_WINGS = ITEMS.register("purple_light_wings", () -> new WingItem(DyeColor.PURPLE, DyeColor.PURPLE, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> BLUE_LIGHT_WINGS = ITEMS.register("blue_light_wings", () -> new WingItem(DyeColor.BLUE, DyeColor.BLUE, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> BROWN_LIGHT_WINGS = ITEMS.register("brown_light_wings", () -> new WingItem(DyeColor.BROWN, DyeColor.BROWN, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> GREEN_LIGHT_WINGS = ITEMS.register("green_light_wings", () -> new WingItem(DyeColor.GREEN, DyeColor.GREEN, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> RED_LIGHT_WINGS = ITEMS.register("red_light_wings", () -> new WingItem(DyeColor.RED, DyeColor.RED, WingItem.WingType.LIGHT));
    public static final RegistrySupplier<WingItem> BLACK_LIGHT_WINGS = ITEMS.register("black_light_wings", () -> new WingItem(DyeColor.BLACK, DyeColor.BLACK, WingItem.WingType.LIGHT));

    public static final RegistrySupplier<WingItem> FLANDRES_WINGS = ITEMS.register("flandres_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.UNIQUE));
    public static final RegistrySupplier<WingItem> DISCORDS_WINGS = ITEMS.register("discords_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.UNIQUE));
    public static final RegistrySupplier<WingItem> ZANZAS_WINGS = ITEMS.register("zanzas_wings", () -> new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingItem.WingType.UNIQUE));

    public static final ResourceKey<CreativeModeTab> CREATIVE_TAB_ID = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Icarus.id("items"));
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_TABS.register(CREATIVE_TAB_ID, () -> CreativeTabHelper.newBuilder(CREATIVE_TAB_ID).icon(() -> IcarusItems.WHITE_FEATHERED_WINGS.get().getDefaultInstance()).displayItems((itemDisplayParameters, output) -> {
        output.accept(IcarusItems.WHITE_FEATHERED_WINGS.get());
        output.accept(IcarusItems.ORANGE_FEATHERED_WINGS.get());
        output.accept(IcarusItems.MAGENTA_FEATHERED_WINGS.get());
        output.accept(IcarusItems.LIGHT_BLUE_FEATHERED_WINGS.get());
        output.accept(IcarusItems.YELLOW_FEATHERED_WINGS.get());
        output.accept(IcarusItems.LIME_FEATHERED_WINGS.get());
        output.accept(IcarusItems.PINK_FEATHERED_WINGS.get());
        output.accept(IcarusItems.GRAY_FEATHERED_WINGS.get());
        output.accept(IcarusItems.LIGHT_GRAY_FEATHERED_WINGS.get());
        output.accept(IcarusItems.CYAN_FEATHERED_WINGS.get());
        output.accept(IcarusItems.PURPLE_FEATHERED_WINGS.get());
        output.accept(IcarusItems.BLUE_FEATHERED_WINGS.get());
        output.accept(IcarusItems.BROWN_FEATHERED_WINGS.get());
        output.accept(IcarusItems.GREEN_FEATHERED_WINGS.get());
        output.accept(IcarusItems.RED_FEATHERED_WINGS.get());
        output.accept(IcarusItems.BLACK_FEATHERED_WINGS.get());

        output.accept(IcarusItems.WHITE_DRAGON_WINGS.get());
        output.accept(IcarusItems.ORANGE_DRAGON_WINGS.get());
        output.accept(IcarusItems.MAGENTA_DRAGON_WINGS.get());
        output.accept(IcarusItems.LIGHT_BLUE_DRAGON_WINGS.get());
        output.accept(IcarusItems.YELLOW_DRAGON_WINGS.get());
        output.accept(IcarusItems.LIME_DRAGON_WINGS.get());
        output.accept(IcarusItems.PINK_DRAGON_WINGS.get());
        output.accept(IcarusItems.GRAY_DRAGON_WINGS.get());
        output.accept(IcarusItems.LIGHT_GRAY_DRAGON_WINGS.get());
        output.accept(IcarusItems.CYAN_DRAGON_WINGS.get());
        output.accept(IcarusItems.PURPLE_DRAGON_WINGS.get());
        output.accept(IcarusItems.BLUE_DRAGON_WINGS.get());
        output.accept(IcarusItems.BROWN_DRAGON_WINGS.get());
        output.accept(IcarusItems.GREEN_DRAGON_WINGS.get());
        output.accept(IcarusItems.RED_DRAGON_WINGS.get());
        output.accept(IcarusItems.BLACK_DRAGON_WINGS.get());

        output.accept(IcarusItems.WHITE_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.ORANGE_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.MAGENTA_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.LIGHT_BLUE_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.YELLOW_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.LIME_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.PINK_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.GRAY_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.LIGHT_GRAY_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.CYAN_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.PURPLE_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.BLUE_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.BROWN_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.GREEN_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.RED_MECHANICAL_FEATHERED_WINGS.get());
        output.accept(IcarusItems.BLACK_MECHANICAL_FEATHERED_WINGS.get());

        output.accept(IcarusItems.WHITE_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.ORANGE_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.MAGENTA_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.LIGHT_BLUE_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.YELLOW_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.LIME_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.PINK_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.GRAY_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.LIGHT_GRAY_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.CYAN_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.PURPLE_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.BLUE_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.BROWN_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.GREEN_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.RED_MECHANICAL_LEATHER_WINGS.get());
        output.accept(IcarusItems.BLACK_MECHANICAL_LEATHER_WINGS.get());

        output.accept(IcarusItems.WHITE_LIGHT_WINGS.get());
        output.accept(IcarusItems.ORANGE_LIGHT_WINGS.get());
        output.accept(IcarusItems.MAGENTA_LIGHT_WINGS.get());
        output.accept(IcarusItems.LIGHT_BLUE_LIGHT_WINGS.get());
        output.accept(IcarusItems.YELLOW_LIGHT_WINGS.get());
        output.accept(IcarusItems.LIME_LIGHT_WINGS.get());
        output.accept(IcarusItems.PINK_LIGHT_WINGS.get());
        output.accept(IcarusItems.GRAY_LIGHT_WINGS.get());
        output.accept(IcarusItems.LIGHT_GRAY_LIGHT_WINGS.get());
        output.accept(IcarusItems.CYAN_LIGHT_WINGS.get());
        output.accept(IcarusItems.PURPLE_LIGHT_WINGS.get());
        output.accept(IcarusItems.BLUE_LIGHT_WINGS.get());
        output.accept(IcarusItems.BROWN_LIGHT_WINGS.get());
        output.accept(IcarusItems.GREEN_LIGHT_WINGS.get());
        output.accept(IcarusItems.RED_LIGHT_WINGS.get());
        output.accept(IcarusItems.BLACK_LIGHT_WINGS.get());

        output.accept(IcarusItems.FLANDRES_WINGS.get());
        output.accept(IcarusItems.DISCORDS_WINGS.get());
        output.accept(IcarusItems.ZANZAS_WINGS.get());
    }).build());
}
