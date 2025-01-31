package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.effect.FlightlessStatusEffect;
import dev.upcraft.sparkweave.api.registry.RegistryHandler;
import dev.upcraft.sparkweave.api.registry.RegistrySupplier;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class IcarusStatusEffects {

    public static final RegistryHandler<MobEffect> STATUS_EFFECTS = RegistryHandler.create(Registries.MOB_EFFECT, Icarus.MODID);

    public static final RegistrySupplier<MobEffect> FLIGHTLESS = STATUS_EFFECTS.register("flightless", () -> new FlightlessStatusEffect(MobEffectCategory.NEUTRAL, "#b6ccf0"));

    public static Holder<MobEffect> flightlessHolder() {
        return FLIGHTLESS.holder();
    }
}
