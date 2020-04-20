package com.company;

public abstract class Team {

    private String teamName;
    private int ranking;

    public Team(String teamName, int ranking) {
        this.teamName = teamName;
        this.ranking = ranking;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
