package com.keuin.minefest.fabric.events.handler;

import com.keuin.minefest.fabric.events.handler.goal.CompetitionGoal;

import java.util.HashSet;
import java.util.Set;

public class MultipleGoalCompetition implements Competition {

    private final Set<CompetitionGoal> goalSet = new HashSet<>();

    MultipleGoalCompetition(Set<CompetitionGoal> goalSet) {
        this.goalSet.addAll(goalSet);
    }

}
