package com.lunazstudios.farmies;

import com.lunazstudios.farmies.registry.*;
import net.minecraft.resources.ResourceLocation;

public final class Farmies {
    public static final String MOD_ID = "farmies";

    public static void init() {
        FBlocks.init();
        FItems.init();
        FBlockTags.init();
        FEntityTypes.init();
        FEntityTypeTags.init();
//        FBlockEntityTypes.init();
//        FRecipes.register();
//        FMenus.register();
//        FNetwork.registerPackets();
        FSoundEvents.init();
    }

    public static ResourceLocation id(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }
}
