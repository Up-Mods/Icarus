package dev.cammiescorner.icarus.util;


import net.minecraft.world.item.DyeColor;

public class ColorHelper {
	public static int rgbToDecimal(float[] rgb) {
		return (((int) (rgb[0] * 255F) << 16) | ((int) (rgb[1] * 255F) << 8) | (int) (rgb[2] * 255F));
	}

	public static int dyeToDecimal(DyeColor colour) {
		float[] rgb = colour.getTextureDiffuseColors();

		return (((int) (rgb[0] * 255F) << 16) | ((int) (rgb[1] * 255F) << 8) | (int) (rgb[2] * 255F));
	}
}
