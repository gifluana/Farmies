package com.lunazstudios.farmies.registry;

import com.lunazstudios.farmies.Farmies;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class FSoundEvents {

    public static Supplier<SoundEvent> register(String name) {
        return FRegistry.registerSoundEvent(name, () -> SoundEvent.createVariableRangeEvent(Farmies.id(name)));
    }

    public static void init() {}
}
