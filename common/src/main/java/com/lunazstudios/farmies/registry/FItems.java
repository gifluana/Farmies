package com.lunazstudios.farmies.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import java.util.function.Supplier;

public class FItems {
    public static final Supplier<Item> TOMATO_SEEDS = FRegistry.registerItem("tomato_seeds", () -> new ItemNameBlockItem(FBlocks.TOMATOES.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> TOMATO = FRegistry.registerItem("tomato", () -> new Item(new Item.Properties().food(FFoodProperties.TOMATO)), "produces");

    public static final Supplier<Item> LETTUCE_SEEDS = FRegistry.registerItem("lettuce_seeds", () -> new ItemNameBlockItem(FBlocks.LETTUCES.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> LETTUCE = FRegistry.registerItem("lettuce", () -> new Item(new Item.Properties().food(FFoodProperties.LETTUCE)), "produces");

    public static final Supplier<Item> ONION_SEEDS = FRegistry.registerItem("onion_seeds", () -> new ItemNameBlockItem(FBlocks.ONIONS.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> ONION = FRegistry.registerItem("onion", () -> new Item(new Item.Properties().food(FFoodProperties.ONION)), "produces");

    public static void init() {}
}
