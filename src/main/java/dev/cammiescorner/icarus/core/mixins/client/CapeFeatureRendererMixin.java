package dev.cammiescorner.icarus.core.mixins.client;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CapeFeatureRenderer.class)
public class CapeFeatureRendererMixin {
	@Inject(method = "render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/network/AbstractClientPlayerEntity;FFFFFF)V", at = @At("HEAD"), cancellable = true)
	public void disableCape(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, AbstractClientPlayerEntity abstractClientPlayerEntity, float f, float g, float h, float j, float k, float l, CallbackInfo info) {
		if(Icarus.HAS_WINGS.test(abstractClientPlayerEntity) || TrinketsApi.getTrinketComponent(abstractClientPlayerEntity).map(trinketComponent -> trinketComponent.isEquipped(itemStack -> itemStack.getItem() instanceof WingItem)).orElse(false))
			info.cancel();
	}
}
