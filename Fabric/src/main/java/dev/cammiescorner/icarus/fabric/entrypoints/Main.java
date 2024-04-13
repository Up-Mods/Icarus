package dev.cammiescorner.icarus.fabric.entrypoints;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.item.WingItem;
import dev.cammiescorner.icarus.util.IcarusHelper;
import dev.cammiescorner.icarus.util.Registrar;
import dev.emi.trinkets.TrinketSlot;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketInventory;
import dev.emi.trinkets.api.TrinketsApi;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.gameevent.GameEvent;

import java.util.function.Supplier;

public class Main implements ModInitializer {

    @Override
    public void onInitialize() {
        Icarus.init();

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> IcarusHelper.onServerPlayerJoin(handler.getPlayer()));

        IcarusHelper.getEquippedWings = entity -> {
            var component = TrinketsApi.getTrinketComponent(entity);
            if (component.isPresent()) {
                var items = component.orElseThrow().getEquipped(stack -> stack.getItem() instanceof WingItem);
                if (!items.isEmpty()) {
                    return items.get(0).getB();
                }
            }

            return ItemStack.EMPTY;
        };

        IcarusHelper.hasWings = entity -> {
            var component = TrinketsApi.getTrinketComponent(entity);
            return component.isPresent() && component.orElseThrow().isEquipped(stack -> stack.getItem() instanceof WingItem);
        };

        IcarusHelper.equipFunc = (user, stack) -> {
            var optional = TrinketsApi.getTrinketComponent(user);
            if (optional.isPresent()) {
                TrinketComponent comp = optional.get();
                for (var group : comp.getInventory().values()) {
                    for (TrinketInventory inv : group.values()) {
                        for (int i = 0; i < inv.getContainerSize(); i++) {
                            if (inv.getItem(i).isEmpty()) {
                                SlotReference ref = new SlotReference(inv, i);
                                if (TrinketSlot.canInsert(stack, ref, user)) {
                                    ItemStack newStack = stack.copy();
                                    newStack.setCount(1);
                                    inv.setItem(i, newStack);
                                    SoundEvent soundEvent = stack.getItem() instanceof Equipable eq ? eq.getEquipSound() : null;
                                    if (!stack.isEmpty() && soundEvent != null) {
                                        user.gameEvent(GameEvent.EQUIP);
                                        user.playSound(soundEvent, 1.0F, 1.0F);
                                    }
                                    stack.shrink(1);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        };

        EntityElytraEvents.CUSTOM.register((entity, tickElytra) -> {
            var component = TrinketsApi.getTrinketComponent(entity);
            if (component.isPresent()) {
                var items = component.orElseThrow().getEquipped(stack -> stack.getItem() instanceof WingItem);
                if (!items.isEmpty()) {
                    var slot = items.get(0);
                    var stack = slot.getB();
                    var copy = stack.copy();
                    if (!stack.isEmpty() && IcarusHelper.onFallFlyingTick(entity, stack, tickElytra)) {
                        if(!ItemStack.matches(stack, copy)) {
                            slot.getA().inventory().markUpdate();
                        }
                        return true;
                    }
                }
            }

            return false;
        });

        IcarusItems.register(new Registrar<>() {
            @Override
            public <T extends Item> Supplier<T> register(String name, Supplier<? extends T> factory) {
                var value = Registry.register(BuiltInRegistries.ITEM, Icarus.id(name), factory.get());
                return () -> value;
            }
        });

        var group = IcarusItems.makeTab(FabricItemGroup.builder());
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Icarus.id("icarus"), group);
    }
}