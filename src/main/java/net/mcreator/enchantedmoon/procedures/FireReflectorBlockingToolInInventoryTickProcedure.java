package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

public class FireReflectorBlockingToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sheildDamage = 0;
		double localShieldTimer = 0;
		if (sheildDamage == 0 && itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			sheildDamage = (itemstack).getDamageValue();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(EnchantedmoonModItems.FIRE_REFLECTOR.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).setDamageValue((int) sheildDamage);
		} else {
			localShieldTimer = sheildDamage - 1;
			sheildDamage = localShieldTimer;
		}
	}
}
