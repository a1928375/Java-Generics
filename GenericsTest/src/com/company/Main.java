package com.company;

public class Main {

    public static void main(String[] args) {

        BasketallTeam mavericks = new BasketallTeam("Mavericks", 2);
        BasketallTeam bulls = new BasketallTeam("Bulls", 3);
        BasketallTeam rocket = new BasketallTeam("Rocket", 1);

        BaseballTeam dodgers = new BaseballTeam("Dodgers", 2);
        BaseballTeam yankees = new BaseballTeam("Yankees", 1);

        League<BasketallTeam> nba = new League<>("NBA");
        nba.addTeam(mavericks);
        nba.addTeam(bulls);
        nba.addTeam(rocket);
        nba.addTeam(mavericks);
//        nba.addTeam(dodgers);

        nba.printTeam();

        League<BaseballTeam> mlb = new League<>("MLB");
        mlb.addTeam(dodgers);
        mlb.addTeam(yankees);
//        mlb.addTeam(mavericks);

        mlb.printTeam();
    }
}
