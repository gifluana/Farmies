package com.lunazstudios.farmies.neoforge;

import com.lunazstudios.farmies.Farmies;
import com.lunazstudios.farmies.client.FarmiesClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Farmies.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class FarmiesNeoForgeClient {
    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        FarmiesClient.init();

    }
}
