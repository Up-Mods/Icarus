package dev.cammiescorner.icarus.network.s2c;

import commonnetwork.api.Dispatcher;
import commonnetwork.networking.data.PacketContext;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.IcarusConfig;
import dev.cammiescorner.icarus.client.IcarusClient;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

public record SyncConfigValuesPacket(float wingsSpeed, float maxSlowedMultiplier, boolean armorSlows, boolean canLoopDeLoop) {
	public static final ResourceLocation ID = Icarus.id("sync_config_values");

	public void encode(FriendlyByteBuf buf) {
		buf.writeFloat(wingsSpeed());
		buf.writeFloat(maxSlowedMultiplier());
		buf.writeBoolean(armorSlows());
		buf.writeBoolean(canLoopDeLoop());
	}

	public static void send(ServerPlayer player) {
		var packet = new SyncConfigValuesPacket(IcarusConfig.wingsSpeed, IcarusConfig.maxSlowedMultiplier, IcarusConfig.armorSlows, IcarusConfig.canLoopDeLoop);
		Dispatcher.sendToClient(packet, player);
	}

	public static SyncConfigValuesPacket decode(FriendlyByteBuf buf) {
		float wingsSpeed = buf.readFloat();
		float maxSlowedMultiplier = buf.readFloat();
		boolean armorSlows = buf.readBoolean();
		boolean canLoopDeLoop = buf.readBoolean();

		return new SyncConfigValuesPacket(wingsSpeed, maxSlowedMultiplier, armorSlows, canLoopDeLoop);
	}

	public static void handle(PacketContext<SyncConfigValuesPacket> ctx) {
		Minecraft.getInstance().execute(() -> {
			IcarusClient.wingSpeed = ctx.message().wingsSpeed();
			IcarusClient.maxSlowedMultiplier = ctx.message().maxSlowedMultiplier();
			IcarusClient.armorSlows = ctx.message().armorSlows();
			IcarusClient.canLoopDeLoop = ctx.message().canLoopDeLoop();
		});
	}
}
