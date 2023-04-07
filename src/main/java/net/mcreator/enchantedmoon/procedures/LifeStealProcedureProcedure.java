package net.mcreator.enchantedmoon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.init.EnchantedmoonModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LifeStealProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(EnchantedmoonModEnchantments.LIFE_STEAL.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) > 0) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
						+ EnchantmentHelper.getItemEnchantmentLevel(EnchantedmoonModEnchantments.LIFE_STEAL.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))));
		}
	}
}
