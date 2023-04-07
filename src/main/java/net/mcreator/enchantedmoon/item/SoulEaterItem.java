
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class SoulEaterItem extends SwordItem {
	public SoulEaterItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON));
	}
}
