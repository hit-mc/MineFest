package com.keuin.minefest.core.handler;

public enum CompetitionState {
    PLANNED("Planned"), RUNNING("Running"),
    PAUSED("Paused"), STOPPED("Stopped"),
    ENDED("Ended");

    private final String name;

    CompetitionState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
