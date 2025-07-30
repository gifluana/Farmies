package com.lunazstudios.farmies.fabric.client;

import com.lunazstudios.farmies.client.FarmiesClient;
import com.lunazstudios.farmies.registry.FBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public final class FarmiesFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FarmiesClient.init();
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                FBlocks.TOMATOES.get(), FBlocks.LETTUCES.get()
        );
    }
}
