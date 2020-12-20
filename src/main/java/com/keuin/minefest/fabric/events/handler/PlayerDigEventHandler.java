package com.keuin.minefest.fabric.events.handler;

import com.keuin.minefest.core.dispatch.AbstractEventDriver;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PlayerDigEventHandler extends AbstractEventDriver implements PlayerBlockBreakEvents.After {

    public static final PlayerDigEventHandler INSTANCE = new PlayerDigEventHandler();

    private PlayerDigEventHandler() {
    }

    @Override
    public void afterBlockBreak(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, BlockEntity blockEntity) {
        //TODO: delegate fabric event
        // blockEntity is always null, use blockPos instead!
//        System.out.printf("Player %s dig %s (block: %s) at %s.\n", playerEntity, blockState, blockState.getBlock(), blockPos);
    }
}
