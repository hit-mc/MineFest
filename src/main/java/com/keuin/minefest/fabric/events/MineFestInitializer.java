package com.keuin.minefest.fabric.events;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class MineFestInitializer implements DedicatedServerModInitializer {
	@Override
	public void onInitializeServer() {
		ServerLifecycleEvents.SERVER_STARTED.register(ServerStartedEvent.INSTANCE);
	}
}
