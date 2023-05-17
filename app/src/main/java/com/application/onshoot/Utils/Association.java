package com.application.onshoot.Utils;

import com.application.onshoot.Enums.Position;
import com.application.onshoot.Models.Player;
import com.application.onshoot.Models.Team;

import java.util.ArrayList;

public class Association {
    public static ArrayList<Team> league = new ArrayList<Team>();
    public static Team homeTeam;
    public static Team awayTeam;

    public static void initTeams() {
        league.add(new Team("Atlanta", "Hawks", 0));
        league.add(new Team("Boston", "Celtics", 1));
        league.add(new Team("Brooklyn", "Nets", 2));
        league.add(new Team("Charlotte", "Hornets", 3));
        league.add(new Team("Chicago", "Bulls", 4));
        league.add(new Team("Cleveland", "Cavaliers", 5));
        league.add(new Team("Dallas", "Mavericks", 6));
        league.add(new Team("Denver", "Nuggets", 7));
        league.add(new Team("Detroit", "Pistons", 8));
        league.add(new Team("Golden State", "Warriors", 9));
        league.add(new Team("Houston", "Rockets", 10));
        league.add(new Team("Indiana", "Pacers", 11));
        league.add(new Team("Los Angeles", "Clippers", 12));
        league.add(new Team("Los Angeles", "Lakers", 13));
        league.add(new Team("Memphis", "Grizzlies", 14));
        league.add(new Team("Miami", "Heat", 15));
        league.add(new Team("Milwaukee", "Bucks", 16));
        league.add(new Team("Minnesota", "Timberwolves", 17));
        league.add(new Team("New Orleans", "Pelicans", 18));
        league.add(new Team("New York", "Knicks", 19));
        league.add(new Team("Oklahoma City", "Thunder", 20));
        league.add(new Team("Orlando", "Magic", 21));
        league.add(new Team("Philadelphia", "76ers", 22));
        league.add(new Team("Phoenix", "Suns", 23));
        league.add(new Team("Portland", "Trail Blazers", 24));
        league.add(new Team("Sacramento", "Kings", 25));
        league.add(new Team("San Antonio", "Spurs", 26));
        league.add(new Team("Toronto", "Raptors", 27));
        league.add(new Team("Utah", "Jazz", 28));
        league.add(new Team("Washington", "Wizards", 29));
    }

