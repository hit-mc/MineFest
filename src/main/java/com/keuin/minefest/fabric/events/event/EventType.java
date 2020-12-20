package com.keuin.minefest.fabric.events.event;

public enum EventType {
    DIG("Dig"), GATHER("Gather"), KILL("Kill"), MOVE("Move");

    private final String name;

    EventType(String name) {
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
