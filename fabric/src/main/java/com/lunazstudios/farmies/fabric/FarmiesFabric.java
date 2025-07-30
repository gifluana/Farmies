package com.lunazstudios.farmies.fabric;

import com.lunazstudios.farmies.registry.fabric.FTabsImpl;
import net.fabricmc.api.ModInitializer;

import com.lunazstudios.farmies.Farmies;

public final class FarmiesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Farmies.init();
        FTabsImpl.register();
    }
}
