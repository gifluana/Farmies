package com.lunazstudios.farmies.registry;

import com.lunazstudios.farmies.Farmies;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class FBlockTags {
    private static TagKey<Block> blockTag(String name) {
        return TagKey.create(Registries.BLOCK, Farmies.id(name));
    }

    public static void init() {}
}
