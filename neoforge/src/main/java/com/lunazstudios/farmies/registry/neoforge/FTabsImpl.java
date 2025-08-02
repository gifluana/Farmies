package com.lunazstudios.farmies.registry.neoforge;

import com.lunazstudios.farmies.Farmies;
import com.lunazstudios.farmies.registry.FItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class FTabsImpl {
    public static final Supplier<CreativeModeTab> SEEDS_TAB =
            FRegistryImpl.MOD_TABS.register("seeds", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(FItems.TOMATO_SEEDS.get()))
                    .title(Component.translatable("item_group." + Farmies.MOD_ID + ".seeds"))
                    .displayItems((parameters, output) -> {
                        output.accept(FItems.TOMATO_SEEDS.get());
                        output.accept(FItems.LETTUCE_SEEDS.get());
                        output.accept(FItems.ONION_SEEDS.get());
                        output.accept(FItems.GARLIC_SEEDS.get());
                        output.accept(FItems.CORN_SEEDS.get());
                        output.accept(FItems.BELLPEPPER_SEEDS.get());
                        output.accept(FItems.EGGPLANT_SEEDS.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> PRODUCES_TAB =
            FRegistryImpl.MOD_TABS.register("produces", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(FItems.TOMATO.get()))
                    .title(Component.translatable("item_group." + Farmies.MOD_ID + ".produces"))
                    .displayItems((parameters, output) -> {
                        output.accept(FItems.TOMATO.get());
                        output.accept(FItems.LETTUCE.get());
                        output.accept(FItems.ONION.get());
                        output.accept(FItems.GARLIC.get());
                        output.accept(FItems.CORN.get());
                        output.accept(FItems.GREEN_BELLPEPPER.get());
                        output.accept(FItems.YELLOW_BELLPEPPER.get());
                        output.accept(FItems.RED_BELLPEPPER.get());
                        output.accept(FItems.EGGPLANT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        FRegistryImpl.MOD_TABS.register(eventBus);
    }
}
