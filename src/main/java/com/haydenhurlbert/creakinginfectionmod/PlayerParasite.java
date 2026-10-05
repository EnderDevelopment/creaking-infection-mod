package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public
class PlayerParasite {
    private final Player player;
    private int infectionStage;

    public PlayerParasite(Player player) {
        this.player = player;
        this.infectionStage = 0;
    }

    public void infectMob() {
        // Logic to infect a mob
    }

    public void increaseInfectionStage() {
        infectionStage++;
        // Logic to update player abilities based on infection stage
    }

    public int getInfectionStage() {
        return infectionStage;
    }
}
