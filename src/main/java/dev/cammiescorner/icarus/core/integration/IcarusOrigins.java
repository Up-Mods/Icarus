package dev.cammiescorner.icarus.core.integration;

import dev.cammiescorner.icarus.Icarus;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeReference;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class IcarusOrigins {
	public static final PowerType<Power> POWERED_FLIGHT = new PowerTypeReference<>(new Identifier(Icarus.MOD_ID, "powered_flight"));

	public static boolean hasPoweredFlight(Entity entity) {
		return IcarusOrigins.POWERED_FLIGHT.get(entity) != null;
	}
}
