package com.keuin.minefest.fabric.events.builder;

import com.keuin.minefest.fabric.events.event.Event;
import com.keuin.minefest.fabric.events.event.EventType;
import com.keuin.minefest.fabric.events.objects.BlockObject;
import com.keuin.minefest.fabric.events.objects.EventObject;
import com.keuin.minefest.fabric.events.objects.PlayerObject;
import com.keuin.minefest.util.CommonUtil;

import java.util.UUID;

/**
 * All events have to be constructed by EventBuilder
 */
public class EventBuilder {

    private EventType eventType;
    private UUID subjectUUID;
    private EventObject eventObject;

    public EventBuilder() {
    }

    public EventBuilder eventType(EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    public EventBuilder subject(UUID subject) {
        this.subjectUUID = subject;
        return this;
    }

    public EventBuilder blockObject(String blockId) {
        if (!CommonUtil.isValidMinecraftItemId(blockId))
            throw new IllegalArgumentException("Invalid block id.");
        this.eventObject = new BlockObject(blockId);
        return this;
    }

    public EventBuilder playerObject(UUID playerUUID) {
        this.eventObject = new PlayerObject(playerUUID);
        return this;
    }

    public Event build() {
        if (eventType == null)
            throw new RuntimeException("Event type is undefined.");
        if (subjectUUID == null)
            throw new RuntimeException("Event subject is undefined.");
        if (eventObject == null)
            throw new RuntimeException("Event object is undefined.");
        return new ConcreteEvent(eventType, subjectUUID, eventObject);
    }

}
