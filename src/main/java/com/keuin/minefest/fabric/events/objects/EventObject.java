package com.keuin.minefest.fabric.events.objects;

/**
 * Immutable.
 */
public interface EventObject {
    /**
     * Get the unified string representation of the object.
     *
     * @return the string, i.e. a uuid for a player, a standard name (such as `minecraft:stone`) for a block.
     */
    String getUnifiedString();

    /**
     * Get the type of this object.
     *
     * @return the type.
     */
    ObjectType getType();
}
