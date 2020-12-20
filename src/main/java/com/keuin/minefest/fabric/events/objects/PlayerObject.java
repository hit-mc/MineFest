package com.keuin.minefest.fabric.events.objects;

import java.util.Objects;
import java.util.UUID;

/**
 * Immutable.
 */
public class PlayerObject implements EventObject {
    private final UUID playerUUID;

    public PlayerObject(UUID playerUUID) {
        if (playerUUID == null)
            throw new IllegalArgumentException("Player UUID cannot be null.");
        this.playerUUID = playerUUID;
    }


    @Override
    public String getUnifiedString() {
        return playerUUID.toString();
    }

    @Override
    public ObjectType getType() {
        return ObjectType.PLAYER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerObject that = (PlayerObject) o;
        return playerUUID.equals(that.playerUUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerUUID);
    }
}
