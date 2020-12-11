package com.camscorner.icarus.core.registry;

import com.camscorner.icarus.Icarus;
import com.camscorner.icarus.common.items.WingItem;
import com.camscorner.icarus.common.items.WingItem.WingColour;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;

public class ModItems
{
	//----Item Map----//
	public static final LinkedHashMap<Item, Identifier> ITEMS = new LinkedHashMap<>();

	//-----Items-----//
	public static final Item WHITE_FEATHERED_WINGS = create("white_feathered_wings", new WingItem(WingColour.WHITE, WingColour.NONE));
	public static final Item ORANGE_FEATHERED_WINGS = create("orange_feathered_wings", new WingItem(WingColour.ORANGE, WingColour.NONE));
	public static final Item MAGENTA_FEATHERED_WINGS = create("magenta_feathered_wings", new WingItem(WingColour.MAGENTA, WingColour.NONE));
	public static final Item LIGHT_BLUE_FEATHERED_WINGS = create("light_blue_feathered_wings", new WingItem(WingColour.LIGHT_BLUE, WingColour.NONE));
	public static final Item YELLOW_FEATHERED_WINGS = create("yellow_feathered_wings", new WingItem(WingColour.YELLOW, WingColour.NONE));
	public static final Item LIME_FEATHERED_WINGS = create("lime_feathered_wings", new WingItem(WingColour.LIME, WingColour.NONE));
	public static final Item PINK_FEATHERED_WINGS = create("pink_feathered_wings", new WingItem(WingColour.PINK, WingColour.NONE));
	public static final Item GREY_FEATHERED_WINGS = create("grey_feathered_wings", new WingItem(WingColour.GREY, WingColour.NONE));
	public static final Item LIGHT_GREY_FEATHERED_WINGS = create("light_grey_feathered_wings", new WingItem(WingColour.LIGHT_GREY, WingColour.NONE));
	public static final Item CYAN_FEATHERED_WINGS = create("cyan_feathered_wings", new WingItem(WingColour.CYAN, WingColour.NONE));
	public static final Item PURPLE_FEATHERED_WINGS = create("purple_feathered_wings", new WingItem(WingColour.PURPLE, WingColour.NONE));
	public static final Item BLUE_FEATHERED_WINGS = create("blue_feathered_wings", new WingItem(WingColour.BLUE, WingColour.NONE));
	public static final Item BROWN_FEATHERED_WINGS = create("brown_feathered_wings", new WingItem(WingColour.BROWN, WingColour.NONE));
	public static final Item GREEN_FEATHERED_WINGS = create("green_feathered_wings", new WingItem(WingColour.GREEN, WingColour.NONE));
	public static final Item RED_FEATHERED_WINGS = create("red_feathered_wings", new WingItem(WingColour.RED, WingColour.NONE));
	public static final Item BLACK_FEATHERED_WINGS = create("black_feathered_wings", new WingItem(WingColour.BLACK, WingColour.NONE));

