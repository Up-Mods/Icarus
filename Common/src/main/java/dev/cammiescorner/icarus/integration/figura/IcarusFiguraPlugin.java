package dev.cammiescorner.icarus.integration.figura;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.api.client.IcarusAPIClient;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import net.minecraft.world.entity.LivingEntity;
import org.figuramc.figura.avatar.Avatar;
import org.figuramc.figura.entries.FiguraAPI;
import org.figuramc.figura.entries.annotations.FiguraAPIPlugin;
import org.figuramc.figura.lua.LuaWhitelist;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
@LuaWhitelist
@FiguraAPIPlugin
public class IcarusFiguraPlugin implements FiguraAPI {

    private static final Object2BooleanMap<UUID> WINGS_VISIBLE = new Object2BooleanOpenHashMap<>();
    @NotNull
    private final Avatar avatar;

    // needed because this class is instantiated via reflection.
    // honestly this API is pretty bad.
    @SuppressWarnings({"unused", "DataFlowIssue"})
    public IcarusFiguraPlugin() {
        this.avatar = null;
    }

    static {
        IcarusAPIClient.addRenderPredicate(IcarusFiguraPlugin::shouldRenderWings);
    }

    public IcarusFiguraPlugin(Avatar avatar) {
        this.avatar = avatar;
    }

    @LuaWhitelist
    public boolean areWingsVisible() {
        return WINGS_VISIBLE.getOrDefault(avatar.owner, true);
    }

    @LuaWhitelist
    public void setWingsVisible(boolean visible) {
        WINGS_VISIBLE.put(avatar.owner, visible);
    }

    @Override
    public FiguraAPI build(Avatar avatar) {
        return new IcarusFiguraPlugin(avatar);
    }

    @Override
    public String getName() {
        return Icarus.MODID;
    }

    @Override
    public Collection<Class<?>> getWhitelistedClasses() {
        return List.of(IcarusFiguraPlugin.class);
    }

    @Override
    public Collection<Class<?>> getDocsClasses() {
        return List.of();
    }

    private static boolean shouldRenderWings(LivingEntity entity) {
        return WINGS_VISIBLE.getOrDefault(entity.getUUID(), true);
    }
}
