package com.keuin.minefest.fabric;

import com.keuin.minefest.fabric.events.custom.PlayerDeathCallback;
import com.keuin.minefest.fabric.events.handler.PlayerDeathHandler;
import com.keuin.minefest.fabric.events.handler.PlayerDigEventHandler;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class MineFestInitializer implements DedicatedServerModInitializer {
	@Override
	public void onInitializeServer() {

		System.out.println("Register events...");
		registerEvents();


		//TODO: Register commands
//		CommandRegistrationCallback.EVENT.register(new CommandRegistrationCallback() {
//			@Override
//			public void register(CommandDispatcher<ServerCommandSource> commandDispatcher, boolean dedicated) {
//				throw new RuntimeException("Not implemented.");
////				commandDispatcher.register()
//			}
//		});


	}

	private void registerEvents() {
		ServerLifecycleEvents.SERVER_STARTED.register(ServerStartedEvent.INSTANCE);

		PlayerDeathCallback.DEATH.register(PlayerDeathHandler.INSTANCE);
		PlayerBlockBreakEvents.AFTER.register(PlayerDigEventHandler.INSTANCE);

	}
}
