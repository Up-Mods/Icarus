package dev.cammiescorner.icarus.init;

import dev.cammiescorner.icarus.effect.FlightlessStatusEffect;
import dev.cammiescorner.icarus.util.Registrar;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

import java.util.function.Supplier;

public class IcarusStatusEffects {

    public static Supplier<MobEffect> FLIGHTLESS;

    public static Holder<MobEffect> flightlessHolder() {
        return BuiltInRegistries.MOB_EFFECT.wrapAsHolder(FLIGHTLESS.get());
    }

    public static void register(Registrar<MobEffect> registrar) {
        FLIGHTLESS = registrar.register("flightless", () -> new FlightlessStatusEffect(MobEffectCategory.NEUTRAL, "#b6ccf0"));
    }
}
