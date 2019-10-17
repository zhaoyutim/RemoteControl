package com.tim.remotecontrol.Enum;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Direction {
    @JsonProperty("up") UP("up"), @JsonProperty("down") DOWN("down"), @JsonProperty("left") LEFT("left"), @JsonProperty("right") RIGHT("right");

    private String direction;

    private Direction(String direction) {
        this.direction = direction;
    }
}
