package dev.cammiescorner.icarus.neoforge.entrypoints;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.init.IcarusStatusEffects;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.neoforge.registry.IcarusDeferredRegister;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.theillusivec4.curios.api.CuriosApi;

@Mod(Icarus.MODID)
public class Main {

    public Main(IEventBus bus) {
        Icarus.init();

        IcarusHelper.getEquippedWings = entity -> {
            var component = CuriosApi.getCuriosInventory(entity);
            if (component.isPresent()) {
                var slot = component.orElseThrow().findFirstCurio(stack -> stack.getItem() instanceof WingItem);
                if (slot.isPresent()) {
                    return slot.orElseThrow().stack();
                }
            }

            return ItemStack.EMPTY;
        };

        IcarusHelper.hasWings = entity -> {
            var component = CuriosApi.getCuriosInventory(entity);
            return component.isPresent() && component.orElseThrow().isEquipped(stack -> stack.getItem() instanceof WingItem);
        };

//        IcarusHelper.equipFunc = (entity, stack) -> {
//            //TODO equip curio
//        }

        var itemRegister = IcarusDeferredRegister.create(BuiltInRegistries.ITEM);
        IcarusItems.register(itemRegister);
        itemRegister.subscribe(bus);

        var statusEffectsRegister = IcarusDeferredRegister.create(BuiltInRegistries.MOB_EFFECT);
        IcarusStatusEffects.register(statusEffectsRegister);
        statusEffectsRegister.subscribe(bus);

        var tabsRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Icarus.MODID);
        tabsRegister.register("icarus", () -> IcarusItems.makeTab(CreativeModeTab.builder()));
        tabsRegister.register(bus);
    }
}
