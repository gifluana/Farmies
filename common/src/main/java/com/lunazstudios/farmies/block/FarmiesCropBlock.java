package com.lunazstudios.farmies.block;

import com.lunazstudios.farmies.registry.FBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FarmiesCropBlock extends CropBlock {
    public FarmiesCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockState.is(FBlockTags.FARMLAND);
    }
}
