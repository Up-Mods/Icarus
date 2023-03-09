package dev.cammiescorner.icarus.core.network.s2c;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.IcarusClient;
import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class SyncConfigValuesPacket {
	public static final Identifier ID = new Identifier(Icarus.MOD_ID, "sync_config_values");

	public static void send(ServerPlayerEntity player) {
		PacketByteBuf buf = PacketByteBufs.create();

		buf.writeFloat(IcarusConfig.wingsSpeed);
		buf.writeFloat(IcarusConfig.maxSlowedMultiplier);
		buf.writeBoolean(IcarusConfig.armourSlows);
		buf.writeBoolean(IcarusConfig.canLoopDeLoop);

		ServerPlayNetworking.send(player, ID, buf);
	}

	public static void handle(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender sender) {
		float wingsSpeed = buf.readFloat();
		float maxSlowedMultiplier = buf.readFloat();
		boolean armourSlows = buf.readBoolean();
		boolean canLoopDeLoop = buf.readBoolean();

		client.execute(() -> {
			IcarusClient.wingSpeed = wingsSpeed;
			IcarusClient.maxSlowedMultiplier = maxSlowedMultiplier;
			IcarusClient.armourSlows = armourSlows;
			IcarusClient.canLoopDeLoop = canLoopDeLoop;
		});
	}
}
