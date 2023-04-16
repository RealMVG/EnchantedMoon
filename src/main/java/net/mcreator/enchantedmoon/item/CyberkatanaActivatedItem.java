
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.enchantedmoon.procedures.CyberkatanaOffProcedure;

import java.util.List;

public class CyberkatanaActivatedItem extends SwordItem {
	public CyberkatanaActivatedItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
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
				return Ingredient.EMPTY;
			}
		}, 3, -2.7f, new Item.Properties().tab(null));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CyberkatanaOffProcedure.execute(entity);
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
		list.add(Component.literal("\u00A7oThe \u00A76\u00A7oSword\u00A7f\u00A7o of the \u00A79\u00A7oLord of Darkness\u00A7f\u00A7o imbued"));
		list.add(Component.literal("\u00A7owith the power of shadows\""));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CyberkatanaOffProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
