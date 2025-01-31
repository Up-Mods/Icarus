package dev.cammiescorner.icarus.neoforge.mixin;

import dev.cammiescorner.icarus.item.WingItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

@Mixin(WingItem.class)
public abstract class WingItemMixin extends Item implements ICurioItem {

    private WingItemMixin(Properties properties) {
        super(properties);
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {
        return true;
    }
}
