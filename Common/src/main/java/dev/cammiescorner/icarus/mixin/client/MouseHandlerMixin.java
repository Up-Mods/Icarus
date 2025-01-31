package dev.cammiescorner.icarus.mixin.client;

import dev.cammiescorner.icarus.client.IcarusClientConfig;
import dev.cammiescorner.icarus.util.IcarusHelper;
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
        if (minecraft.player != null && minecraft.player.isFallFlying() && IcarusClientConfig.canLoopDeLoop && IcarusHelper.hasWings(minecraft.player) && IcarusHelper.getConfigValues(minecraft.player).canLoopDeLoop() && (minecraft.player.getXRot() > 90 || minecraft.player.getXRot() < -90))
            return -x;

        return x;
    }
}
