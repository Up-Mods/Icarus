package dev.cammiescorner.icarus.neoforge.entrypoints;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.neoforge.registry.IcarusDeferredRegister;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import top.theillusivec4.curios.api.CuriosApi;

@Mod(Icarus.MODID)
public class Main {

    public Main() {
        Icarus.init();

        IcarusHelper.getEquippedWings = entity -> {
            var component = CuriosApi.getCuriosInventory(entity).resolve();
            if (component.isPresent()) {
                var slot = component.orElseThrow().findFirstCurio(stack -> stack.getItem() instanceof WingItem);
                if (slot.isPresent()) {
                    return slot.orElseThrow().stack();
                }
            }

            return ItemStack.EMPTY;
        };

        IcarusHelper.hasWings = entity -> {
            var component = CuriosApi.getCuriosInventory(entity).resolve();
            return component.isPresent() && component.orElseThrow().isEquipped(stack -> stack.getItem() instanceof WingItem);
        };

//        IcarusHelper.equipFunc = (entity, stack) -> {
//            //TODO equip curio
//        }

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        var register = new IcarusDeferredRegister();
        IcarusItems.register(register);
        register.subscribe(bus);

        var tabsRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Icarus.MODID);
        tabsRegister.register("icarus", () -> IcarusItems.makeTab(CreativeModeTab.builder()));
        tabsRegister.register(bus);
    }
}
