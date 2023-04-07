
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, EnchantedmoonMod.MODID);
	public static final RegistryObject<SimpleParticleType> CYBER_SWEEP = REGISTRY.register("cyber_sweep", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> DARK_PARTICLE = REGISTRY.register("dark_particle", () -> new SimpleParticleType(true));
}
