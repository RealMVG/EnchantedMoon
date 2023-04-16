package net.mcreator.enchantedmoon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;
import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DragonSlayerProcedureProcedure {
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
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.DRAGON_SLAYER.get()) {
			if (entity instanceof Chicken && (new ItemStack(EnchantedmoonModItems.DRAGON_SLAYER.get())).getDamageValue()
					+ (sourceentity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).DragonSlayerDamage >= (entity instanceof LivingEntity _livEnt
							? _livEnt.getHealth()
							: -1)) {
				{
					double _setval = (sourceentity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).DragonSlayerDamage + 0.1;
					sourceentity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DragonSlayerDamage = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.DRAGON_SLAYER.get()) {
			entity.hurt(DamageSource.GENERIC, (float) (sourceentity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).DragonSlayerDamage);
		}
	}
}
