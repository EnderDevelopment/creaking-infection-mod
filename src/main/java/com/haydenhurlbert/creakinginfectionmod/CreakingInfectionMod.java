package com.haydenhurlbert.creakinginfectionmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class CreakingInfectionMod implements ModInitializer {
    public static final String MOD_ID = "creakinginfectionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block PALE_WOOD = new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0f));
    public static final Item PALE_WOOD_ITEM = new BlockItem(PALE_WOOD, new Item.Properties());

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Creaking Infection Mod");

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "pale_wood"), PALE_WOOD);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "pale_wood"), PALE_WOOD_ITEM);
    }
}
