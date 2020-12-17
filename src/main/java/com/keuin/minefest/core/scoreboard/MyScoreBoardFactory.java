package com.keuin.minefest.core.scoreboard;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MyScoreBoardFactory<T extends Number> {

    private Map<UUID, T> scoreMap = Collections.emptyMap();
    private String title = "scoreboard";

    public MyScoreBoard<T> build() {
        return null;
    }

    public MyScoreBoardFactory<T> withInitialScore(Map<UUID, T> scoreMap) {
        this.scoreMap = new HashMap<>(scoreMap);
        return this;
    }

    public MyScoreBoardFactory<T> withTitle(String title) {
        this.title = title;
        return this;
    }

    // TODO: Other attributes (e.g. color, font, display location)

}
