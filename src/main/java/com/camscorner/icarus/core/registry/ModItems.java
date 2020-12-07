package com.camscorner.icarus.core.registry;

import com.camscorner.icarus.Icarus;
import com.camscorner.icarus.common.items.WingItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;

public class ModItems
{
	//----Item Map----//
	public static final LinkedHashMap<Item, Identifier> ITEMS = new LinkedHashMap<>();

	//-----Items-----//
	public static final Item BASIC_WINGS = create("wings", new WingItem(0.05D, 0.05D));

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
