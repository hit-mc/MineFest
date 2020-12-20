package com.keuin.minefest.core.scoreboard;

import com.keuin.minefest.core.PlayerIdProvider;
import net.minecraft.server.MinecraftServer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public abstract class IntegerScoreboard implements Scoreboard<Integer> {

    private final Map<UUID, Integer> scoreMap;
    private final String title;
    private final Integer defaultScore;
    private final PlayerIdProvider playerIdProvider;
    private MinecraftServer minecraftServer = null;

    IntegerScoreboard(Map<UUID, Integer> initialScoreMap, String title, int defaultScore, PlayerIdProvider playerIdProvider) {
        scoreMap = new HashMap<>(initialScoreMap);
        this.title = title;
        this.defaultScore = defaultScore;
        this.playerIdProvider = playerIdProvider;
    }

    private void updateDisplay() {

    }

    /**
     * Get the scoreboard's title.
     *
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get all uuid-score pairs in a map.
     *
     * @return the score map.
     */
    @Override
    public Map<UUID, Integer> getScoreMap() {
        return new HashMap<>(scoreMap);
    }

    @Override
    public Integer getScore(UUID playerUUID) {
        return scoreMap.getOrDefault(playerUUID, defaultScore);
    }

    @Override
    public Integer setScore(UUID playerUUID, Integer score) {
        return Optional.ofNullable(scoreMap.put(playerUUID, score)).orElse(defaultScore);
    }

    @Override
    public Integer increment(UUID playerUUID, int delta) {
        Integer oldScore = getScore(playerUUID);
        Integer newScore = oldScore + delta;
        return scoreMap.put(playerUUID, newScore);
    }

    @Override
    public Integer increment(UUID playerUUID, double delta) {
        Integer oldScore = getScore(playerUUID);
        double newScore = oldScore + delta;
        return scoreMap.put(playerUUID, (int) newScore);
    }
}
