package dev.cammiescorner.icarus.client.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.cammiescorner.icarus.api.client.IcarusAPIClient;
import dev.cammiescorner.icarus.client.IcarusClient;
import dev.cammiescorner.icarus.client.IcarusModels;
import dev.cammiescorner.icarus.client.models.*;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.item.WingItem;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FastColor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

//TODO clean up
public class WingsLayer<T extends LivingEntity, M extends EntityModel<T>> extends RenderLayer<T, M> {
    private final FeatheredWingsModel<T> featheredWings;
    private final LeatherWingsModel<T> leatherWings;
    private final LightWingsModel<T> lightWings;
    private final FlandresWingsModel<T> flandresWings;
    private final DiscordsWingsModel<T> discordsWings;
    private final ZanzasWingsModel<T> zanzasWings;

    public WingsLayer(RenderLayerParent<T, M> context, EntityModelSet loader) {
        super(context);
        this.featheredWings = new FeatheredWingsModel<>(loader.bakeLayer(IcarusModels.FEATHERED));
        this.leatherWings = new LeatherWingsModel<>(loader.bakeLayer(IcarusModels.LEATHER));
        this.lightWings = new LightWingsModel<>(loader.bakeLayer(IcarusModels.LIGHT));
        this.flandresWings = new FlandresWingsModel<>(loader.bakeLayer(IcarusModels.FLANDRE));
        this.discordsWings = new DiscordsWingsModel<>(loader.bakeLayer(IcarusModels.DISCORD));
        this.zanzasWings = new ZanzasWingsModel<>(loader.bakeLayer(IcarusModels.ZANZA));
    }

    @Override
    public void render(PoseStack pose, MultiBufferSource bufferSource, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        var stack = IcarusAPIClient.getWingsForRendering(entity);

        if (stack.getItem() instanceof WingItem wingItem && IcarusClient.shouldRenderWings(entity)) {
            var primaryColor = FastColor.ARGB32.color(255, wingItem.getPrimaryColor(stack).getTextureDiffuseColor());
            var secondaryColor = FastColor.ARGB32.color(255, wingItem.getSecondaryColor(stack).getTextureDiffuseColor());

            var wingModel = switch (wingItem.getWingType()) {
                case FEATHERED, MECHANICAL_FEATHERED -> featheredWings;
                case DRAGON, MECHANICAL_LEATHER -> leatherWings;
                case LIGHT -> lightWings;
                case UNIQUE -> {
                    if (stack.is(IcarusItems.FLANDRES_WINGS.get())) {
                        yield flandresWings;
                    }
                    if (stack.is(IcarusItems.DISCORDS_WINGS.get())) {
                        yield discordsWings;
                    }
                    if (stack.is(IcarusItems.ZANZAS_WINGS.get())) {
                        yield zanzasWings;
                    }
                    yield null;
                }
                default -> null;
            };
            if (wingModel == null) {
                return;
            }

            ResourceLocation layer1 = wingItem.getWingType().getTextureLayer1(stack);
            ResourceLocation layer2 = wingItem.getWingType().getTextureLayer2(stack);

            pose.pushPose();
            pose.translate(0.0D, 0.0D, 0.125D);
            this.getParentModel().copyPropertiesTo(wingModel);
            wingModel.setupAnim(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            this.renderWings(wingModel, pose, bufferSource, stack, RenderType.entityTranslucent(layer2), light, secondaryColor);
            this.renderWings(wingModel, pose, bufferSource, stack, RenderType.entityTranslucent(layer1), light, primaryColor);
            pose.popPose();
        }
    }

    public void renderWings(WingEntityModel<T> model, PoseStack matrices, MultiBufferSource vertexConsumers, @Nullable ItemStack stack, RenderType renderLayer, int light, int color) {
        VertexConsumer vertexConsumer = ItemRenderer.getArmorFoilBuffer(vertexConsumers, renderLayer, stack != null && stack.hasFoil());
        model.renderToBuffer(matrices, vertexConsumer, light, OverlayTexture.NO_OVERLAY, color);
    }
}
