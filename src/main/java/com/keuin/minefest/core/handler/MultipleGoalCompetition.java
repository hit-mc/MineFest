package com.keuin.minefest.core.handler;

import com.keuin.minefest.core.event.Event;
import com.keuin.minefest.core.handler.goal.CompetitionGoal;
import com.keuin.minefest.core.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

public class MultipleGoalCompetition implements Competition {

    private final Set<CompetitionGoal> goalSet = new HashSet<>();

    MultipleGoalCompetition(Set<CompetitionGoal> goalSet) {
        this.goalSet.addAll(goalSet);
    }

    @Override
    public String getName() {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public String getDisplayName() {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public @Nullable ZonedDateTime getStartTime() {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public @Nullable ZonedDateTime getEndTime() {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public <T extends Number> void setScoreboard(@NotNull Scoreboard<T> scoreboard) {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public void setScoreboard() {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public void handleEvent(Event event) {
        throw new RuntimeException("Not implemented.");
    }
}
