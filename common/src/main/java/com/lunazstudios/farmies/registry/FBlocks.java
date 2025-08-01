package com.lunazstudios.farmies.registry;

import com.lunazstudios.farmies.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class FBlocks {
    public static final Supplier<Block> FERTILIZED_FARMLAND = registerBlock("fertilized_farmland", () -> new FertilizedFarmlandBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND)), null);
    public static final Supplier<Block> FARMLAND_WITH_WORMS = registerBlock("farmland_with_worms", () -> new FarmlandWithWormsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND)), null);

    public static final Supplier<Block> TOMATOES = registerBlockOnly("tomatoes", () -> new TomatoCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final Supplier<Block> LETTUCES = registerBlockOnly("lettuces", () -> new LettuceCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final Supplier<Block> ONIONS = registerBlockOnly("onions", () -> new OnionCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final Supplier<Block> GARLICS = registerBlockOnly("garlics", () -> new GarlicCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final Supplier<Block> CORNS = registerBlockOnly("corns", () -> new CornCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final Supplier<Block> BELLPEPPERS = registerBlockOnly("bellpeppers", () -> new BellPepperCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block, String tab) {
        Supplier<T> supplier = FRegistry.registerBlock(name, block);
        FRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties()), tab);
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
