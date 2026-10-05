package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class CreakingSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreakingInfectionMod.MOD_ID);

    public static final RegistryObject<SoundEvent> INFECT_SOUND = SOUND_EVENTS.register("infect", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(CreakingInfectionMod.MOD_ID, "infect")));

    public static void register() {
        SOUND_EVENTS.register();
    }
}
