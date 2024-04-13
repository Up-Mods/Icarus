package dev.cammiescorner.icarus.quilt.mixin;

import dev.cammiescorner.icarus.item.WingItem;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WingItem.class)
public abstract class MixinWingItem extends Item implements Trinket {

    private MixinWingItem(Properties properties) {
        super(properties);
        throw new UnsupportedOperationException();
    }

    @Inject(method = "<init>", at = @At("RETURN"))
    private void construct(DyeColor primaryColor, DyeColor secondaryColor, WingItem.WingType wingType, CallbackInfo ci) {
        TrinketsApi.registerTrinket(this, this);
    }
}
