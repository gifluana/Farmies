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

    public static final Supplier<Item> GARLIC_SEEDS = FRegistry.registerItem("garlic_seeds", () -> new ItemNameBlockItem(FBlocks.GARLICS.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> GARLIC = FRegistry.registerItem("garlic", () -> new Item(new Item.Properties().food(FFoodProperties.GARLIC)), "produces");

    public static final Supplier<Item> CORN_SEEDS = FRegistry.registerItem("corn_seeds", () -> new ItemNameBlockItem(FBlocks.CORNS.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> CORN = FRegistry.registerItem("corn", () -> new Item(new Item.Properties().food(FFoodProperties.CORN)), "produces");

    public static final Supplier<Item> BELLPEPPER_SEEDS = FRegistry.registerItem("bellpepper_seeds", () -> new ItemNameBlockItem(FBlocks.BELLPEPPERS.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> RED_BELLPEPPER = FRegistry.registerItem("red_bellpepper", () -> new Item(new Item.Properties().food(FFoodProperties.BELLPEPPER)), "produces");
    public static final Supplier<Item> YELLOW_BELLPEPPER = FRegistry.registerItem("yellow_bellpepper", () -> new Item(new Item.Properties().food(FFoodProperties.BELLPEPPER)), "produces");
    public static final Supplier<Item> GREEN_BELLPEPPER = FRegistry.registerItem("green_bellpepper", () -> new Item(new Item.Properties().food(FFoodProperties.BELLPEPPER)), "produces");

    public static final Supplier<Item> EGGPLANT_SEEDS = FRegistry.registerItem("eggplant_seeds", () -> new ItemNameBlockItem(FBlocks.EGGPLANTS.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> EGGPLANT = FRegistry.registerItem("eggplant", () -> new Item(new Item.Properties().food(FFoodProperties.EGGPLANT)), "produces");

    public static final Supplier<Item> STRAWBERRY_SEEDS = FRegistry.registerItem("strawberry_seeds", () -> new ItemNameBlockItem(FBlocks.STRAWBERRIES.get(), new Item.Properties()), "seeds");
    public static final Supplier<Item> STRAWBERRY = FRegistry.registerItem("strawberry", () -> new Item(new Item.Properties().food(FFoodProperties.STRAWBERRY)), "produces");

    public static void init() {}
}
