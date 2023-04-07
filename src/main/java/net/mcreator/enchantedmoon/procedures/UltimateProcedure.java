package net.mcreator.enchantedmoon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.enchantedmoon.init.EnchantedmoonModParticleTypes;
import net.mcreator.enchantedmoon.init.EnchantedmoonModMobEffects;
import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UltimateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnchantedmoonModMobEffects.COOLDOWN.get()) : false)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.DRAGON_SLAYER.get()) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity || entity instanceof ItemEntity) && entity instanceof LivingEntity) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 2, (false), (false)));
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 30, 2, (false), (false)));
							EnchantedmoonMod.queueServerWork(20, () -> {
								entityiterator.hurt(DamageSource.GENERIC, 18);
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(EnchantedmoonModMobEffects.COOLDOWN.get(), 100, 1, (false), (false)));
								world.addParticle(ParticleTypes.SWEEP_ATTACK, (entity.getX()), (entity.getY() + 1.65), (entity.getZ()), 0, 0, 0);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							});
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.CYBERKATANA_ACTIVATED.get()) {
				entity.getPersistentData().putDouble("TotalTarget", 0);
				entity.getPersistentData().putDouble("CurrentTarget", 0);
				entity.getPersistentData().putDouble("Timer", 0);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(EnchantedmoonModMobEffects.COOLDOWN.get(), 200, 1, (false), (false)));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity || entity instanceof ItemEntity) && entity instanceof LivingEntity) {
							entity.getPersistentData().putDouble("TotalTarget", (entity.getPersistentData().getDouble("TotalTarget") + 1));
							entityiterator.getPersistentData().putDouble("TargetQueue", (entity.getPersistentData().getDouble("TotalTarget")));
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CRIT, x, (y + 1), z, 50, 0, 0, 0, 1.5);
				for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("TotalTarget")); index0++) {
					entity.getPersistentData().putDouble("Timer", (entity.getPersistentData().getDouble("Timer") + 2));
					EnchantedmoonMod.queueServerWork((int) entity.getPersistentData().getDouble("Timer"), () -> {
						entity.getPersistentData().putDouble("CurrentTarget", (entity.getPersistentData().getDouble("CurrentTarget") + 1));
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entity.getPersistentData().getDouble("CurrentTarget") == entityiterator.getPersistentData().getDouble("TargetQueue")) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 0));
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 3, (false), (false)));
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									entityiterator.hurt(DamageSource.GENERIC, 12);
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									world.addParticle((SimpleParticleType) (EnchantedmoonModParticleTypes.CYBER_SWEEP.get()), (entity.getX()), (entity.getY() + 1.65), (entity.getZ()), 0, 0, 0);
								}
							}
						}
					});
				}
			}
		}
	}
}
