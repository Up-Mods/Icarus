package dev.cammiescorner.icarus.neoforge.registry;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.util.Registrar;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class IcarusDeferredRegister implements Registrar<Item> {

    private final DeferredRegister<Item> delegate = DeferredRegister.create(ForgeRegistries.ITEMS, Icarus.MODID);

    public void subscribe(IEventBus bus) {
        delegate.register(bus);
    }

    @Override
    public <T extends Item> Supplier<T> register(String name, Supplier<? extends T> factory) {
        return delegate.register(name, factory);
    }
}
