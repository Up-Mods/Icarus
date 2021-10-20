package dev.cammiescorner.icarus.core.network.client;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.fabric.impl.networking.ClientSidePacketRegistryImpl;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class DeleteHungerMessage {
	public static final Identifier ID = new Identifier(Icarus.MOD_ID, "delete_hunger");
	private static final Tag.Identified<Item> MELTS = TagFactory.ITEM.create(new Identifier(Icarus.MOD_ID, "melts"));

	public static void send() {
		PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
		ClientSidePacketRegistryImpl.INSTANCE.sendToServer(ID, buf);
	}

	public static void handle(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler network, PacketByteBuf buf, PacketSender sender) {
		server.execute(() -> {
			player.getHungerManager().addExhaustion(Icarus.getConfig().exhaustionAmount);

			if(!Icarus.HAS_POWERED_FLIGHT.test(player) && Icarus.getConfig().wingsDurability > 0 && player.age % 20 == 0) {
				Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);

				component.ifPresent(trinketComponent -> trinketComponent.getAllEquipped().forEach(pair -> {
					ItemStack stack = pair.getRight();

					if(stack.getItem() instanceof WingItem wings) {
						if(!wings.isUsable(stack))
							wings.stopFlying(player);

						if(stack.isIn(MELTS))
							stack.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
					}
				}));
			}
		});
	}
}
