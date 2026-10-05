package com.haydenhurlbert.creakinginfectionmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class CreakingItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreakingInfectionMod.MOD_ID);

    public static final RegistryObject<Item> PALE_WOOD_ITEM = ITEMS.register("pale_wood", () -> new Item(new Item.Properties()));

    public static void register() {
        ITEMS.register();
    }
}
