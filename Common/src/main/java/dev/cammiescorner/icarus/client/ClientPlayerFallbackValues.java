package dev.cammiescorner.icarus.client;

import dev.cammiescorner.icarus.api.IcarusPlayerValues;
import dev.cammiescorner.icarus.util.ServerPlayerFallbackValues;

public class ClientPlayerFallbackValues extends ServerPlayerFallbackValues implements IcarusPlayerValues {

    private final float wingsSpeed;
    private final boolean armorSlows;
    private final float maxSlowedMultiplier;
    private final boolean canLoopDeLoop;

    public ClientPlayerFallbackValues(float wingsSpeed, float maxSlowedMultiplier, boolean armorSlows, boolean canLoopDeLoop) {
        this.wingsSpeed = wingsSpeed;
        this.armorSlows = armorSlows;
        this.maxSlowedMultiplier = maxSlowedMultiplier;
        this.canLoopDeLoop = canLoopDeLoop;
    }

    @Override
    public float wingsSpeed() {
        return wingsSpeed;
    }

    @Override
    public float maxSlowedMultiplier() {
        return maxSlowedMultiplier;
    }

    @Override
    public boolean armorSlows() {
        return armorSlows;
    }

    @Override
    public boolean canLoopDeLoop() {
        return canLoopDeLoop;
    }
}
