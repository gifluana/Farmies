package com.lunazstudios.farmies.registry.fabric;

import com.lunazstudios.farmies.Farmies;
import com.lunazstudios.farmies.registry.FItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FTabsImpl {
    public static final CreativeModeTab SEEDS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Farmies.id("seeds"),
            FabricItemGroup.builder().title(Component.translatable("item_group." + Farmies.MOD_ID + ".seeds"))
                    .icon(() -> new ItemStack(FItems.TOMATO_SEEDS.get().asItem())).displayItems((parameters, output) -> {
                        output.accept(FItems.TOMATO_SEEDS.get());
                        output.accept(FItems.LETTUCE_SEEDS.get());
                        output.accept(FItems.ONION_SEEDS.get());
                        output.accept(FItems.GARLIC_SEEDS.get());
                        output.accept(FItems.CORN_SEEDS.get());
                        output.accept(FItems.BELLPEPPER_SEEDS.get());
                    }).build());

    public static final CreativeModeTab PRODUCES_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Farmies.id("produces"),
            FabricItemGroup.builder().title(Component.translatable("item_group." + Farmies.MOD_ID + ".produces"))
                    .icon(() -> new ItemStack(FItems.TOMATO.get().asItem())).displayItems((parameters, output) -> {
                        output.accept(FItems.TOMATO.get());
                        output.accept(FItems.LETTUCE.get());
                        output.accept(FItems.ONION.get());
                        output.accept(FItems.GARLIC.get());
                        output.accept(FItems.CORN.get());
                        output.accept(FItems.GREEN_BELLPEPPER.get());
                        output.accept(FItems.YELLOW_BELLPEPPER.get());
                        output.accept(FItems.RED_BELLPEPPER.get());
                    }).build());

    public static void register() {}
}
