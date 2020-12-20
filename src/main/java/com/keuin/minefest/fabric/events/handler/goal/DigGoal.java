package com.keuin.minefest.fabric.events.handler.goal;

import com.keuin.minefest.fabric.events.event.EventType;
import com.keuin.minefest.fabric.events.objects.BlockObject;
import com.keuin.minefest.fabric.events.objects.EventObject;
import com.keuin.minefest.fabric.events.objects.ObjectType;

import java.util.Objects;

public class DigGoal implements CompetitionGoal {

    private final BlockObject blockObject; // null if wildcard
    private final int score;

    /**
     * Create a specific dig goal, i.e. only specific type of block counts.
     *
     * @param block the block type.
     * @param score score.
     */
    DigGoal(BlockObject block, int score) {
        if (block == null)
            throw new IllegalArgumentException("Block cannot be null.");
        this.blockObject = block;
        this.score = score;
    }

    /**
     * Create a wildcard goal, which accepts any kind of blocks.
     *
     * @param score the score.
     */
    DigGoal(int score) {
        this.blockObject = null;
        this.score = score;
    }

    @Override
    public int toScore(EventType eventType, EventObject eventObject) {
        if (eventType != EventType.DIG)
            return 0;
        if (!Objects.equals(eventObject, blockObject) && this.blockObject != null)
            return 0;
        return score; // either wildcard, or the type matches
    }

    @Override
    public EventType getEventType() {
        return null;
    }

    @Override
    public ObjectType getObjectType() {
        return ObjectType.BLOCK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigGoal digGoal = (DigGoal) o;
        return score == digGoal.score &&
                Objects.equals(blockObject, digGoal.blockObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockObject, score);
    }
}
