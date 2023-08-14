package Entities;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players = new ArrayList<>();

    public Team() {
    }

    public Team(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
