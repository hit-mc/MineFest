package com.keuin.minefest.fabric.events.builder;

import com.keuin.minefest.fabric.events.event.Event;
import com.keuin.minefest.fabric.events.event.EventType;
import com.keuin.minefest.fabric.events.objects.EventObject;

import java.util.UUID;

/**
 * Can only be known by EventBuilder
 */
public class ConcreteEvent implements Event {

    private final EventType eventType;
    private final UUID subjectUUID;
    private final EventObject eventObject;

    ConcreteEvent(EventType eventType, UUID subjectUUID, EventObject eventObject) {
        this.eventType = eventType;
        this.subjectUUID = subjectUUID;
        this.eventObject = eventObject;
    }

    @Override
    public EventType getType() {
        return eventType;
    }

    @Override
    public UUID getSubject() {
        return subjectUUID;
    }

    @Override
    public EventObject getObject() {
        return eventObject;
    }
}
