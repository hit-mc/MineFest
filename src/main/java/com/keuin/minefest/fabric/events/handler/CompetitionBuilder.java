package com.keuin.minefest.fabric.events.handler;

import com.keuin.minefest.fabric.events.handler.goal.CompetitionGoal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CompetitionBuilder {

    private final Set<CompetitionGoal> goalSet = new HashSet<>();

    public CompetitionBuilder() {
    }

    public CompetitionBuilder addGoal(CompetitionGoal goal) {
        goalSet.add(goal);
        return this;
    }

    public CompetitionBuilder addGoals(Collection<CompetitionGoal> goalCollection) {
        goalSet.addAll(goalCollection);
        return this;
    }

    public Competition build() {
        return new MultipleGoalCompetition(goalSet);
    }

}
