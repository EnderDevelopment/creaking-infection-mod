package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

public
class CreakingBiome {
    public static Biome createCreakingBiome() {
        BiomeSpecialEffects.Builder effects = new BiomeSpecialEffects.Builder()
        .skyColor(0x000000)
        .fogColor(0x000000)
        .waterColor(0x000000)
        .waterFogColor(0x000000);

        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();

        return new Biome.BiomeBuilder()
        .hasPrecipitation(false)
        .temperature(0.5f)
        .downfall(0.5f)
        .specialEffects(effects.build())
        .mobSpawnSettings(spawnSettings.build())
        .generationSettings(generationSettings.build())
        .build();
    }
}
