package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public
class InfectedMob extends Mob {
    private InfectionStage infectionStage;

    public InfectedMob(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
        this.infectionStage = InfectionStage.STAGE_1;
    }

    public void setInfectionStage(InfectionStage stage) {
        this.infectionStage = stage;
    }

    public InfectionStage getInfectionStage() {
        return infectionStage;
    }

    @Override
    public void tick() {
        super.tick();
        // Logic to update infection stage and abilities
    }
}
