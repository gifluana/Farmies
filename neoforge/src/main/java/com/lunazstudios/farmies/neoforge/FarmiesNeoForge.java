package com.lunazstudios.farmies.neoforge;

import com.lunazstudios.farmies.registry.neoforge.FRegistryImpl;
import com.lunazstudios.farmies.registry.neoforge.FTabsImpl;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import com.lunazstudios.farmies.Farmies;

@Mod(Farmies.MOD_ID)
public final class FarmiesNeoForge {
    public FarmiesNeoForge(IEventBus bus) {
        Farmies.init();
        FRegistryImpl.BLOCKS.register(bus);
        FRegistryImpl.ITEMS.register(bus);
        FRegistryImpl.ENTITY_TYPES.register(bus);
        FRegistryImpl.BLOCK_ENTITY_TYPES.register(bus);
        FRegistryImpl.MENUS.register(bus);
        FRegistryImpl.RECIPE_TYPES.register(bus);
        FRegistryImpl.RECIPE_SERIALIZERS.register(bus);
        FRegistryImpl.SOUND_EVENTS.register(bus);
        FTabsImpl.register(bus);
    }
}
