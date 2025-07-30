package com.lunazstudios.farmies.registry.fabric;

import com.lunazstudios.farmies.Farmies;
import com.lunazstudios.farmies.registry.FItems;
import com.lunazstudios.farmies.registry.FRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FTabsImpl {
    public static final CreativeModeTab F_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Farmies.id("tab"),
            FabricItemGroup.builder().title(Component.translatable("item_group." + Farmies.MOD_ID + ".tab"))
                    .icon(() -> new ItemStack(FItems.TOMATO_SEEDS.get().asItem())).displayItems((parameters, output) -> {
                        output.acceptAll(FRegistry.getAllModItems());
                    }).build());

    public static void register() {}
}
