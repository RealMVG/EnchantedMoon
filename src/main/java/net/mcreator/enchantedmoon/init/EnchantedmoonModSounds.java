
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EnchantedmoonMod.MODID);
	public static final RegistryObject<SoundEvent> BERSERKTHEME = REGISTRY.register("berserktheme", () -> new SoundEvent(new ResourceLocation("enchantedmoon", "berserktheme")));
}
