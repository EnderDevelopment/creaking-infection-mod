package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class CreakingBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreakingInfectionMod.MOD_ID);

    public static final RegistryObject<Block> PALE_WOOD = BLOCKS.register("pale_wood", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0f)));

    public static void register() {
        BLOCKS.register();
    }
}
