package com.keuin.minefest.core.scoreboard;

import net.minecraft.server.MinecraftServer;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/**
 * Displays nothing, but yet it is an authentic scoreboard.
 */
public class DummyScoreboard implements Scoreboard<Integer> {
    @Override
    public Integer getScore(UUID playerUUID) {
        return 0;
    }

    @Override
    public Integer setScore(UUID playerUUID, Integer score) {
        return 0;
    }

    @Override
    public Map<UUID, Integer> getScoreMap() {
        return Collections.emptyMap();
    }

    @Override
    public void setView(MinecraftServer minecraftServer) {
    }

    @Override
    public void setView() {
    }

    @Override
    public Integer increment(UUID playerUUID, int delta) {
        return 0;
    }

    @Override
    public Integer increment(UUID playerUUID, double delta) {
        return 0;
    }
}
