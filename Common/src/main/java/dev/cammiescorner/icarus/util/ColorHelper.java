package dev.cammiescorner.icarus.util;


import net.minecraft.util.FastColor;
import net.minecraft.world.item.DyeColor;

public class ColorHelper {
    public static int asARGB(DyeColor color) {
        var rgb = color.getTextureDiffuseColor();
        return FastColor.ARGB32.color(255, rgb);
    }
}
