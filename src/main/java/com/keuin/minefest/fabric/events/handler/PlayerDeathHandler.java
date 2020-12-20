package com.keuin.minefest.fabric.events.handler;

import com.keuin.minefest.fabric.events.custom.PlayerDeathCallback;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerDeathHandler implements PlayerDeathCallback {

    public static final PlayerDeathHandler INSTANCE = new PlayerDeathHandler();

    private PlayerDeathHandler() {
    }

    @Override
    public void onDeath(PlayerEntity player, DamageSource damageSource) {
        //TODO: delegate fabric event
//        System.out.printf("Aha, player %s died!\n", player.getName().getString());
    }
}
