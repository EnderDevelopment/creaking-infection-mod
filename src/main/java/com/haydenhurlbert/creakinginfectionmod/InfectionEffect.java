package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public
class InfectionEffect extends MobEffect {
    public InfectionEffect() {
        super(MobEffectCategory.HARMFUL, 0x00FF00);
    }

    @Override
    public String getDescriptionId() {
        return "effect.creakinginfectionmod.infection";
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
