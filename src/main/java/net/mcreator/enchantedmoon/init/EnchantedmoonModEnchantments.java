
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.enchantedmoon.enchantment.LifeStealEnchantment;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EnchantedmoonMod.MODID);
	public static final RegistryObject<Enchantment> LIFE_STEAL = REGISTRY.register("life_steal", () -> new LifeStealEnchantment());
}
