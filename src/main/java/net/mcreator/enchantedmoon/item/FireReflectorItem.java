
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.enchantedmoon.procedures.FireReflectorRightclickedProcedure;
import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class FireReflectorItem extends PickaxeItem {
	public FireReflectorItem() {
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
		}, 1, -3f, new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FireReflectorRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FireReflectorRightclickedProcedure.execute(context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
