
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.procedures.FireReflectorBlockingToolInInventoryTickProcedure;

public class FireReflectorBlockingItem extends PickaxeItem {
	public FireReflectorBlockingItem() {
		super(new Tier() {
			public int getUses() {
				return 836;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.REDSTONE));
			}
		}, 1, -3f, new Item.Properties().tab(null).fireResistant());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FireReflectorBlockingToolInInventoryTickProcedure.execute(entity, itemstack);
	}
}
