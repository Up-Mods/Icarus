package dev.cammiescorner.icarus.neoforge.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.illusivesoulworks.caelus.api.CaelusApi;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.item.WingItem;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
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

    @Override
    public Multimap<Holder<Attribute>, AttributeModifier> getAttributeModifiers(SlotContext slotContext, ResourceLocation id, ItemStack stack) {
        return ImmutableMultimap.<Holder<Attribute>, AttributeModifier>builder()
                .putAll(ICurioItem.super.getAttributeModifiers(slotContext, id, stack))
                .put(CaelusApi.getInstance().getFallFlyingAttribute(), new AttributeModifier(Icarus.id("wings"), 1.0D, AttributeModifier.Operation.ADD_VALUE))
                .build();
    }
}
