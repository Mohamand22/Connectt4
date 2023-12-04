package com.example.connectt4;

public class Player {
    private String name;
    private int wins;
    private int losses;

    public Player(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void incrementWins() {
        wins++;
    }

    public void incrementLosses() {
        losses++;
    }
}
