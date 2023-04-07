
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

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
				return 12f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.1f, new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON));
	}
}
