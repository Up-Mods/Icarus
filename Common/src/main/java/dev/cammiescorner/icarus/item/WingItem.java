package dev.cammiescorner.icarus.item;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.IcarusConfig;
import dev.cammiescorner.icarus.init.IcarusItemTags;
import dev.cammiescorner.icarus.init.IcarusItems;
import dev.cammiescorner.icarus.util.IcarusHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class WingItem extends Item {
    private final DyeColor primaryColor;
    private final DyeColor secondaryColor;
    private final WingType wingType;

    /**
     * The default constructor.
     */
    public WingItem(DyeColor primaryColor, DyeColor secondaryColor, WingType wingType) {
        super(new Item.Properties().durability(IcarusConfig.wingsDurability).rarity(wingType.rarity()));
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.wingType = wingType;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (IcarusHelper.equipFunc.test(player, stack)) {
            return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
        }

        return super.use(level, player, hand);
    }

    public boolean isUsable(LivingEntity entity, ItemStack stack) {
        return IcarusConfig.wingsDurability <= 0 || stack.getDamageValue() < stack.getMaxDamage() - 1;
    }

    public boolean onFlightTick(LivingEntity entity, ItemStack wings, int ticks) {
        if (IcarusConfig.wingsDurability > 0 && wings.is(IcarusItemTags.MELTS) && !(entity instanceof Player player && player.isCreative())) {
            var cfg = IcarusHelper.getConfigValues(entity);
            if (ticks % 20 == 0 || (cfg.maxHeightEnabled() && entity.getY() > entity.level().getHeight() + cfg.maxHeightAboveWorld() && ticks % 2 == 0)) {
                wings.hurtAndBreak(1, entity, EquipmentSlot.CHEST);
            }
        }

        return this.isUsable(entity, wings);
    }

    @Override
    public boolean isValidRepairItem(ItemStack current, ItemStack repair) {
        return repair.is(IcarusItemTags.WING_REPAIR_ITEMS);
    }

    public DyeColor getPrimaryColor(ItemStack stack) {
        return this.primaryColor;
    }

    public DyeColor getSecondaryColor(ItemStack stack) {
        return this.secondaryColor;
    }

    public WingType getWingType() {
        return this.wingType;
    }

    public enum WingType {
        FEATHERED("feathered"), DRAGON("dragon"), MECHANICAL_FEATHERED("mechanical_feathered"), MECHANICAL_LEATHER("mechanical_leather"), LIGHT("light"), UNIQUE("__unique") {
            @Override
            public ResourceLocation getTextureLayer1(ItemStack wings) {
                if (wings.is(IcarusItems.FLANDRES_WINGS.get())) {
                    return FLANDRES_WINGS_1;
                }
                if (wings.is(IcarusItems.DISCORDS_WINGS.get())) {
                    return DISCORDS_WINGS_1;
                }
                if (wings.is(IcarusItems.ZANZAS_WINGS.get())) {
                    return ZANZAS_WINGS_1;
                }
                return super.getTextureLayer1(wings);
            }

            @Override
            public ResourceLocation getTextureLayer2(ItemStack wings) {
                if (wings.is(IcarusItems.FLANDRES_WINGS.get())) {
                    return FLANDRES_WINGS_2;
                }
                if (wings.is(IcarusItems.DISCORDS_WINGS.get())) {
                    return DISCORDS_WINGS_2;
                }
                if (wings.is(IcarusItems.ZANZAS_WINGS.get())) {
                    return ZANZAS_WINGS_2;
                }
                return super.getTextureLayer2(wings);
            }
        };

        private static final ResourceLocation FLANDRES_WINGS_1 = Icarus.id("textures/entity/flandres_wings.png");
        private static final ResourceLocation FLANDRES_WINGS_2 = Icarus.id("textures/entity/flandres_wings_2.png");
        private static final ResourceLocation DISCORDS_WINGS_1 = Icarus.id("textures/entity/discords_wings.png");
        private static final ResourceLocation DISCORDS_WINGS_2 = Icarus.id("textures/entity/discords_wings_2.png");
        private static final ResourceLocation ZANZAS_WINGS_1 = Icarus.id("textures/entity/zanzas_wings.png");
        private static final ResourceLocation ZANZAS_WINGS_2 = Icarus.id("textures/entity/zanzas_wings_2.png");

        private final ResourceLocation layer1;
        private final ResourceLocation layer2;

        WingType(String name) {
            this.layer1 = Icarus.id("textures/entity/" + name + "_wings.png");
            this.layer2 = Icarus.id("textures/entity/" + name + "_wings_2.png");
        }

        public Rarity rarity() {
            return this == UNIQUE ? Rarity.EPIC : Rarity.RARE;
        }

        public ResourceLocation getTextureLayer1(ItemStack wings) {
            return this.layer1;
        }

        public ResourceLocation getTextureLayer2(ItemStack wings) {
            return this.layer2;
        }
    }
}