    public static void initRosters() {
        //Hawks
        ArrayList<Player> hawksRoster = new ArrayList<Player>();
        hawksRoster.add(new Player("Trae Young", Position.POINT_GUARD, 11,
                89,84, 80, 55, 55,
                31, 40, 81, 88));

        hawksRoster.add(new Player("Dejounte Murray", Position.SHOOTING_GUARD, 5,
                84,79, 90, 66, 86,
                53, 49, 85, 82));

        hawksRoster.add(new Player("De'Andre Hunter", Position.SMALL_FORWARD, 12,
                80,79, 94, 65, 83,
                63, 46, 72, 60));

        hawksRoster.add(new Player("John Collins", Position.POWER_FORWARD, 20,
                80,65, 91, 80, 49,
                74, 60, 69, 49));

        hawksRoster.add(new Player("Clint Capela", Position.CENTER, 15,
                83,25, 50, 73, 53,
                86, 92, 64, 35));
        league.get(0).setRoster(hawksRoster);




        //Celtics
        ArrayList<Player> celticsRoster = new ArrayList<Player>();
        celticsRoster.add(new Player("Marcus Smart", Position.POINT_GUARD, 36,
                82,78, 66, 51, 96,
                74, 41, 70, 74));

        celticsRoster.add(new Player("Jaylen Brown", Position.SHOOTING_GUARD, 7,
                90,83, 92, 78, 87,
                70, 55, 89, 77));

        celticsRoster.add(new Player("Jayson Tatum", Position.SMALL_FORWARD, 0,
                95,87, 90, 84, 89,
                81, 78, 90, 80));

        celticsRoster.add(new Player("Al Horford", Position.POWER_FORWARD, 42,
                80,87, 86, 71, 68,
                82, 58, 80, 59));

        celticsRoster.add(new Player("Robert Williams", Position.CENTER, 44,
                83,25, 69, 69, 40,
                88, 89, 73, 49));
        league.get(1).setRoster(celticsRoster);




        //Nets
        ArrayList<Player> netsRoster = new ArrayList<Player>();
        netsRoster.add(new Player("Spencer Dinwiddie", Position.POINT_GUARD, 26,
                83,82, 89, 64, 74,
                42, 40, 83, 87));

        netsRoster.add(new Player("Mikal Bridges", Position.SHOOTING_GUARD, 1,
                87,86, 88, 65, 89,
                69, 46, 89, 75));

        netsRoster.add(new Player("Cameron Johnson", Position.SMALL_FORWARD, 2,
                80,85, 80, 66, 69,
                65, 50, 68, 53));

        netsRoster.add(new Player("Dorian Finny-Smith", Position.POWER_FORWARD, 28,
                77,77, 71, 56, 81,
                72, 55, 75, 53));

        netsRoster.add(new Player("Nicolas Claxton", Position.CENTER, 33,
                84,67, 64, 72, 77,
                89, 77, 75, 44));
        league.get(2).setRoster(netsRoster);




        //Hornets
        ArrayList<Player> hornetsRoster = new ArrayList<Player>();
        hornetsRoster.add(new Player("Lamelo Ball", Position.POINT_GUARD, 1,
                86,81, 80, 69, 70,
                45, 53, 90, 90));

        hornetsRoster.add(new Player("Terry Rozier", Position.SHOOTING_GUARD, 3,
                81,77, 85, 67, 75,
                55, 43, 82, 83));

        hornetsRoster.add(new Player("Gordon Hayward", Position.SMALL_FORWARD, 20,
                79,76, 89, 65, 73,
                56, 46, 72, 75));

        hornetsRoster.add(new Player("PJ Washington", Position.POWER_FORWARD, 25,
                77,78, 65, 75, 52,
                62, 49, 74, 58));

        hornetsRoster.add(new Player("Mark Williams", Position.CENTER, 5,
                78,36, 53, 72, 44,
                79, 84, 67, 38));
        league.get(3).setRoster(hornetsRoster);




        //Bulls
        ArrayList<Player> bullsRoster = new ArrayList<Player>();
        bullsRoster.add(new Player("Lonzo Ball", Position.POINT_GUARD, 2,
                82,84, 65, 56, 86,
                60, 52, 89, 84));

        bullsRoster.add(new Player("Zach LaVine", Position.SHOOTING_GUARD, 8,
                87,82, 84, 75, 69,
                62, 45, 85, 80));

        bullsRoster.add(new Player("Demar DeRozen", Position.SMALL_FORWARD, 11,
                87,77, 95, 80, 73,
                50, 45, 79, 76));

        bullsRoster.add(new Player("Patrick Williams", Position.POWER_FORWARD, 44,
                77,85, 83, 56, 76,
                70, 50, 69, 57));

        bullsRoster.add(new Player("Nikola Vucevic", Position.CENTER, 9,
                84,78, 88, 79, 41,
                74, 73, 81, 58));
        league.get(4).setRoster(bullsRoster);




        //Cavaliers
        ArrayList<Player> cavsRoster = new ArrayList<Player>();
        cavsRoster.add(new Player("Darius Garland", Position.POINT_GUARD, 10,
                87,85, 78, 58, 69,
                31, 38, 86, 90));

        cavsRoster.add(new Player("Donovan Mitchell", Position.SHOOTING_GUARD, 45,
                92,88, 89, 71, 75,
                68, 46, 90, 85));

        cavsRoster.add(new Player("Isaac Okoro", Position.SMALL_FORWARD, 35,
                76,79, 60, 61, 85,
                68, 46, 80, 63));

        cavsRoster.add(new Player("Evan Mobley", Position.POWER_FORWARD, 4,
                86,66, 83, 81, 74,
                86, 81, 91, 65));

        cavsRoster.add(new Player("Jarrett Allen", Position.CENTER, 31,
                84,63, 72, 80, 41,
                84, 80, 68, 35));
        league.get(5).setRoster(cavsRoster);



        //Mavericks
        ArrayList<Player> mavsRoster = new ArrayList<Player>();
        mavsRoster.add(new Player("Luka Doncic", Position.POINT_GUARD, 77,
                97,87, 94, 86, 74,
                66, 78, 90, 95));

        mavsRoster.add(new Player("Kyrie Irving", Position.SHOOTING_GUARD, 2,
                91,84, 95, 63, 73,
                32, 48, 87, 88));

        mavsRoster.add(new Player("Josh Green", Position.SMALL_FORWARD, 8,
                76,83, 74, 56, 75,
                35, 47, 70, 64));

        mavsRoster.add(new Player("Christian Wood", Position.POWER_FORWARD, 35,
                82,80, 73, 83, 51,
                74, 70, 71, 43));

        mavsRoster.add(new Player("Dwight Powell", Position.CENTER, 7,
                77,78, 65, 77, 45,
                74, 70, 69, 51));
        league.get(6).setRoster(mavsRoster);




        //Nuggets
        ArrayList<Player> nuggetsRoster = new ArrayList<Player>();
        nuggetsRoster.add(new Player("Jamal Murray", Position.POINT_GUARD, 27,
                87,87, 88, 65, 74,
                35, 45, 82, 81));

        nuggetsRoster.add(new Player("Kentavious Caldwell-Pope", Position.SHOOTING_GUARD, 5,
                77,87, 84, 55, 84,
                45, 39, 80, 70));

        nuggetsRoster.add(new Player("Michael Porter Jr", Position.SMALL_FORWARD, 1,
                83,86, 92, 68, 64,
                60, 56, 70, 62));

        nuggetsRoster.add(new Player("Aaron Gordon", Position.POWER_FORWARD, 50,
                83,80, 66, 81, 76,
                74, 67, 78, 61));

        nuggetsRoster.add(new Player("Nikola Jokic", Position.CENTER, 15,
                97,84, 98, 90, 61,
                70, 81, 90, 86));
        league.get(7).setRoster(nuggetsRoster);




        //Pistons
        ArrayList<Player> pistonsRoster = new ArrayList<Player>();
        pistonsRoster.add(new Player("Cade Cunningham", Position.POINT_GUARD, 2,
                84,78, 89, 70, 75,
                59, 55, 85, 83));

        pistonsRoster.add(new Player("Jaden Ivey", Position.SHOOTING_GUARD, 23,
                81,77, 81, 63, 71,
                59, 47, 86, 84));

        pistonsRoster.add(new Player("Bojan Bogdanovic", Position.SMALL_FORWARD, 44,
                82,85, 87, 65, 78,
                54, 44, 79, 70));

        pistonsRoster.add(new Player("Isaiah Stewart", Position.POWER_FORWARD, 28,
                78,75, 76, 74, 54,
                70, 75, 64, 43));

        pistonsRoster.add(new Player("Jalen Duren", Position.CENTER, 0,
                80,35, 57, 70, 62,
                72, 89, 60, 52));
        league.get(8).setRoster(pistonsRoster);




        //Warriors
        ArrayList<Player> warriorsRoster = new ArrayList<Player>();
        warriorsRoster.add(new Player("Stephen Curry", Position.POINT_GUARD, 30,
                96,99, 92, 59, 75,
                30, 53, 93, 89));

        warriorsRoster.add(new Player("Klay Thompson", Position.SHOOTING_GUARD, 11,
                86,92, 86, 58, 87,
                70, 45, 86, 69));

        warriorsRoster.add(new Player("Andrew Wiggins", Position.SMALL_FORWARD, 22,
                82,84, 84, 72, 82,
                55, 53, 80, 70));

        warriorsRoster.add(new Player("Draymond Green", Position.POWER_FORWARD, 23,
                83,76, 70, 62, 86,
                93, 61, 89, 79));

        warriorsRoster.add(new Player("Kevon Looney", Position.CENTER, 5,
                78,69, 49, 64, 46,
                72, 90, 74, 56));
        league.get(9).setRoster(warriorsRoster);



        //Rockets
        ArrayList<Player> rocketsRoster = new ArrayList<Player>();
        rocketsRoster.add(new Player("Kevin Porter Jr", Position.POINT_GUARD, 3,
                81,80, 85, 64, 69,
                44, 53, 78, 80));

        //TODO: Pick up from here
        rocketsRoster.add(new Player("Alex Caruso", Position.SHOOTING_GUARD, 6,
                76,77, 85, 67, 75,
                55, 43, 82, 83));

        rocketsRoster.add(new Player("Gordon Hayward", Position.SMALL_FORWARD, 20,
                79,76, 89, 65, 73,
                56, 46, 72, 75));

        rocketsRoster.add(new Player("PJ Washington", Position.POWER_FORWARD, 25,
                77,78, 65, 75, 52,
                62, 49, 74, 58));

        rocketsRoster.add(new Player("Mark Williams", Position.CENTER, 5,
                78,36, 53, 72, 44,
                79, 84, 67, 38));
        league.get(10).setRoster(rocketsRoster);



    }

    public static void initRatings() {

    }

}
