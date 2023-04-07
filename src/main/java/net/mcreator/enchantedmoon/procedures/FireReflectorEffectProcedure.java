package net.mcreator.enchantedmoon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FireReflectorEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof Player == true || entity instanceof ServerPlayer == true) && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.FIRE_REFLECTOR_BLOCKING.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			sourceentity.hurt(DamageSource.IN_FIRE, 6);
			sourceentity.setSecondsOnFire(4);
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
