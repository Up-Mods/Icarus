package dev.cammiescorner.icarus.api.client;

import dev.cammiescorner.icarus.client.IcarusClient;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.function.Predicate;

public class IcarusAPIClient {

    public static void addRenderPredicate(Predicate<LivingEntity> predicate) {
        IcarusClient.addRenderPredicate(predicate);
    }

    public static ItemStack getWingsForRendering(LivingEntity entity) {
        return IcarusClient.getWingsForRendering(entity);
    }
}
