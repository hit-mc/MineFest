package com.keuin.minefest.core;

import java.util.UUID;

/**
 * Since the player's id might be changed after the scoreboard was created,
 * player ids should be get dynamically via a name provider.
 */
public interface PlayerIdProvider {
    /**
     * Get one player's id by his UUID.
     *
     * @param playerUUID the player's UUID.
     * @return the player's id.
     */
    String getPlayerId(UUID playerUUID);
}
