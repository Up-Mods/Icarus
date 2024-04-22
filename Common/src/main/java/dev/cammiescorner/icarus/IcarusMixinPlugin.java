package dev.cammiescorner.icarus;

import dev.cammiescorner.icarus.util.IcarusCompatService;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

public class IcarusMixinPlugin implements IMixinConfigPlugin {

    private static final IcarusCompatService COMPAT_SERVICE = ServiceLoader.load(IcarusCompatService.class).findFirst().orElseThrow(() -> new IllegalStateException("[Icarus] Unable to initialize mod compat helper!"));

    @Override
    public void onLoad(String mixinPackage) {
        // NO-OP
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if("dev.cammiescorner.icarus.mixin.client.FiguraCompatWingsLayerMixin".equals(mixinClassName)) {
            return COMPAT_SERVICE.isModLoaded("figura");
        }

        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
        // NO-OP
    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        // NO-OP
    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        // NO-OP
    }
}
