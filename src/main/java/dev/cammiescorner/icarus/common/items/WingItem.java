package dev.cammiescorner.icarus.common.items;

import dev.cammiescorner.icarus.Icarus;
import dev.cammiescorner.icarus.core.integration.IcarusConfig;
import dev.cammiescorner.icarus.core.util.IcarusHelper;
import dev.cammiescorner.icarus.core.util.SlowFallEntity;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.Nullable;

public class WingItem extends TrinketItem implements Equipment {
	private final DyeColor primaryColour;
	private final DyeColor secondaryColour;
	private final WingType wingType;
	private static final TagKey<Item> MELTS = TagKey.of(Registries.ITEM.getKey(), new Identifier(Icarus.MOD_ID, "melts"));

	/**
	 * The default constructor.
	 */
	public WingItem(DyeColor primaryColour, DyeColor secondaryColour, WingType wingType) {
		super(new Item.Settings().maxCount(1).maxDamage(IcarusConfig.wingsDurability).rarity(wingType == WingType.UNIQUE ? Rarity.EPIC : Rarity.RARE));
		this.primaryColour = primaryColour;
		this.secondaryColour = secondaryColour;
		this.wingType = wingType;
	}

	public boolean isUsable(ItemStack stack) {
		return IcarusConfig.wingsDurability <= 0 || stack.getDamage() < stack.getMaxDamage() - 1;
	}

	@Override
	public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
		if(entity instanceof PlayerEntity player) {
			if(Icarus.HAS_WINGS.test(player))
				return;

			if(player.getHungerManager().getFoodLevel() <= 6 || !isUsable(stack)) {
				IcarusHelper.stopFlying(player);
				return;
			}

			if(player.isFallFlying()) {
				if(player.forwardSpeed > 0)
					IcarusHelper.applySpeed(player, stack);

				if((IcarusConfig.canSlowFall && player.isSneaking()) || player.isSubmergedInWater())
					IcarusHelper.stopFlying(player);

				if(player.getPos().y > player.world.getHeight() + 64 && player.age % 2 == 0 && stack.isIn(MELTS))
					stack.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
			}
			else {
				if(player.isOnGround() || player.isTouchingWater())
					((SlowFallEntity) player).setSlowFalling(false);

				if(((SlowFallEntity) player).isSlowFalling()) {
					player.fallDistance = 0F;
					player.setVelocity(player.getVelocity().x, -0.4, player.getVelocity().z);
				}
			}
		}
	}

	@Override
	public boolean canRepair(ItemStack stack, ItemStack ingredient) {
		return ingredient.isOf(Items.PHANTOM_MEMBRANE);
	}

	@Override
	public EquipmentSlot getSlotType() {
		return EquipmentSlot.CHEST;
	}

	@Nullable
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA;
	}

	public DyeColor getPrimaryColour() {
		return this.primaryColour;
	}

	public DyeColor getSecondaryColour() {
		return this.secondaryColour;
	}

	public WingType getWingType() {
		return this.wingType;
	}

	public enum WingType {
		FEATHERED, DRAGON, MECHANICAL_FEATHERED, MECHANICAL_LEATHER, LIGHT, UNIQUE
	}
}
