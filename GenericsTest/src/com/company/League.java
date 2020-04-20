package com.company;

import java.util.ArrayList;

public class League<T extends Team> {

    private String leagueName;
    private ArrayList<T> arrayList = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getTeamName() {
        return leagueName;
    }

    public boolean addTeam(T team) {

        if (arrayList.contains(team)){

            System.out.println("The team is already in this league.");
            return false;
        } else {

            arrayList.add(team);

            System.out.println("Adding the team " + team.getTeamName() + " in " + this.leagueName + " succeeds.");
            return true;
        }

    }

    public void printTeam () {

        for (int i = 0 ; i < arrayList.size(); i++) {

            for (int j = 0; j < arrayList.size()-i-1; j++) {

                if (arrayList.get(j).getRanking() > arrayList.get(j+1).getRanking()) {

                    T res = arrayList.get(j);

                    arrayList.set(j, arrayList.get(j+1));

                    arrayList.set(j+1, res);

                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println("#" + (i+1) + " team in " + leagueName + ": " + arrayList.get(i).getTeamName());
        }
    }

}
