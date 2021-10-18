package dev.cammiescorner.icarus.core.util;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;

import java.util.Optional;

public class IcarusHelper {
	public static float getAdjustedPitch(Entity entity, float value) {
		var aaa = new Object() {
			float pitch = value;
		};

		if(Icarus.getConfig().canLoopdeloop && entity instanceof PlayerEntity player && player.isFallFlying()) {
			Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);

			component.ifPresent(trinketComponent -> trinketComponent.getAllEquipped().forEach(pair -> {
				if(pair.getRight().getItem() instanceof WingItem)
					aaa.pitch = MathHelper.wrapDegrees(entity.getPitch());
			}));
		}

		return aaa.pitch;
	}
}
