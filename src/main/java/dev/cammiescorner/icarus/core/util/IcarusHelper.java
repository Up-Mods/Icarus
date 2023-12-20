package dev.cammiescorner.icarus.core.util;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.IcarusClient;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.cammiescorner.icarus.core.network.c2s.DeleteHungerMessage;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.Optional;

public class IcarusHelper {
	private static final TagKey<Item> FREE_FLIGHT = TagKey.of(Registries.ITEM.getKey(), new Identifier(Icarus.MOD_ID, "free_flight"));

	public static float getAdjustedPitch(Entity entity, float value) {
		var aaa = new Object() {
			float pitch = value;
		};

		if(IcarusClient.canLoopDeLoop && entity instanceof PlayerEntity player && player.isFallFlying()) {
			Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);

			component.ifPresent(trinketComponent -> {
				if(trinketComponent.isEquipped(stack -> stack.getItem() instanceof WingItem) || Icarus.HAS_WINGS.test(entity))
					aaa.pitch = MathHelper.wrapDegrees(entity.getPitch());
			});
		}

		return aaa.pitch;
	}

	public static void applySpeed(PlayerEntity player) {
		WingsValues values = Icarus.WINGS.apply(player);
		((SlowFallEntity) player).setSlowFalling(false);
		Vec3d rotation = player.getRotationVector();
		Vec3d velocity = player.getVelocity();
		float modifier = values.doesArmourSlow() ? Math.max(1F, (player.getArmor() / 30F) * values.getArmourSlowMultiplier()) : 1F;
		float speed = (values.getSpeed() * (player.getPitch() < -75 && player.getPitch() > -105 ? 3F : 1.5F)) / modifier;

		player.setVelocity(velocity.add(rotation.x * speed + (rotation.x * 1.5D - velocity.x) * speed,
				rotation.y * speed + (rotation.y * 1.5D - velocity.y) * speed,
				rotation.z * speed + (rotation.z * 1.5D - velocity.z) * speed));
	}

	public static void applySpeed(PlayerEntity player, ItemStack stack) {
		((SlowFallEntity) player).setSlowFalling(false);
		Vec3d rotation = player.getRotationVector();
		Vec3d velocity = player.getVelocity();
		float modifier = IcarusClient.armourSlows ? Math.max(1F, (player.getArmor() / 30F) * IcarusClient.maxSlowedMultiplier) : 1F;
		float speed = (IcarusClient.wingSpeed * (player.getPitch() < -75 && player.getPitch() > -105 ? 2.75F : 1F)) / modifier;

		player.setVelocity(velocity.add(rotation.x * speed + (rotation.x * 1.5D - velocity.x) * speed,
				rotation.y * speed + (rotation.y * 1.5D - velocity.y) * speed,
				rotation.z * speed + (rotation.z * 1.5D - velocity.z) * speed));

		if(!stack.isIn(FREE_FLIGHT) && !player.isCreative())
			DeleteHungerMessage.send();
	}

	public static void stopFlying(PlayerEntity player) {
		((SlowFallEntity) player).setSlowFalling(true);

		if(player.getPitch() < -90 || player.getPitch() > 90) {
			float offset = (player.getPitch() < -90 ? player.getPitch() + 180 : player.getPitch() - 180) * 2;
			player.setPitch((player.getPitch() < -90 ? 180 + offset : -180 - offset) + player.getPitch());
			player.setYaw(180 + player.getYaw());
		}

		player.stopFallFlying();
	}
}
