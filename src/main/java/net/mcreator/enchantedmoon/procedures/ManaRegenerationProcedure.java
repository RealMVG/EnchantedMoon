package net.mcreator.enchantedmoon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;
import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ManaRegenerationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("ManaTimer") == 50) {
			entity.getPersistentData().putDouble("ManaTimer", 0);
		} else {
			entity.getPersistentData().putDouble("ManaTimer", (entity.getPersistentData().getDouble("ManaTimer") + 1));
		}
		if ((entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).Mage == true
				&& (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).CurrectMana < 100
						+ (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).BonusMana
				&& entity.getPersistentData().getDouble("ManaTimer") == 50) {
			{
				double _setval = (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).CurrectMana
						+ (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).ManaRegeneration;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrectMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).CurrectMana > 100
				+ (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).BonusMana) {
			{
				double _setval = 100 + (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).BonusMana;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrectMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.DEMONIC_HORNS_HELMET.get())) {
			entity.getPersistentData().putBoolean("DHbuff", (false));
		}
	}
}
