package com.lunazstudios.farmies.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import java.util.function.Supplier;

public class FItems {
    public static final Supplier<Item> TOMATO_SEEDS = FRegistry.registerItem("tomato_seeds", () -> new ItemNameBlockItem(FBlocks.TOMATOES.get(), new Item.Properties()), "tab");
    public static final Supplier<Item> TOMATO = FRegistry.registerItem("tomato", () -> new Item(new Item.Properties().food(FFoodProperties.TOMATO)), "tab");

    public static final Supplier<Item> LETTUCE_SEEDS = FRegistry.registerItem("lettuce_seeds", () -> new ItemNameBlockItem(FBlocks.LETTUCES.get(), new Item.Properties()), "tab");
    public static final Supplier<Item> LETTUCE = FRegistry.registerItem("lettuce", () -> new Item(new Item.Properties().food(FFoodProperties.LETTUCE)), "tab");

    public static void init() {}
}
