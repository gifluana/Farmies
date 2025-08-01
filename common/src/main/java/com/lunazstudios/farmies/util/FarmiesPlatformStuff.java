package com.lunazstudios.farmies.util;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;

public class FarmiesPlatformStuff {
    @ExpectPlatform
    public static float getGrowthSpeed(BlockState state, ServerLevel level, BlockPos pos) {
        throw new AssertionError();
    }
}
