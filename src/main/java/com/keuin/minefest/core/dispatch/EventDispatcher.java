package com.keuin.minefest.core.dispatch;

import com.keuin.minefest.core.event.Event;

public class EventDispatcher {

    public static final EventDispatcher INSTANCE = new EventDispatcher();

    private EventDispatcher() {
    }

    public void registerEventHandler(EventHandler eventHandler) {
        throw new RuntimeException("Not implemented.");
    }

    public void unregisterEventHandler(EventHandler eventHandler) {
        throw new RuntimeException("Not implemented.");
    }

    /**
     * Called by the event driver which has hacked into the Minecraft codebase
     * (e.g. using Fabric Mixin or Spigot Events).
     *
     * @param event the event to be dispatched.
     */
    void dispatchEvent(Event event) {
        throw new RuntimeException("Not implemented.");
    }
}
