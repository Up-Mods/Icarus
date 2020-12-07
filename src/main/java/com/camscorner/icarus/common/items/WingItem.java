package com.camscorner.icarus.common.items;

import com.camscorner.icarus.Icarus;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import top.theillusivec4.caelus.api.CaelusApi;

import java.util.UUID;

public class WingItem extends TrinketItem
{
	private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
	private ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
	private double speed;
	private double acceleration;
	private boolean shouldSlowfall;

	/**
	 * @param speed The speed the wings allow the player to travel at. Recommended: 0.05D.
	 * @param acceleration The speed at which the player will accelerate. Also controls turn radius. Recommended 0.05D.
	 */
	public WingItem(double speed, double acceleration)
	{
		super(new Item.Settings().group(Icarus.ITEM_GROUP).maxCount(1));
		this.builder.put(CaelusApi.ELYTRA_FLIGHT, new EntityAttributeModifier(UUID.fromString("7d9704a0-383f-11eb-adc1-0242ac120002"),
				"Flight", 1, EntityAttributeModifier.Operation.ADDITION));
		this.attributeModifiers = this.builder.build();
		this.speed = speed;
		this.acceleration = acceleration;
	}

	@Override
	public void tick(PlayerEntity player, ItemStack stack)
	{
		if(player.isFallFlying())
		{
			if(player.forwardSpeed > 0)
				applySpeed(player);

			if(player.isSneaking())
				stopFlying(player);
		}
		else
		{
			if(player.isOnGround() || player.isTouchingWater())
				shouldSlowfall = false;

			if(shouldSlowfall)
			{
				player.fallDistance = 0F;
				player.setVelocity(player.getVelocity().x, -0.4, player.getVelocity().z);
			}
		}
	}

	@Override
	public boolean canWearInSlot(String group, String slot)
	{
		return group.equals(SlotGroups.CHEST) && slot.equals(Slots.CAPE);
	}

	@Override
	public Multimap<EntityAttribute, EntityAttributeModifier> getTrinketModifiers(String group, String slot, UUID uuid, ItemStack stack)
	{
		return this.attributeModifiers;
	}

	public void stopFlying(PlayerEntity player)
	{
		shouldSlowfall = true;
		player.stopFallFlying();
	}

	public void applySpeed(LivingEntity entity)
	{
		shouldSlowfall = false;
		Vec3d rotation = entity.getRotationVector();
		Vec3d velocity = entity.getVelocity();

		entity.setVelocity(velocity.add(rotation.x * speed + (rotation.x * 1.5D - velocity.x) * acceleration,
										rotation.y * speed + (rotation.y * 1.5D - velocity.y) * acceleration,
										rotation.z * speed + (rotation.z * 1.5D - velocity.z) * acceleration));
	}
}
