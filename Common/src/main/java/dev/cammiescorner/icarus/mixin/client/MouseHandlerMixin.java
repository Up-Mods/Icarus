package dev.cammiescorner.icarus.mixin.client;

import dev.cammiescorner.icarus.client.IcarusClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin {

    @Shadow
    @Final
    private Minecraft minecraft;

    @ModifyArg(method = "turnPlayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;turn(DD)V"), index = 0)
    public double changeLookDirectionX(double x) {
        if (minecraft.player != null && IcarusClient.canLoopDeLoop && minecraft.player.isFallFlying() && (minecraft.player.getXRot() > 90 || minecraft.player.getXRot() < -90))
            return -x;

        return x;
    }
}
