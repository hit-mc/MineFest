package com.keuin.minefest.fabric;

import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.command.ServerCommandSource;

public class MineFestInitializer implements DedicatedServerModInitializer {
	@Override
	public void onInitializeServer() {
		ServerLifecycleEvents.SERVER_STARTED.register(ServerStartedEvent.INSTANCE);
		CommandRegistrationCallback.EVENT.register(new CommandRegistrationCallback() {
			@Override
			public void register(CommandDispatcher<ServerCommandSource> commandDispatcher, boolean dedicated) {
				throw new RuntimeException("Not implemented.");
//				commandDispatcher.register()
			}
		});
	}
}
