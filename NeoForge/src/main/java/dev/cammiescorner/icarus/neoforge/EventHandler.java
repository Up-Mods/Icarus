package dev.cammiescorner.icarus.neoforge;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = Icarus.MODID)
public class EventHandler {

    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        IcarusHelper.onServerPlayerJoin((ServerPlayer) event.getEntity());
    }
}
