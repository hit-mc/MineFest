package com.keuin.minefest.fabric.events.eventiface;

import com.keuin.minefest.fabric.events.event.Event;

/**
 * An event handler is a class (such as a competition) handling events it interests.
 * Only events it is interested in will be dispatched to it.
 */
public interface EventHandler {
    /**
     * Handle an event.
     *
     * @param event the event.
     */
    void handleEvent(Event event);
}
