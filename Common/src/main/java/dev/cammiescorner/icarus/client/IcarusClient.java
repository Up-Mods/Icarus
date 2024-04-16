package dev.cammiescorner.icarus.client;

import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.world.entity.player.Player;

public class IcarusClient {
    public static float wingSpeed;
    public static float maxSlowedMultiplier;
    public static boolean armorSlows;
    public static boolean canLoopDeLoop;

    public static void onPlayerTick(Player player) {
        if (player.isFallFlying() && IcarusHelper.hasWings.test(player) && player.zza > 0) {
            var rotation = player.getLookAngle();
            var velocity = player.getDeltaMovement();
            float modifier = armorSlows ? Math.max(1F, (player.getArmorValue() / 30F) * maxSlowedMultiplier) : 1F;
            float speed = (wingSpeed * (player.getXRot() < -75 && player.getXRot() > -105 ? 2.75F : 1F)) / modifier;

            player.setDeltaMovement(velocity.add(rotation.x * speed + (rotation.x * 1.5D - velocity.x) * speed,
                    rotation.y * speed + (rotation.y * 1.5D - velocity.y) * speed,
                    rotation.z * speed + (rotation.z * 1.5D - velocity.z) * speed));
        }
    }
}
