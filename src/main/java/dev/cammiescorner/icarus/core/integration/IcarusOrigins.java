package dev.cammiescorner.icarus.core.integration;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.powers.WingsPower;
import dev.cammiescorner.icarus.core.registry.ModItems;
import dev.cammiescorner.icarus.core.util.DefaultWingsValues;
import dev.cammiescorner.icarus.core.util.WingsValues;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeReference;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.entity.Entity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class IcarusOrigins {
	public static final PowerFactory<Power> WINGS_FACTORY = new PowerFactory<>(new Identifier(Icarus.MOD_ID, "wings"), new SerializableData()
			.add("wings_type", SerializableDataTypes.IDENTIFIER, Registries.ITEM.getId(ModItems.WHITE_FEATHERED_WINGS))
			.add("speed", SerializableDataTypes.FLOAT, 0.02F)
			.add("armor_slow_multiplier", SerializableDataTypes.FLOAT, 3F)
			.add("can_fly", SerializableDataTypes.BOOLEAN, true)
			.add("armor_slows", SerializableDataTypes.BOOLEAN, true),
			data -> (powerType, entity) -> new WingsPower(powerType, entity, data.getId("wings_type"), data.getFloat("speed"), data.getFloat("armor_slow_multiplier"), data.getBoolean("can_fly"), data.getBoolean("armor_slows"))
	).allowCondition();
	public static final PowerType<Power> WINGS_POWER = new PowerTypeReference<>(new Identifier(Icarus.MOD_ID, "wings"));

	public static boolean hasWings(Entity entity) {
		return WINGS_POWER.isActive(entity);
	}

	public static Function<Entity, WingsValues> getWingValues() {
		return entity -> IcarusOrigins.WINGS_POWER.get(entity) instanceof WingsPower wingsPower ? wingsPower : DefaultWingsValues.INSTANCE;
	}

	public static void register() {
		Registry.register(ApoliRegistries.POWER_FACTORY, WINGS_FACTORY.getSerializerId(), WINGS_FACTORY);
	}
}
