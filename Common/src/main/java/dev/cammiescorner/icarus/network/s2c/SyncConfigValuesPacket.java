package dev.cammiescorner.icarus.network.s2c;

import commonnetwork.api.Dispatcher;
import commonnetwork.networking.data.PacketContext;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.ClientPlayerFallbackValues;
import dev.cammiescorner.icarus.util.IcarusHelper;
import dev.cammiescorner.icarus.util.ServerPlayerFallbackValues;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

public record SyncConfigValuesPacket(float wingsSpeed, float maxSlowedMultiplier, boolean armorSlows,
                                     boolean canLoopDeLoop, float requiredFoodAmount) {
    public static final ResourceLocation ID = Icarus.id("sync_config_values");
    public static final CustomPacketPayload.Type<CustomPacketPayload> TYPE = new CustomPacketPayload.Type<>(ID);
    public static final StreamCodec<FriendlyByteBuf, SyncConfigValuesPacket> STREAM_CODEC = StreamCodec.ofMember(SyncConfigValuesPacket::encode, SyncConfigValuesPacket::decode);

    private void encode(FriendlyByteBuf buf) {
        buf.writeFloat(wingsSpeed());
        buf.writeFloat(maxSlowedMultiplier());
        buf.writeBoolean(armorSlows());
        buf.writeBoolean(canLoopDeLoop());
        buf.writeFloat(requiredFoodAmount());
    }

    public static void send(ServerPlayer player) {
        var cfg = new ServerPlayerFallbackValues();
        var packet = new SyncConfigValuesPacket(cfg.wingsSpeed(), cfg.maxSlowedMultiplier(), cfg.armorSlows(), cfg.canLoopDeLoop(), cfg.requiredFoodAmount());
        Dispatcher.sendToClient(packet, player);
    }

    private static SyncConfigValuesPacket decode(FriendlyByteBuf buf) {
        float wingsSpeed = buf.readFloat();
        float maxSlowedMultiplier = buf.readFloat();
        boolean armorSlows = buf.readBoolean();
        boolean canLoopDeLoop = buf.readBoolean();
        float requiredFoodAmount = buf.readFloat();

        return new SyncConfigValuesPacket(wingsSpeed, maxSlowedMultiplier, armorSlows, canLoopDeLoop, requiredFoodAmount);
    }

    public static void handle(PacketContext<SyncConfigValuesPacket> ctx) {
        ClientHandler.handle(ctx);
    }

    private static class ClientHandler {
        private static void handle(PacketContext<SyncConfigValuesPacket> ctx) {
            Minecraft.getInstance().execute(() -> IcarusHelper.fallbackValues = new ClientPlayerFallbackValues(ctx.message().wingsSpeed(), ctx.message().maxSlowedMultiplier(), ctx.message().armorSlows(), ctx.message().canLoopDeLoop(), ctx.message().requiredFoodAmount()));
        }
    }
}
