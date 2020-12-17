package com.keuin.minefest.fabric.events;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.ScoreboardPlayerScore;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.LiteralText;

public class ServerStartedEvent implements ServerLifecycleEvents.ServerStarted {

    public static final ServerStartedEvent INSTANCE = new ServerStartedEvent();

    private ServerStartedEvent() {
    }

    @Override
    public void onServerStarted(MinecraftServer minecraftServer) {

        final int SLOT_LIST = 0; // show in player list
        final int SLOT_SIDEBAR = 1;
        final int SLOT_BELOW_NAME = 2;

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int counter = 100;
                    ServerScoreboard scoreboard = minecraftServer.getScoreboard();
                    ScoreboardObjective objective = new ScoreboardObjective(
                            scoreboard,
                            "name",
                            ScoreboardCriterion.DUMMY,
                            new LiteralText("displayName"),
                            ScoreboardCriterion.RenderType.INTEGER
                    );
                    scoreboard.setObjectiveSlot(SLOT_SIDEBAR, objective);
                    while (true) {
                        scoreboard.addScoreboardObjective(objective);
                        ScoreboardPlayerScore score = new ScoreboardPlayerScore(scoreboard, objective, "trueKeuin");
                        score.setScore(counter++);
                        scoreboard.updateScore(score);
                        System.out.println("Score was updated.");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ignored) {
                    System.out.print("Quitting...");
                }
            }
        }).start();
    }
}
