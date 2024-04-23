package dev.cammiescorner.icarus.api;

public interface IcarusPlayerValues {

    float wingsSpeed();

    float maxSlowedMultiplier();

    boolean armorSlows();

    boolean canLoopDeLoop();

    boolean canSlowFall();

    float exhaustionAmount();

    int maxHeightAboveWorld();

    boolean maxHeightEnabled();
}
