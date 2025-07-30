package com.lunazstudios.farmies.registry.neoforge;

import com.lunazstudios.farmies.Farmies;
import com.lunazstudios.farmies.registry.FBlocks;
import com.lunazstudios.farmies.registry.FItems;
import com.lunazstudios.farmies.registry.FRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class FTabsImpl {
    public static final Supplier<CreativeModeTab> F_TAB = FRegistryImpl.MOD_TABS.register(Farmies.MOD_ID, () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(FItems.TOMATO_SEEDS.get().asItem()))
            .title(Component.translatable("item_group." + Farmies.MOD_ID + ".tab"))
            .displayItems(((parameters, output) -> {
                output.acceptAll(FRegistry.getAllModItems());
            })).build());

    public static void register(IEventBus eventBus) {
        FRegistryImpl.MOD_TABS.register(eventBus);
    }
}
