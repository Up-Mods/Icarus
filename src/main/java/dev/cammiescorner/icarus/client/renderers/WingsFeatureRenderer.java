package dev.cammiescorner.icarus.client.renderers;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.client.IcarusClient;
import dev.cammiescorner.icarus.client.models.*;
import dev.cammiescorner.icarus.common.items.WingItem;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.Optional;

public class WingsFeatureRenderer<T extends LivingEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {
	private WingEntityModel<T> wingModel;
	private final FeatheredWingsModel<T> featheredWings;
	private final LeatherWingsModel<T> leatherWings;
	private final LightWingsModel<T> lightWings;
	private final FlandresWingsModel<T> flandresWings;
	private final DiscordsWingsModel<T> discordsWings;
	private final ZanzasWingsModel<T> zanzasWings;

	public WingsFeatureRenderer(FeatureRendererContext<T, M> context, EntityModelLoader loader) {
		super(context);
		this.featheredWings = new FeatheredWingsModel<>(loader.getModelPart(IcarusClient.FEATHERED));
		this.leatherWings = new LeatherWingsModel<>(loader.getModelPart(IcarusClient.LEATHER));
		this.lightWings = new LightWingsModel<>(loader.getModelPart(IcarusClient.LIGHT));
		this.flandresWings = new FlandresWingsModel<>(loader.getModelPart(IcarusClient.FLANDRE));
		this.discordsWings = new DiscordsWingsModel<>(loader.getModelPart(IcarusClient.DISCORD));
		this.zanzasWings = new ZanzasWingsModel<>(loader.getModelPart(IcarusClient.ZANZA));
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
		if(entity instanceof PlayerEntity) {
			Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(entity);

			component.ifPresent(trinketComponent -> {
				if(!trinketComponent.isEquipped(stack -> stack.getItem() instanceof WingItem) && Icarus.HAS_WINGS.test(entity) && Icarus.WINGS.apply(entity).getWings() instanceof WingItem wingItem) {
					float[] primaryColour = wingItem.getPrimaryColour().getColorComponents();
					float[] secondaryColour = wingItem.getSecondaryColour().getColorComponents();
					float r1 = primaryColour[0];
					float g1 = primaryColour[1];
					float b1 = primaryColour[2];
					float r2 = secondaryColour[0];
					float g2 = secondaryColour[1];
					float b2 = secondaryColour[2];

					String wingType = wingItem.getWingType() != WingItem.WingType.UNIQUE ? wingItem.getWingType().toString().toLowerCase(Locale.ROOT) : Registries.ITEM.getId(wingItem).getPath().replaceAll("_wings", "");

					if(wingItem.getWingType() == WingItem.WingType.FEATHERED || wingItem.getWingType() == WingItem.WingType.MECHANICAL_FEATHERED)
						wingModel = featheredWings;
					if(wingItem.getWingType() == WingItem.WingType.DRAGON || wingItem.getWingType() == WingItem.WingType.MECHANICAL_LEATHER)
						wingModel = leatherWings;
					if(wingItem.getWingType() == WingItem.WingType.LIGHT)
						wingModel = lightWings;
					if(wingType.equals("flandres"))
						wingModel = flandresWings;
					if(wingType.equals("discords"))
						wingModel = discordsWings;
					if(wingType.equals("zanzas"))
						wingModel = zanzasWings;

					Identifier layer1 = new Identifier(Icarus.MOD_ID, "textures/entity/" + wingType + "_wings.png");
					Identifier layer2 = new Identifier(Icarus.MOD_ID, "textures/entity/" + wingType + "_wings_2.png");

					matrices.push();
					matrices.translate(0.0D, 0.0D, 0.125D);
					this.getContextModel().copyStateTo(this.wingModel);
					this.wingModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
					this.renderWings(matrices, vertexConsumers, wingItem.getDefaultStack(), RenderLayer.getEntityTranslucent(layer2), light, r2, g2, b2);
					this.renderWings(matrices, vertexConsumers, wingItem.getDefaultStack(), RenderLayer.getEntityTranslucent(layer1), light, r1, g1, b1);
					matrices.pop();
				}
				else {
					trinketComponent.getAllEquipped().forEach(pair -> {
						ItemStack stack = pair.getRight();

						if (stack.getItem() instanceof WingItem wingItem) {
							float[] primaryColour = wingItem.getPrimaryColour().getColorComponents();
							float[] secondaryColour = wingItem.getSecondaryColour().getColorComponents();
							float r1 = primaryColour[0];
							float g1 = primaryColour[1];
							float b1 = primaryColour[2];
							float r2 = secondaryColour[0];
							float g2 = secondaryColour[1];
							float b2 = secondaryColour[2];

							String wingType = wingItem.getWingType() != WingItem.WingType.UNIQUE ? wingItem.getWingType().toString().toLowerCase(Locale.ROOT) : Registries.ITEM.getId(wingItem).getPath().replaceAll("_wings", "");

							if (wingItem.getWingType() == WingItem.WingType.FEATHERED || wingItem.getWingType() == WingItem.WingType.MECHANICAL_FEATHERED)
								wingModel = featheredWings;
							if (wingItem.getWingType() == WingItem.WingType.DRAGON || wingItem.getWingType() == WingItem.WingType.MECHANICAL_LEATHER)
								wingModel = leatherWings;
							if (wingItem.getWingType() == WingItem.WingType.LIGHT)
								wingModel = lightWings;
							if (wingType.equals("flandres"))
								wingModel = flandresWings;
							if (wingType.equals("discords"))
								wingModel = discordsWings;
							if (wingType.equals("zanzas"))
								wingModel = zanzasWings;

							Identifier layer1 = new Identifier(Icarus.MOD_ID, "textures/entity/" + wingType + "_wings.png");
							Identifier layer2 = new Identifier(Icarus.MOD_ID, "textures/entity/" + wingType + "_wings_2.png");

							matrices.push();
							matrices.translate(0.0D, 0.0D, 0.125D);
							this.getContextModel().copyStateTo(this.wingModel);
							this.wingModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
							this.renderWings(matrices, vertexConsumers, stack, RenderLayer.getEntityTranslucent(layer2), light, r2, g2, b2);
							this.renderWings(matrices, vertexConsumers, stack, RenderLayer.getEntityTranslucent(layer1), light, r1, g1, b1);
							matrices.pop();
						}
					});
				}
			});
		}
	}

	public void renderWings(MatrixStack matrices, VertexConsumerProvider vertexConsumers, @Nullable ItemStack stack, RenderLayer renderLayer, int light, float r, float g, float b) {
		VertexConsumer vertexConsumer = ItemRenderer.getArmorGlintConsumer(vertexConsumers, renderLayer, false, stack != null && stack.hasGlint());
		this.wingModel.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, r, g, b, 1F);
	}
}