	public static final Item WHITE_DRAGON_WINGS = create("white_dragon_wings", new WingItem(WingColour.WHITE, WingColour.BLACK));
	public static final Item ORANGE_DRAGON_WINGS = create("orange_dragon_wings", new WingItem(WingColour.ORANGE, WingColour.ORANGE));
	public static final Item MAGENTA_DRAGON_WINGS = create("magenta_dragon_wings", new WingItem(WingColour.MAGENTA, WingColour.PINK));
	public static final Item LIGHT_BLUE_DRAGON_WINGS = create("light_blue_dragon_wings", new WingItem(WingColour.LIGHT_BLUE, WingColour.WHITE));
	public static final Item YELLOW_DRAGON_WINGS = create("yellow_dragon_wings", new WingItem(WingColour.YELLOW, WingColour.YELLOW));
	public static final Item LIME_DRAGON_WINGS = create("lime_dragon_wings", new WingItem(WingColour.LIME, WingColour.PINK));
	public static final Item PINK_DRAGON_WINGS = create("pink_dragon_wings", new WingItem(WingColour.PINK, WingColour.WHITE));
	public static final Item GREY_DRAGON_WINGS = create("grey_dragon_wings", new WingItem(WingColour.GREY, WingColour.LIGHT_GREY));
	public static final Item LIGHT_GREY_DRAGON_WINGS = create("light_grey_dragon_wings", new WingItem(WingColour.LIGHT_GREY, WingColour.WHITE));
	public static final Item CYAN_DRAGON_WINGS = create("cyan_dragon_wings", new WingItem(WingColour.CYAN, WingColour.LIGHT_BLUE));
	public static final Item PURPLE_DRAGON_WINGS = create("purple_dragon_wings", new WingItem(WingColour.PURPLE, WingColour.MAGENTA));
	public static final Item BLUE_DRAGON_WINGS = create("blue_dragon_wings", new WingItem(WingColour.BLUE, WingColour.ORANGE));
	public static final Item BROWN_DRAGON_WINGS = create("brown_dragon_wings", new WingItem(WingColour.BROWN, WingColour.ORANGE));
	public static final Item GREEN_DRAGON_WINGS = create("green_dragon_wings", new WingItem(WingColour.GREEN, WingColour.LIME));
	public static final Item RED_DRAGON_WINGS = create("red_dragon_wings", new WingItem(WingColour.RED, WingColour.YELLOW));
	public static final Item BLACK_DRAGON_WINGS = create("black_dragon_wings", new WingItem(WingColour.BLACK, WingColour.PURPLE));

