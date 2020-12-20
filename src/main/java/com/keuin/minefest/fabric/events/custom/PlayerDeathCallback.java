package com.keuin.minefest.fabric.events.custom;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public interface PlayerDeathCallback {
    Event<PlayerDeathCallback> DEATH = EventFactory.createArrayBacked(PlayerDeathCallback.class,
            (listeners) -> (player, damageSource) -> {
                for (PlayerDeathCallback listener : listeners) {
                    listener.onDeath(player, damageSource);
                }
            });

    void onDeath(PlayerEntity player, DamageSource damageSource);
}
