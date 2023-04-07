
package net.mcreator.enchantedmoon.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BlessingOfKuroshiMobEffect extends MobEffect {
	public BlessingOfKuroshiMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777012);
	}

	@Override
	public String getDescriptionId() {
		return "effect.enchantedmoon.blessing_of_kuroshi";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