	public static final Item WHITE_MECHANICAL_FEATHERED_WINGS = create("white_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.WHITE));
	public static final Item ORANGE_MECHANICAL_FEATHERED_WINGS = create("orange_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.ORANGE));
	public static final Item MAGENTA_MECHANICAL_FEATHERED_WINGS = create("magenta_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.MAGENTA));
	public static final Item LIGHT_BLUE_MECHANICAL_FEATHERED_WINGS = create("light_blue_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.LIGHT_BLUE));
	public static final Item YELLOW_MECHANICAL_FEATHERED_WINGS = create("yellow_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.YELLOW));
	public static final Item LIME_MECHANICAL_FEATHERED_WINGS = create("lime_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.LIME));
	public static final Item PINK_MECHANICAL_FEATHERED_WINGS = create("pink_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.PINK));
	public static final Item GREY_MECHANICAL_FEATHERED_WINGS = create("grey_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.GREY));
	public static final Item LIGHT_GREY_MECHANICAL_FEATHERED_WINGS = create("light_grey_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.LIGHT_GREY));
	public static final Item CYAN_MECHANICAL_FEATHERED_WINGS = create("cyan_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.CYAN));
	public static final Item PURPLE_MECHANICAL_FEATHERED_WINGS = create("purple_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.PURPLE));
	public static final Item BLUE_MECHANICAL_FEATHERED_WINGS = create("blue_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.BLUE));
	public static final Item BROWN_MECHANICAL_FEATHERED_WINGS = create("brown_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.BROWN));
	public static final Item GREEN_MECHANICAL_FEATHERED_WINGS = create("green_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.GREEN));
	public static final Item RED_MECHANICAL_FEATHERED_WINGS = create("red_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.RED));
	public static final Item BLACK_MECHANICAL_FEATHERED_WINGS = create("black_mechanical_feathered_wings", new WingItem(WingColour.NONE, WingColour.BLACK));
	
	public static final Item WHITE_MECHANICAL_LEATHER_WINGS = create("white_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.WHITE));
	public static final Item ORANGE_MECHANICAL_LEATHER_WINGS = create("orange_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.ORANGE));
	public static final Item MAGENTA_MECHANICAL_LEATHER_WINGS = create("magenta_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.MAGENTA));
	public static final Item LIGHT_BLUE_MECHANICAL_LEATHER_WINGS = create("light_blue_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.LIGHT_BLUE));
	public static final Item YELLOW_MECHANICAL_LEATHER_WINGS = create("yellow_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.YELLOW));
	public static final Item LIME_MECHANICAL_LEATHER_WINGS = create("lime_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.LIME));
	public static final Item PINK_MECHANICAL_LEATHER_WINGS = create("pink_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.PINK));
	public static final Item GREY_MECHANICAL_LEATHER_WINGS = create("grey_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.GREY));
	public static final Item LIGHT_GREY_MECHANICAL_LEATHER_WINGS = create("light_grey_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.LIGHT_GREY));
	public static final Item CYAN_MECHANICAL_LEATHER_WINGS = create("cyan_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.CYAN));
	public static final Item PURPLE_MECHANICAL_LEATHER_WINGS = create("purple_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.PURPLE));
	public static final Item BLUE_MECHANICAL_LEATHER_WINGS = create("blue_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.BLUE));
	public static final Item BROWN_MECHANICAL_LEATHER_WINGS = create("brown_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.BROWN));
	public static final Item GREEN_MECHANICAL_LEATHER_WINGS = create("green_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.GREEN));
	public static final Item RED_MECHANICAL_LEATHER_WINGS = create("red_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.RED));
	public static final Item BLACK_MECHANICAL_LEATHER_WINGS = create("black_mechanical_leather_wings", new WingItem(WingColour.NONE, WingColour.BLACK));
	
	public static final Item WHITE_LIGHT_WINGS = create("white_light_wings", new WingItem(WingColour.WHITE, WingColour.NONE));
	public static final Item ORANGE_LIGHT_WINGS = create("orange_light_wings", new WingItem(WingColour.ORANGE, WingColour.NONE));
	public static final Item MAGENTA_LIGHT_WINGS = create("magenta_light_wings", new WingItem(WingColour.MAGENTA, WingColour.NONE));
	public static final Item LIGHT_BLUE_LIGHT_WINGS = create("light_blue_light_wings", new WingItem(WingColour.LIGHT_BLUE, WingColour.NONE));
	public static final Item YELLOW_LIGHT_WINGS = create("yellow_light_wings", new WingItem(WingColour.YELLOW, WingColour.NONE));
	public static final Item LIME_LIGHT_WINGS = create("lime_light_wings", new WingItem(WingColour.LIME, WingColour.NONE));
	public static final Item PINK_LIGHT_WINGS = create("pink_light_wings", new WingItem(WingColour.PINK, WingColour.NONE));
	public static final Item GREY_LIGHT_WINGS = create("grey_light_wings", new WingItem(WingColour.GREY, WingColour.NONE));
	public static final Item LIGHT_GREY_LIGHT_WINGS = create("light_grey_light_wings", new WingItem(WingColour.LIGHT_GREY, WingColour.NONE));
	public static final Item CYAN_LIGHT_WINGS = create("cyan_light_wings", new WingItem(WingColour.CYAN, WingColour.NONE));
	public static final Item PURPLE_LIGHT_WINGS = create("purple_light_wings", new WingItem(WingColour.PURPLE, WingColour.NONE));
	public static final Item BLUE_LIGHT_WINGS = create("blue_light_wings", new WingItem(WingColour.BLUE, WingColour.NONE));
	public static final Item BROWN_LIGHT_WINGS = create("brown_light_wings", new WingItem(WingColour.BROWN, WingColour.NONE));
	public static final Item GREEN_LIGHT_WINGS = create("green_light_wings", new WingItem(WingColour.GREEN, WingColour.NONE));
	public static final Item RED_LIGHT_WINGS = create("red_light_wings", new WingItem(WingColour.RED, WingColour.NONE));
	public static final Item BLACK_LIGHT_WINGS = create("black_light_wings", new WingItem(WingColour.BLACK, WingColour.NONE));
	
	public static final Item FLANDRES_WINGS = create("flandres_wings", new WingItem(WingColour.NONE, WingColour.NONE));
	public static final Item DISCORDS_WINGS = create("discords_wings", new WingItem(WingColour.NONE, WingColour.NONE));
	public static final Item ZANZAS_WINGS = create("zanzas_wings", new WingItem(WingColour.NONE, WingColour.NONE));

	//-----Registry-----//
	public static void register()
	{
		ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
	}

	private static <T extends Item> T create(String name, T item)
	{
		ITEMS.put(item, new Identifier(Icarus.MOD_ID, name));
		return item;
	}
}
