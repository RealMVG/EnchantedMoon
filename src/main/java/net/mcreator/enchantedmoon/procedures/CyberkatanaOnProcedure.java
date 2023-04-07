package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

public class CyberkatanaOnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.CYBERKATANA_UNACTIVATED.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(EnchantedmoonModItems.CYBERKATANA_ACTIVATED.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
