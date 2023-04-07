
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.enchantedmoon.world.features.ores.ManafriteOreFeature;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

@Mod.EventBusSubscriber
public class EnchantedmoonModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EnchantedmoonMod.MODID);
	public static final RegistryObject<Feature<?>> MANAFRITE_ORE = REGISTRY.register("manafrite_ore", ManafriteOreFeature::feature);
}
