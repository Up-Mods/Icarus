package dev.cammiescorner.icarus.core.network.c2s;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import dev.cammiescorner.icarus.core.util.IcarusHelper;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class DeleteHungerMessage {
	public static final Identifier ID = new Identifier(Icarus.MOD_ID, "delete_hunger");
	private static final TagKey<Item> MELTS = TagKey.of(Registries.ITEM.getKey(), new Identifier(Icarus.MOD_ID, "melts"));

	public static void send() {
		PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
		ClientPlayNetworking.send(ID, buf);
	}

	public static void handle(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler network, PacketByteBuf buf, PacketSender sender) {
		server.execute(() -> {
			player.getHungerManager().addExhaustion(IcarusConfig.exhaustionAmount);

			if(!Icarus.HAS_WINGS.test(player) && IcarusConfig.wingsDurability > 0 && player.age % 20 == 0) {
				Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);

				component.ifPresent(trinketComponent -> trinketComponent.getAllEquipped().forEach(pair -> {
					ItemStack stack = pair.getRight();

					if(stack.getItem() instanceof WingItem wings) {
						if(!wings.isUsable(stack))
							IcarusHelper.stopFlying(player);

						if(stack.isIn(MELTS))
							stack.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
					}
				}));
			}
		});
	}
}
