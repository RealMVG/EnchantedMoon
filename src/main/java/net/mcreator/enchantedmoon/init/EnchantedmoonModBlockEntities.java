
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.enchantedmoon.block.entity.RuneTileEntity;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EnchantedmoonMod.MODID);
	public static final RegistryObject<BlockEntityType<RuneTileEntity>> RUNE = REGISTRY.register("rune", () -> BlockEntityType.Builder.of(RuneTileEntity::new, EnchantedmoonModBlocks.RUNE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
