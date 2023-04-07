package net.mcreator.enchantedmoon.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.enchantedmoon.init.EnchantedmoonModMobEffects;
import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MiniKuroshiProcedureProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(EnchantedmoonModItems.MINI_KUROSHI.get(), lv).isPresent() : false) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnchantedmoonModMobEffects.BLESSING_OF_KUROSHI.get()) : false)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				random = Math.random();
				random = 1;
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 2, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 2, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 2, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 1, (false), (false)));
				if (random < 0.25) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								"\u041B\u043E\u043B, \u043A\u0430\u0436\u0435\u0442\u0441\u044F \u0442\u044B \u043F\u043E\u043C\u0435\u0440, \u043D\u043E \u044F \u0442\u0435\u0431\u044F \u0441\u043D\u043E\u0432\u0430 \u0441\u043F\u0430\u0441"),
								(true));
				} else if (random < 0.5) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								"\u0427\u0442\u043E \u0436, \u044F \u0441\u043D\u043E\u0432\u0430 \u0442\u0435\u0431\u044F \u0441\u043F\u0430\u0441. \u041C\u043E\u0436\u0435\u0448\u044C \u043D\u0435 \u0431\u043B\u0430\u0433\u043E\u0434\u0430\u0440\u0438\u0442\u044C"),
								(true));
				} else if (random < 0.75) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								"\u0422\u044B \u0443\u043C\u0435\u0440, \u0438 \u044F \u0441\u043D\u043E\u0432\u0430 \u0441\u043F\u0430\u0441 \u0442\u0435\u0431\u044F. \u041D\u0438\u0447\u0435\u0433\u043E \u0443\u0434\u0438\u0432\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0433\u043E"),
								(true));
				}
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(EnchantedmoonModMobEffects.BLESSING_OF_KUROSHI.get(), 6000, 1, (false), (false)));
			}
		}
	}
}
