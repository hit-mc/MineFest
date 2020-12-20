package com.keuin.minefest.core.handler;

import com.keuin.minefest.core.dispatch.EventHandler;
import com.keuin.minefest.core.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.ZonedDateTime;

public interface Competition extends EventHandler {
    /**
     * Get the competition's programmatic name.
     *
     * @return the name.
     */
    String getName();

    /**
     * Get the competition's friendly name (display to players).
     *
     * @return the name.
     */
    String getDisplayName();

    @Nullable ZonedDateTime getStartTime();

    @Nullable ZonedDateTime getEndTime();

    /**
     * Set the scoreboard displaying scores of this competition.
     *
     * @param scoreboard the scoreboard.
     */
    <T extends Number> void setScoreboard(@NotNull Scoreboard<T> scoreboard);

    /**
     * Clear the scoreboard.
     * Note: the competition just won't be displayed, but it still runs.
     */
    void setScoreboard();

}
