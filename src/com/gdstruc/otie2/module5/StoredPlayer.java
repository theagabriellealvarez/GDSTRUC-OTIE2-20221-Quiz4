package com.gdstruc.otie2.module5;

public class StoredPlayer {
    private String key;
    private Player value;

    public StoredPlayer(String key, Player value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Player getValue() {
        return value;
    }

    public void setValue(Player value) {
        this.value = value;
    }
}
