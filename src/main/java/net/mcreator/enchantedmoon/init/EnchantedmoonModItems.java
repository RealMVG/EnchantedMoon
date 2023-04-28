
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.enchantedmoon.item.SoulEaterItem;
import net.mcreator.enchantedmoon.item.NaginataItem;
import net.mcreator.enchantedmoon.item.MiniKuroshiItem;
import net.mcreator.enchantedmoon.item.ManafriteItem;
import net.mcreator.enchantedmoon.item.ManaCakeItem;
import net.mcreator.enchantedmoon.item.ManaAmuletItem;
import net.mcreator.enchantedmoon.item.MagicCircleItem;
import net.mcreator.enchantedmoon.item.GodsCadiloItem;
import net.mcreator.enchantedmoon.item.FireReflectorItem;
import net.mcreator.enchantedmoon.item.FireReflectorBlockingItem;
import net.mcreator.enchantedmoon.item.FinsSwordItem;
import net.mcreator.enchantedmoon.item.DragonSlayerItem;
import net.mcreator.enchantedmoon.item.DemonicHornsItem;
import net.mcreator.enchantedmoon.item.CyberkatanaUnactivatedItem;
import net.mcreator.enchantedmoon.item.CyberkatanaBossItem;
import net.mcreator.enchantedmoon.item.CyberkatanaActivatedItem;
import net.mcreator.enchantedmoon.item.BerserkThemeItem;
import net.mcreator.enchantedmoon.block.display.RuneDisplayItem;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

public class EnchantedmoonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnchantedmoonMod.MODID);
	public static final RegistryObject<Item> MAGIC_CIRCLE = REGISTRY.register("magic_circle", () -> new MagicCircleItem());
	public static final RegistryObject<Item> DEMONIC_HORNS_HELMET = REGISTRY.register("demonic_horns_helmet", () -> new DemonicHornsItem.Helmet());
	public static final RegistryObject<Item> GODS_CADILO = REGISTRY.register("gods_cadilo", () -> new GodsCadiloItem());
	public static final RegistryObject<Item> FIRE_REFLECTOR = REGISTRY.register("fire_reflector", () -> new FireReflectorItem());
	public static final RegistryObject<Item> SOUL_EATER = REGISTRY.register("soul_eater", () -> new SoulEaterItem());
	public static final RegistryObject<Item> DRAGON_SLAYER = REGISTRY.register("dragon_slayer", () -> new DragonSlayerItem());
	public static final RegistryObject<Item> FINS_SWORD = REGISTRY.register("fins_sword", () -> new FinsSwordItem());
	public static final RegistryObject<Item> CYBERKATANA_UNACTIVATED = REGISTRY.register("cyberkatana_unactivated", () -> new CyberkatanaUnactivatedItem());
	public static final RegistryObject<Item> NAGINATA = REGISTRY.register("naginata", () -> new NaginataItem());
	public static final RegistryObject<Item> EURI_DIRT = block(EnchantedmoonModBlocks.EURI_DIRT, EnchantedmoonModTabs.TAB_ENCHANTED_MOON);
	public static final RegistryObject<Item> EURI_GRASS = block(EnchantedmoonModBlocks.EURI_GRASS, EnchantedmoonModTabs.TAB_ENCHANTED_MOON);
	public static final RegistryObject<Item> EURI_PORTAL_BLOCK = block(EnchantedmoonModBlocks.EURI_PORTAL_BLOCK, EnchantedmoonModTabs.TAB_ENCHANTED_MOON);
	public static final RegistryObject<Item> RUNE = REGISTRY.register(EnchantedmoonModBlocks.RUNE.getId().getPath(), () -> new RuneDisplayItem(EnchantedmoonModBlocks.RUNE.get(), new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON)));
	public static final RegistryObject<Item> BERSERK_THEME = REGISTRY.register("berserk_theme", () -> new BerserkThemeItem());
	public static final RegistryObject<Item> MINI_KUROSHI = REGISTRY.register("mini_kuroshi", () -> new MiniKuroshiItem());
	public static final RegistryObject<Item> ALTAR = block(EnchantedmoonModBlocks.ALTAR, EnchantedmoonModTabs.TAB_ENCHANTED_MOON);
	public static final RegistryObject<Item> MANAFRITE = REGISTRY.register("manafrite", () -> new ManafriteItem());
	public static final RegistryObject<Item> MANAFRITE_ORE = block(EnchantedmoonModBlocks.MANAFRITE_ORE, EnchantedmoonModTabs.TAB_ENCHANTED_MOON);
	public static final RegistryObject<Item> TRAINING_DUMMY_SPAWN_EGG = REGISTRY.register("training_dummy_spawn_egg",
			() -> new ForgeSpawnEggItem(EnchantedmoonModEntities.TRAINING_DUMMY, -13421773, -256, new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON)));
	public static final RegistryObject<Item> KUROSHI_SPAWN_EGG = REGISTRY.register("kuroshi_spawn_egg",
			() -> new ForgeSpawnEggItem(EnchantedmoonModEntities.KUROSHI, -16777216, -16777063, new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON)));
	public static final RegistryObject<Item> MANA_AMULET = REGISTRY.register("mana_amulet", () -> new ManaAmuletItem());
	public static final RegistryObject<Item> FIRE_REFLECTOR_BLOCKING = REGISTRY.register("fire_reflector_blocking", () -> new FireReflectorBlockingItem());
	public static final RegistryObject<Item> CYBERKATANA_ACTIVATED = REGISTRY.register("cyberkatana_activated", () -> new CyberkatanaActivatedItem());
	public static final RegistryObject<Item> CYBERKATANA_BOSS = REGISTRY.register("cyberkatana_boss", () -> new CyberkatanaBossItem());
	public static final RegistryObject<Item> MANA_CAKE = REGISTRY.register("mana_cake", () -> new ManaCakeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
