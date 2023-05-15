
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.enchantedmoon.procedures.DragonSlayerOnKillProcedure;
import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class DragonSlayerItem extends SwordItem {
	public DragonSlayerItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3.1f, new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DragonSlayerOnKillProcedure.execute(entity, sourceentity);
		return retval;
	}
}
