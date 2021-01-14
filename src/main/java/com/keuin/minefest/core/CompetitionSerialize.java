package com.keuin.minefest.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.keuin.minefest.core.handler.Competition;

public class CompetitionSerialize {
    public static Competition fromJsonString(String jsonString) {
        return JSONObject.parseObject(jsonString, Competition.class);
    }

    public static String toJsonString(Competition competition) {
        return JSON.toJSONString(competition);
    }
}
