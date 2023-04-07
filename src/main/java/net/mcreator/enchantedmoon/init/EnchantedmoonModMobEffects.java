
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.enchantedmoon.potion.CooldownMobEffect;
import net.mcreator.enchantedmoon.potion.BlessingOfKuroshiMobEffect;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EnchantedmoonMod.MODID);
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> BLESSING_OF_KUROSHI = REGISTRY.register("blessing_of_kuroshi", () -> new BlessingOfKuroshiMobEffect());
}
