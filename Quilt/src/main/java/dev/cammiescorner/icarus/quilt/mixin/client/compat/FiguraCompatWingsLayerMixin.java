package dev.cammiescorner.icarus.quilt.mixin.client.compat;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.models.WingEntityModel;
import dev.cammiescorner.icarus.client.renderers.WingsLayer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.entity.LivingEntity;
import org.figuramc.figura.avatar.Avatar;
import org.figuramc.figura.avatar.AvatarManager;
import org.figuramc.figura.lua.api.vanilla_model.VanillaPart;
import org.figuramc.figura.permissions.Permissions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Locale;

@Mixin(WingsLayer.class)
public abstract class FiguraCompatWingsLayerMixin<T extends LivingEntity, M extends EntityModel<T>> extends RenderLayer<T, M> {

    @Unique
    private static final String ICARUS_LEFT_WING_PART_KEY = Icarus.MODID + "_left_wing".toUpperCase(Locale.US);

    @Unique
    private static final String ICARUS_RIGHT_WING_PART_KEY = Icarus.MODID + "_right_wing".toUpperCase(Locale.US);

    private FiguraCompatWingsLayerMixin(RenderLayerParent<T, M> $$0) {
        super($$0);
        throw new UnsupportedOperationException();
    }

    @Inject(method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V", at = @At("HEAD"))
    private void icarus$onRender(PoseStack matrices, MultiBufferSource vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch, CallbackInfo ci, @Share("avatar") LocalRef<Avatar> avatarRef) {
        avatarRef.set(AvatarManager.getAvatar(entity));
    }

    @Inject(method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V", at = @At(value = "INVOKE", target = "Ldev/cammiescorner/icarus/client/models/WingEntityModel;setupAnim(Lnet/minecraft/world/entity/LivingEntity;FFFFF)V", shift = At.Shift.AFTER))
    private void icarus$onSetupAnim(PoseStack matrices, MultiBufferSource vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch, CallbackInfo ci, @Local WingEntityModel<T> wingModel, @Share("avatar") LocalRef<Avatar> avatarRef, @Share("rWingPart") LocalRef<VanillaPart> rWingPart, @Share("lWingPart") LocalRef<VanillaPart> lWingPart) {
        rWingPart.set(null);
        lWingPart.set(null);
        var avatar = avatarRef.get();
        if(avatar == null) {
            return;
        }

        if(avatar.luaRuntime != null) {
            var rPart = (VanillaPart) avatar.luaRuntime.vanilla_model.__index(ICARUS_RIGHT_WING_PART_KEY);
            rPart.save(wingModel);
            var lPart = (VanillaPart) avatar.luaRuntime.vanilla_model.__index(ICARUS_LEFT_WING_PART_KEY);
            lPart.save(wingModel);


            if (avatar.permissions.get(Permissions.VANILLA_MODEL_EDIT) == 1) {
                rPart.preTransform(wingModel);
                rPart.posTransform(wingModel);
                rWingPart.set(rPart);
                lPart.preTransform(wingModel);
                lPart.posTransform(wingModel);
                lWingPart.set(lPart);
            }
        }
    }

    @Inject(method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;popPose()V"))
    private void icarus$restoreModel(PoseStack matrices, MultiBufferSource vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch, CallbackInfo ci, @Local WingEntityModel<T> wingModel, @Share("rWingPart") LocalRef<VanillaPart> rWingPart, @Share("lWingPart") LocalRef<VanillaPart> lWingPart) {
        if(rWingPart.get() != null) {
            rWingPart.get().restore(wingModel);
        }
        if(lWingPart.get() != null) {
            lWingPart.get().restore(wingModel);
        }
    }
}
