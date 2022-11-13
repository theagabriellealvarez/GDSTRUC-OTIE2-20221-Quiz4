package com.gdstruc.otie2.module5;

import java.util.Objects;

public class Player {
    private int id;
    private String userName;
    private int level;

    public Player(int id, String name, int level) {
        this.id = id;
        this.userName = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && userName.equals(player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, level);
    }
}
