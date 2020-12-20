package com.keuin.minefest.fabric.events.handler;

import com.keuin.minefest.fabric.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.ZonedDateTime;

public interface Competition {
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
    void setScoreboard(@NotNull Scoreboard scoreboard);

    /**
     * Clear the scoreboard.
     * Note: the competition just won't be displayed, but it still runs.
     */
    void setScoreboard();

}
