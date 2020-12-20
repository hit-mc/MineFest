package com.keuin.minefest.fabric.events.objects;

import java.util.Objects;

/**
 * Immutable.
 */
public class BlockObject implements EventObject {

    private final String blockId;

    public BlockObject(String blockId) {
        if (blockId == null)
            throw new IllegalArgumentException("Block id cannot be null.");
        this.blockId = blockId;
    }

    @Override
    public String getUnifiedString() {
        return blockId;
    }

    @Override
    public ObjectType getType() {
        return ObjectType.BLOCK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockObject that = (BlockObject) o;
        return blockId.equals(that.blockId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockId);
    }
}
