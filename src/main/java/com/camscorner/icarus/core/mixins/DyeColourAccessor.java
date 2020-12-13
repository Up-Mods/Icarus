package com.camscorner.icarus.core.mixins;

import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(DyeColor.class)
public interface DyeColourAccessor
{
	@Accessor("color")
	int getColour();
}
