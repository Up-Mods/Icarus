package com.camscorner.icarus.client.renderers;

import com.camscorner.icarus.Icarus;
import com.camscorner.icarus.client.models.WingEntityModel;
import com.camscorner.icarus.common.items.WingItem;
import com.camscorner.icarus.core.mixins.DyeColourAccessor;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WingsFeatureRenderer<T extends LivingEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M>
{
	private final WingEntityModel<T> wings = new WingEntityModel<>();
	private String texturePath = "textures/entity/";
	private String wingType;

	public WingsFeatureRenderer(FeatureRendererContext<T, M> context)
	{
		super(context);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch)
	{
		if(entity instanceof PlayerEntity)
		{
			ItemStack stack = TrinketsApi.getTrinketComponent((PlayerEntity) entity).getStack("chest", "cape");

			if(stack.getItem() instanceof WingItem)
			{
				WingItem wingItem = (WingItem) stack.getItem();
				int primaryColour = ((DyeColourAccessor) (Object) wingItem.getPrimaryColour()).getColour();
				int secondaryColour = ((DyeColourAccessor) (Object) wingItem.getSecondaryColour()).getColour();
				float r1 = (float) (primaryColour >> 16 & 255) / 255F;
				float g1 = (float) (primaryColour >> 8 & 255) / 255F;
				float b1 = (float) (primaryColour & 255) / 255F;
				float r2 = (float) (secondaryColour >> 16 & 255) / 255F;
				float g2 = (float) (secondaryColour >> 8 & 255) / 255F;
				float b2 = (float) (secondaryColour & 255) / 255F;

				wingType = wingItem.getWingType() != WingItem.WingType.UNIQUE ? wingItem.getWingType().toString().toLowerCase() : Registry.ITEM.getId(wingItem).getPath().replaceAll("_wings", "");

				Identifier layer1 = new Identifier(Icarus.MOD_ID, texturePath + wingType + "_wings.png");
				Identifier layer2 = new Identifier(Icarus.MOD_ID, texturePath + wingType + "_wings_2.png");

				matrices.push();
				matrices.translate(0.0D, 0.0D, 0.125D);
				this.getContextModel().copyStateTo(this.wings);
				this.wings.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
				this.renderWings(matrices, vertexConsumers, stack, layer1, light, r1, g1, b1);
				this.renderWings(matrices, vertexConsumers, stack, layer2, light, r2, g2, b2);
				matrices.pop();
			}
		}
	}

	public void renderWings(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, Identifier layerName, int light, float r, float g, float b)
	{
		VertexConsumer vertexConsumer = ItemRenderer.getArmorGlintConsumer(vertexConsumers, RenderLayer.getEntityTranslucent(layerName), false, stack.hasGlint());
		this.wings.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, r, g, b, 1.0F);
	}
}
