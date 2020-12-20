package com.keuin.minefest.core.handler.goal;

import com.keuin.minefest.core.event.EventType;
import com.keuin.minefest.core.objects.EventObject;
import com.keuin.minefest.core.objects.ObjectType;

import java.util.Objects;

public class KillGoal implements CompetitionGoal {


    private final int baseScore;
    private final int bonusMultiplier;

    public KillGoal(int fixedScore) {
        this.baseScore = fixedScore;
        this.bonusMultiplier = 0;
    }

    public KillGoal(int bonusMultiplier, int baseScore) {
        this.baseScore = baseScore;
        this.bonusMultiplier = bonusMultiplier;
    }

    @Override
    public int toScore(EventType eventType, EventObject eventObject) {
        if (eventType != EventType.KILL)
            return 0;
        // TODO: calculate the bonus score by eventObject (by the kill count of the killed player) and bonus multiplier.
        int bonusScore = 0;
        return baseScore + bonusScore;
    }

    @Override
    public EventType getEventType() {
        return EventType.KILL;
    }

    @Override
    public ObjectType getObjectType() {
        return ObjectType.PLAYER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KillGoal killGoal = (KillGoal) o;
        return baseScore == killGoal.baseScore &&
                bonusMultiplier == killGoal.bonusMultiplier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseScore, bonusMultiplier);
    }

    private enum ScoringType {
        FIXED_SCORE, MULTIPLIED_SCORE;
    }


}
