package com.lunazstudios.farmies.fabric.mixin;

import com.lunazstudios.farmies.block.FarmlandWithWormsBlock;
import com.lunazstudios.farmies.block.FertilizedFarmlandBlock;
import com.lunazstudios.farmies.registry.FBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CropBlock.class)
public class CropBlockMixin {

    @Inject(method = "mayPlaceOn(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", at = @At("HEAD"), cancellable = true)
    private void farmies$changeMayPlaceOn(BlockState state, BlockGetter level, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (state.is(Blocks.FARMLAND) || state.is(FBlocks.FERTILIZED_FARMLAND.get()) || state.is(FBlocks.FARMLAND_WITH_WORMS.get())) {
            cir.setReturnValue(true);
        }
    }

    @ModifyVariable(method = "getGrowthSpeed", at = @At(value = "LOAD", ordinal = 1), ordinal = 1)
    private static float farmies$modifyGrowthSpeedForNonFarmland(float original, Block block, BlockGetter level, BlockPos pos) {
        BlockState belowState = level.getBlockState(pos.below());

        if (belowState.getBlock() instanceof FarmlandWithWormsBlock) {
            if (belowState.hasProperty(FarmlandWithWormsBlock.MOISTURE) && belowState.getValue(FarmlandWithWormsBlock.MOISTURE) > 0)
                return 2.0F;
            return 1.0F;
        }

        if (belowState.getBlock() instanceof FertilizedFarmlandBlock) {
            if (belowState.hasProperty(FertilizedFarmlandBlock.MOISTURE) && belowState.getValue(FertilizedFarmlandBlock.MOISTURE) > 0)
                return 3.0F;
            return 1.0F;
        }

        return original;
    }
}