package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TrainingDummyProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("waiting") >= 100) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(48 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					entity.setCustomName(Component.literal(("Total DMG:" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)))));
				}
			}
			entity.getPersistentData().putDouble("waiting", 0);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
			entity.getPersistentData().putDouble("waiting", (entity.getPersistentData().getDouble("waiting") + 1));
		}
	}
}
