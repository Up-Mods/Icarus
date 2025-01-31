package dev.cammiescorner.icarus.neoforge;

import com.illusivesoulworks.caelus.api.CaelusApi;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = Icarus.MODID)
public class EventHandler {

    public static final ResourceLocation WINGS_FLIGHT_MODIFIER_ID = Icarus.id("wings");
    public static final AttributeModifier WINGS_FLIGHT = new AttributeModifier(WINGS_FLIGHT_MODIFIER_ID, 1.0D, AttributeModifier.Operation.ADD_VALUE);

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Pre event) {
        var attributeInstance = event.getEntity().getAttribute(CaelusApi.getInstance().getFallFlyingAttribute());

        if (attributeInstance != null) {
            if (attributeInstance.hasModifier(WINGS_FLIGHT.id())) {
                if (event.getEntity().isFallFlying()) {
                    if (!IcarusHelper.onFallFlyingTick(event.getEntity(), IcarusHelper.getEquippedWings(event.getEntity()), true)) {
                        attributeInstance.removeModifier(WINGS_FLIGHT_MODIFIER_ID);
                    }
                } else {
                    if (!IcarusHelper.hasWings(event.getEntity())) {
                        attributeInstance.removeModifier(WINGS_FLIGHT_MODIFIER_ID);
                    }
                }
            } else {
                if (IcarusHelper.hasWings(event.getEntity())) {
                    attributeInstance.addTransientModifier(WINGS_FLIGHT);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        IcarusHelper.onServerPlayerJoin((ServerPlayer) event.getEntity());
    }
}
