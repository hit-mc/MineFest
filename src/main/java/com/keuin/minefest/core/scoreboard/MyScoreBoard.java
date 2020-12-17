package com.keuin.minefest.core.scoreboard;

import net.minecraft.server.MinecraftServer;

import java.util.Map;
import java.util.UUID;


/**
 * A scoreboard contains player-score key pairs, in a hash data structure.
 * The score type should be fixed and uniformed in one scoreboard, but could
 * be different between scoreboards.
 *
 * @param <T> The type of score. It should be Integer or Double.
 */
public interface MyScoreBoard<T extends Number> {

    /**
     * Get one player's score.
     *
     * @param playerUUID the player's UUID.
     * @return the score.
     */
    T getScore(UUID playerUUID);

    /**
     * Set one player's score to a given value.
     *
     * @param playerUUID the player's UUID.
     * @param score      the previous score.
     */
    T setScore(UUID playerUUID, T score);

    /**
     * Get a map-view of all uuid-score pairs.
     *
     * @return the uuid-score map.
     */
    Map<UUID, T> getScoreMap();

    /**
     * Set minecraft server. The score will be displayed automatically.
     *
     * @param minecraftServer the server instance.
     */
    void setView(MinecraftServer minecraftServer);

    /**
     * Stop displaying scoreboard.
     */
    void setView();

    /**
     * Increment one player's score by a given delta. The default score is 0.
     *
     * @param playerUUID the player's UUID.
     * @param delta      the score delta.
     * @return updated score of this player.
     */
    T increment(UUID playerUUID, int delta);

    /**
     * Increment one player's score by a given delta. The default score is 0.
     *
     * @param playerUUID the player's UUID.
     * @param delta      the score delta.
     * @return updated score of this player.
     */
    T increment(UUID playerUUID, double delta);

    /**
     * Decrement one player's score by a given delta. The default score is 0.
     *
     * @param playerUUID the player's UUID.
     * @param delta      the score delta.
     * @return updated score of this player.
     */
    default T decrement(UUID playerUUID, int delta) {
        return increment(playerUUID, -delta);
    }

    /**
     * Decrement one player's score by a given delta. The default score is 0.
     *
     * @param playerUUID the player's UUID.
     * @param delta      the score delta.
     * @return updated score of this player.
     */
    default T decrement(UUID playerUUID, double delta) {
        return increment(playerUUID, -delta);
    }

}
