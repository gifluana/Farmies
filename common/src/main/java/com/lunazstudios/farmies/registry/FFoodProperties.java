package com.lunazstudios.farmies.registry;

import net.minecraft.world.food.FoodProperties;

public class FFoodProperties {
    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .build();

    public static final FoodProperties LETTUCE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();

    public static final FoodProperties ONION = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();
}
