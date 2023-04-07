
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.enchantedmoon.block.RuneBlock;
import net.mcreator.enchantedmoon.block.ManafriteOreBlock;
import net.mcreator.enchantedmoon.block.EuriPortalBlockBlock;
import net.mcreator.enchantedmoon.block.EuriGrassBlock;
import net.mcreator.enchantedmoon.block.EuriDirtBlock;
import net.mcreator.enchantedmoon.block.AltarBlock;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnchantedmoonMod.MODID);
	public static final RegistryObject<Block> EURI_DIRT = REGISTRY.register("euri_dirt", () -> new EuriDirtBlock());
	public static final RegistryObject<Block> EURI_GRASS = REGISTRY.register("euri_grass", () -> new EuriGrassBlock());
	public static final RegistryObject<Block> EURI_PORTAL_BLOCK = REGISTRY.register("euri_portal_block", () -> new EuriPortalBlockBlock());
	public static final RegistryObject<Block> RUNE = REGISTRY.register("rune", () -> new RuneBlock());
	public static final RegistryObject<Block> ALTAR = REGISTRY.register("altar", () -> new AltarBlock());
	public static final RegistryObject<Block> MANAFRITE_ORE = REGISTRY.register("manafrite_ore", () -> new ManafriteOreBlock());
}
