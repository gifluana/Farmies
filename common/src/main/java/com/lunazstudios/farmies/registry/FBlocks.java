package com.lunazstudios.farmies.registry;

import com.lunazstudios.farmies.block.LettuceCropBlock;
import com.lunazstudios.farmies.block.TomatoCropBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class FBlocks {

    public static final Supplier<Block> TOMATOES = registerBlockOnly("tomatoes", () -> new TomatoCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final Supplier<Block> LETTUCES = registerBlockOnly("lettuces", () -> new LettuceCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = FRegistry.registerBlock(name, block);
        FRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()), "tab");
        return supplier;
    }

    private static <T extends Block> Supplier<T> registerBlockHidden(String name, Supplier<T> block) {
        Supplier<T> supplier = FRegistry.registerBlock(name, block);
        FRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()), null);
        return supplier;
    }

    private static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return FRegistry.registerBlock(name, block);
    }

    public static void init() {}
}
