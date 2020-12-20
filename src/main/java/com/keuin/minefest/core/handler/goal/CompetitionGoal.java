package com.keuin.minefest.core.handler.goal;

import com.keuin.minefest.core.event.EventType;
import com.keuin.minefest.core.objects.EventObject;
import com.keuin.minefest.core.objects.ObjectType;

public interface CompetitionGoal {
    /**
     * An example:
     * An event, such as a player has dig a diamond ore, contains an event object `diamond`.
     * The mining competition goal is to dig higher value mines as much as possible.
     * Thus, the goal will give each types of mines a fixed `value`, such as iron_ore=10, gold_ore=50, diamond_ore=100.
     *
     * @param eventType   the event type. If the event type is wrong, just skip it and return 0.
     * @param eventObject the event object. If the object type is wrong, just skip it and return 0.
     * @return the score.
     */
    int toScore(EventType eventType, EventObject eventObject);

    /**
     * Get the event type this goal is concerned with.
     * For example: a mining competition goal should be concerned with DIG events.
     *
     * @return the event type.
     */
    EventType getEventType();

    /**
     * Get the object type of this competition, such as mining (BLOCK), PVPing (PLAYER)
     *
     * @return the object type.
     */
    ObjectType getObjectType();
}
