
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.entity.TrainingDummyEntity;
import net.mcreator.enchantedmoon.entity.KuroshiEntity;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnchantedmoonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EnchantedmoonMod.MODID);
	public static final RegistryObject<EntityType<TrainingDummyEntity>> TRAINING_DUMMY = register("training_dummy",
			EntityType.Builder.<TrainingDummyEntity>of(TrainingDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrainingDummyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KuroshiEntity>> KUROSHI = register("kuroshi",
			EntityType.Builder.<KuroshiEntity>of(KuroshiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KuroshiEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TrainingDummyEntity.init();
			KuroshiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TRAINING_DUMMY.get(), TrainingDummyEntity.createAttributes().build());
		event.put(KUROSHI.get(), KuroshiEntity.createAttributes().build());
	}
}
