package com.application.onshoot.Utils;

import com.application.onshoot.Enums.Position;
import com.application.onshoot.Models.Coach;
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

        rocketsRoster.add(new Player("Jalen Green", Position.SHOOTING_GUARD, 4,
                84,82, 86, 72, 73,
                45, 43, 77, 78));

        rocketsRoster.add(new Player("Kenyon Martin Jr", Position.SMALL_FORWARD, 6,
                79,74, 68, 67, 67,
                54, 61, 79, 62));

        rocketsRoster.add(new Player("Jabari Smith", Position.POWER_FORWARD, 1,
                79,77, 78, 71, 69,
                70, 64, 74, 61));

        rocketsRoster.add(new Player("Alperen Sengun", Position.CENTER, 28,
                83,73, 69, 82, 63,
                69, 83, 73, 66));
        league.get(10).setRoster(rocketsRoster);




        //Pacers
        ArrayList<Player> pacersRoster = new ArrayList<Player>();
        pacersRoster.add(new Player("Tyrese Haliburton", Position.POINT_GUARD, 0,
                89,85, 93, 64, 74,
                60, 43, 91, 93));

        pacersRoster.add(new Player("Bennedict Mathurin", Position.SHOOTING_GUARD, 00,
                79,75, 80, 68, 69,
                42, 50, 78, 70));

        pacersRoster.add(new Player("Buddy Hield", Position.SMALL_FORWARD, 24,
                80,89, 81, 55, 69,
                48, 57, 65, 68));

        pacersRoster.add(new Player("Aaron Nesmith", Position.POWER_FORWARD, 23,
                76,79, 70, 60, 67,
                55, 51, 76, 60));

        pacersRoster.add(new Player("Myles Turner", Position.CENTER, 33,
                85,81, 81, 77, 70,
                87, 67, 80, 40));
        league.get(11).setRoster(pacersRoster);




        //Clippers
        ArrayList<Player> clippersRoster = new ArrayList<Player>();
        clippersRoster.add(new Player("Russell Westbrook", Position.POINT_GUARD, 0,
                81,73, 72, 80, 74,
                42, 58, 89, 86));

        clippersRoster.add(new Player("Paul George", Position.SHOOTING_GUARD, 13,
                89,81, 82, 69, 92,
                79, 53, 83, 78));

        clippersRoster.add(new Player("Kawhi Leonard", Position.SMALL_FORWARD, 2,
                92,85, 93, 79, 96,
                79, 56, 88, 79));

        clippersRoster.add(new Player("Marcus Morris", Position.POWER_FORWARD, 8,
                75,81, 79, 68, 68,
                64, 51, 47, 50));

        clippersRoster.add(new Player("Ivica Zubac", Position.CENTER, 40,
                81,26, 74, 76, 34,
                77, 86, 65, 42));
        league.get(12).setRoster(clippersRoster);




        //Lake Show
        ArrayList<Player> lakersRoster = new ArrayList<Player>();
        lakersRoster.add(new Player("D'Angelo Russell", Position.POINT_GUARD, 1,
                83,83, 95, 60, 69,
                40, 40, 79, 84));

        lakersRoster.add(new Player("Austin Reaves", Position.SHOOTING_GUARD, 15,
                81,83, 95, 57, 73,
                35, 41, 82, 70));

        lakersRoster.add(new Player("Lebron James", Position.SMALL_FORWARD, 6,
                97,73, 85, 91, 85,
                82, 76, 99, 88));

        lakersRoster.add(new Player("Jared Vanderbilt", Position.POWER_FORWARD, 2,
                80,72, 69, 60, 80,
                80, 78, 74, 57));

        lakersRoster.add(new Player("Anthony Davis", Position.CENTER, 3,
                94,70, 79, 88, 80,
                94, 85, 83, 64));
        league.get(13).setRoster(lakersRoster);




        //Grizzlies
        ArrayList<Player> grizzliesRoster = new ArrayList<Player>();
        grizzliesRoster.add(new Player("Ja Morant", Position.POINT_GUARD, 12,
                92,77, 84, 90, 72,
                49, 54, 88, 95));

        grizzliesRoster.add(new Player("Desmond Bane", Position.SHOOTING_GUARD, 22,
                85,88, 95, 67, 74,
                52, 50, 81, 77));

        grizzliesRoster.add(new Player("Dillon Brooks", Position.SMALL_FORWARD, 24,
                79,75, 68, 66, 87,
                67, 42, 72, 61));

        grizzliesRoster.add(new Player("Jaren Jackson Jr", Position.POWER_FORWARD, 13,
                87,79, 89, 80, 71,
                95, 63, 76, 43));

        grizzliesRoster.add(new Player("Steven Adams", Position.CENTER, 4,
                82,26, 65, 70, 55,
                82, 90, 75, 49));
        league.get(14).setRoster(grizzliesRoster);




        //Heat
        ArrayList<Player> heatRoster = new ArrayList<Player>();
        heatRoster.add(new Player("Kyle Lowry", Position.POINT_GUARD, 7,
                77,78, 75, 48, 84,
                68, 48, 74, 80));

        heatRoster.add(new Player("Tyler Herro", Position.SHOOTING_GUARD, 14,
                84,86, 74, 62, 69,
                46, 51, 81, 78));

        heatRoster.add(new Player("Jimmy Butler", Position.SMALL_FORWARD, 22,
                93,76, 80, 81, 90,
                75, 63, 93, 83));

        heatRoster.add(new Player("Kevin Love", Position.POWER_FORWARD, 42,
                76,77, 77, 73, 50,
                69, 73, 68, 55));

        heatRoster.add(new Player("Bam Adebayo", Position.CENTER, 13,
                87,69, 88, 81, 83,
                93, 74, 79, 69));
        league.get(15).setRoster(heatRoster);




        //Bucks
        ArrayList<Player> bucksRoster = new ArrayList<Player>();
        bucksRoster.add(new Player("Jrue Holiday", Position.POINT_GUARD, 21,
                88,82, 86, 60, 95,
                44, 49, 92, 83));

        bucksRoster.add(new Player("Grayson Allen", Position.SHOOTING_GUARD, 12,
                75,84, 70, 55, 72,
                35, 44, 76, 69));

        bucksRoster.add(new Player("Kris Middleton", Position.SMALL_FORWARD, 22,
                86,83, 90, 71, 84,
                72, 52, 82, 76));

        bucksRoster.add(new Player("Giannis Antetokounmpo", Position.POWER_FORWARD, 34,
                97,71, 74, 96, 92,
                92, 77, 85, 85));

        bucksRoster.add(new Player("Brook Lopez", Position.CENTER, 11,
                85,83, 84, 79, 45,
                92, 62, 89, 41));
        league.get(16).setRoster(bucksRoster);





        //Wolves
        ArrayList<Player> wolvesRoster = new ArrayList<Player>();
        wolvesRoster.add(new Player("Mike Conley", Position.POINT_GUARD, 10,
                80,81, 94, 46, 83,
                31, 39, 87, 86));

        wolvesRoster.add(new Player("Anthony Edwards", Position.SHOOTING_GUARD, 1,
                86,81, 85, 82, 74,
                50, 50, 80, 78));

        wolvesRoster.add(new Player("Jaden McDaniels", Position.SMALL_FORWARD, 3,
                79,83, 85, 60, 82,
                80, 48, 79, 54));

        wolvesRoster.add(new Player("Karl-Anthony Towns", Position.POWER_FORWARD, 32,
                86,79, 94, 83, 50,
                69, 66, 79, 68));

        wolvesRoster.add(new Player("Rudy Gobert", Position.CENTER, 27,
                84,25, 60, 71, 64,
                97, 86, 77, 43));
        league.get(17).setRoster(wolvesRoster);





        //Pelicans
        ArrayList<Player> pelsRoster = new ArrayList<Player>();
        pelsRoster.add(new Player("CJ McCollum", Position.POINT_GUARD, 3,
                84,82, 83, 56, 70,
                35, 46, 84, 80));

        pelsRoster.add(new Player("Herbert Jones", Position.SHOOTING_GUARD, 5,
                79,76, 71, 67, 88,
                62, 51, 85, 66));

        pelsRoster.add(new Player("Brandon Ingram", Position.SMALL_FORWARD, 14,
                87,84, 89, 78, 69,
                61, 48, 86, 76));

        pelsRoster.add(new Player("Zion Williamson", Position.POWER_FORWARD, 1,
                92,73, 70, 94, 55,
                59, 63, 77, 72));

        pelsRoster.add(new Player("Jonas Valenciunas", Position.CENTER, 17,
                83,77, 71, 78, 43,
                75, 89, 70, 42));
        league.get(18).setRoster(pelsRoster);





        //Knicks
        ArrayList<Player> knicksRoster = new ArrayList<Player>();
        knicksRoster.add(new Player("Jalen Brunson", Position.POINT_GUARD, 11,
                87,85, 94, 65, 70,
                55, 41, 88, 84));

        knicksRoster.add(new Player("Josh Hart", Position.SHOOTING_GUARD, 3,
                79,80, 67, 62, 72,
                46, 68, 80, 74));

        knicksRoster.add(new Player("RJ Barrett", Position.SMALL_FORWARD, 9,
                82,74, 73, 71, 82,
                58, 49, 83, 75));

        knicksRoster.add(new Player("Julius Randle", Position.POWER_FORWARD, 30,
                87,79, 78, 82, 73,
                77, 70, 85, 75));

        knicksRoster.add(new Player("Mitchell Robinson", Position.CENTER, 23,
                80,32, 68, 70, 49,
                83, 86, 78, 44));
        league.get(19).setRoster(knicksRoster);





        //Thunder
        ArrayList<Player> thunderRoster = new ArrayList<Player>();
        thunderRoster.add(new Player("Shai Gilgeous-Alexander", Position.POINT_GUARD, 2,
                94,80, 96, 77, 79,
                68, 57, 92, 92));

        thunderRoster.add(new Player("Josh Giddy", Position.SHOOTING_GUARD, 3,
                84,75, 75, 69, 69,
                50, 68, 88, 90));

        thunderRoster.add(new Player("Lueguentz Dort", Position.SMALL_FORWARD, 5,
                78,78, 80, 91, 86,
                52, 51, 79, 62));

        thunderRoster.add(new Player("Jalen Williams", Position.POWER_FORWARD, 8,
                82,80, 84, 63, 69,
                55, 50, 77, 76));

        thunderRoster.add(new Player("Chet Holmgren", Position.CENTER, 7,
                77,75, 71, 70, 59,
                77, 80, 72, 59));
        league.get(20).setRoster(thunderRoster);





        //Magic
        ArrayList<Player> magicRoster = new ArrayList<Player>();
        magicRoster.add(new Player("Markelle Fultz", Position.POINT_GUARD, 20,
                82,74, 81, 64, 75,
                50, 50, 81, 83));

        magicRoster.add(new Player("Gary Harris", Position.SHOOTING_GUARD, 14,
                75,86, 70, 55, 84,
                68, 39, 87, 66));

        magicRoster.add(new Player("Franz Wagner", Position.SMALL_FORWARD, 22,
                84,80, 79, 69, 73,
                56, 46, 85, 75));

        magicRoster.add(new Player("Paolo Banchero", Position.POWER_FORWARD, 5,
                84,70, 79, 79, 66,
                68, 66, 76, 71));

        magicRoster.add(new Player("Wendell Carter Jr", Position.CENTER, 34,
                82,78, 81, 79, 47,
                78, 76, 78, 54));
        league.get(21).setRoster(magicRoster);





        //Sixers
        ArrayList<Player> sixersRoster = new ArrayList<Player>();
        sixersRoster.add(new Player("James Harden", Position.POINT_GUARD, 1,
                90,85, 93, 76, 70,
                62, 53, 81, 90));

        sixersRoster.add(new Player("Tyrese Maxey", Position.SHOOTING_GUARD, 0,
                84,85, 83, 66, 79,
                52, 39, 87, 82));

        sixersRoster.add(new Player("Tobias Harris", Position.SMALL_FORWARD, 12,
                81,82, 89, 75, 58,
                59, 55, 72, 66));

        sixersRoster.add(new Player("PJ Tucker", Position.POWER_FORWARD, 17,
                75,83, 74, 54, 80,
                77, 56, 76, 55));

        sixersRoster.add(new Player("Joel Embid", Position.CENTER, 21,
                94,80, 97, 92, 68,
                96, 80, 90, 68));
        league.get(22).setRoster(sixersRoster);





        //Suns
        ArrayList<Player> sunsRoster = new ArrayList<Player>();
        sunsRoster.add(new Player("Chris Paul", Position.POINT_GUARD, 3,
                87,81, 89, 55, 90,
                61, 46, 88, 87));

        sunsRoster.add(new Player("Devin Booker", Position.SHOOTING_GUARD, 1,
                92,86, 97, 76, 74,
                58, 46, 87, 85));

        sunsRoster.add(new Player("Josh Okogie", Position.SMALL_FORWARD, 2,
                78,76, 82, 54, 81,
                50, 61, 77, 66));

        sunsRoster.add(new Player("Kevin Durant", Position.POWER_FORWARD, 35,
                96,87, 98, 85, 85,
                75, 59, 90, 82));

        sunsRoster.add(new Player("Deandre Ayton", Position.CENTER, 22,
                84,71, 92, 79, 49,
                78, 79, 74, 56));
        league.get(23).setRoster(sunsRoster);





        //Blazers
        ArrayList<Player> blazersRoster = new ArrayList<Player>();
        blazersRoster.add(new Player("Damian Lillard", Position.POINT_GUARD, 0,
                95,92, 98, 64, 69,
                31, 46, 88, 89));

        blazersRoster.add(new Player("Anfernee Simons", Position.SHOOTING_GUARD, 1,
                83,84, 86, 69, 59,
                49, 37, 73, 82));

        blazersRoster.add(new Player("Matisse Thybulle", Position.SMALL_FORWARD, 4,
                76,80, 48, 46, 93,
                60, 44, 64, 51));

        blazersRoster.add(new Player("Jerami Grant", Position.POWER_FORWARD, 9,
                82,84, 79, 77, 69,
                70, 46, 76, 65));

        blazersRoster.add(new Player("Jusuf Nurkic", Position.CENTER, 27,
                82,80, 68, 74, 45,
                78, 80, 87, 54));
        league.get(24).setRoster(blazersRoster);





        //Kings
        ArrayList<Player> kingsRoster = new ArrayList<Player>();
        kingsRoster.add(new Player("De'Aaron Fox", Position.POINT_GUARD, 5,
                89,77, 89, 58, 79,
                34, 45, 89, 89));

        kingsRoster.add(new Player("Kevin Huerter", Position.SHOOTING_GUARD, 9,
                81,87, 82, 57, 64,
                44, 43, 77, 71));

        kingsRoster.add(new Player("Harrison Barnes", Position.SMALL_FORWARD, 40,
                79,81, 79, 69, 75,
                67, 49, 75, 66));

        kingsRoster.add(new Player("Keegan Murray", Position.POWER_FORWARD, 13,
                79,84, 72, 71, 69,
                68, 55, 70, 61));

        kingsRoster.add(new Player("Domantas Sabonis", Position.CENTER, 10,
                89,70, 74, 84, 49,
                70, 88, 82, 68));
        league.get(25).setRoster(kingsRoster);





        //Spurs
        ArrayList<Player> spursRoster = new ArrayList<Player>();
        spursRoster.add(new Player("Tre Jones", Position.POINT_GUARD, 33,
                79,70, 92, 49, 75,
                34, 45, 77, 82));

        spursRoster.add(new Player("Devin Vassell", Position.SHOOTING_GUARD, 24,
                81,83, 93, 66, 82,
                62, 44, 86, 73));

        spursRoster.add(new Player("Keldon Johnson", Position.SMALL_FORWARD, 3,
                83,80, 76, 74, 76,
                67, 50, 80, 70));

        spursRoster.add(new Player("Jeremy Sochan", Position.POWER_FORWARD, 10,
                78,70, 72, 64, 74,
                65, 63, 79, 65));

        spursRoster.add(new Player("Zach Collins", Position.CENTER, 23,
                80,82, 82, 68, 45,
                68, 74, 67, 41));
        league.get(26).setRoster(spursRoster);





        //Raptors
        ArrayList<Player> raptorsRoster = new ArrayList<Player>();
        sunsRoster.add(new Player("Fred VanVleet", Position.POINT_GUARD, 23,
                83,79, 90, 51, 83,
                27, 44, 88, 85));

        raptorsRoster.add(new Player("OG Anunoby", Position.SHOOTING_GUARD, 3,
                82,82, 80, 60, 87,
                76, 51, 74, 57));

        raptorsRoster.add(new Player("Scottie Barnes", Position.SMALL_FORWARD, 4,
                83,72, 74, 76, 75,
                75, 63, 86, 76));

        raptorsRoster.add(new Player("Pascal Siakam", Position.POWER_FORWARD, 43,
                87,77, 80, 87, 79,
                86, 63, 83, 74));

        raptorsRoster.add(new Player("Jakob Poeltl", Position.CENTER, 19,
                81,45, 59, 71, 45,
                81, 87, 76, 53));
        league.get(27).setRoster(raptorsRoster);




        //Jazz
        ArrayList<Player> jazzRoster = new ArrayList<Player>();
        jazzRoster.add(new Player("Collin Sexton", Position.POINT_GUARD, 2,
                81,84, 88, 57, 67,
                45, 42, 75, 79));

        jazzRoster.add(new Player("Jordan Clarkson", Position.SHOOTING_GUARD, 00,
                82,80, 82, 60, 65,
                43, 46, 78, 79));

        jazzRoster.add(new Player("Lauri Markkanen", Position.SMALL_FORWARD, 23,
                86,84, 85, 83, 65,
                66, 67, 79, 55));

        jazzRoster.add(new Player("Kelly Olynyk", Position.POWER_FORWARD, 41,
                79,83, 71, 75, 50,
                70, 59, 82, 51));

        jazzRoster.add(new Player("Walker Kessler", Position.CENTER, 24,
                84,66, 68, 76, 65,
                84, 89, 72, 40));
        league.get(28).setRoster(jazzRoster);





        //Wizards
        ArrayList<Player> wizardsRoster = new ArrayList<Player>();
        wizardsRoster.add(new Player("Monte Morris", Position.POINT_GUARD, 22,
                79,83, 87, 51, 62,
                44, 44, 80, 86));

        wizardsRoster.add(new Player("Bradley Beal", Position.SHOOTING_GUARD, 3,
                87,81, 94, 70, 66,
                45, 44, 80, 81));

        wizardsRoster.add(new Player("Kyle Kuzma", Position.SMALL_FORWARD, 33,
                83,77, 68, 77, 67,
                66, 57, 74, 70));

        wizardsRoster.add(new Player("Kristaps Porzingis", Position.POWER_FORWARD, 6,
                87,82, 83, 85, 56,
                78, 69, 77, 52));

        wizardsRoster.add(new Player("Daniel Gafford", Position.CENTER, 22,
                84,29, 65, 74, 57,
                70, 75, 65, 37));
        league.get(29).setRoster(wizardsRoster);





    }

    public static void initCoaches() {
        league.get(0).setCoach(new Coach("Nate McMillan", 8));
        league.get(1).setCoach(new Coach("Joe Mazzulla", 11));
        league.get(2).setCoach(new Coach("Jacque Vaughn", 18));
        league.get(3).setCoach(new Coach("Steve Clifford", 28));
        league.get(4).setCoach(new Coach("Billy Donovan", 14));
        league.get(5).setCoach(new Coach("J.B. Bickerstaff", 19));
        league.get(6).setCoach(new Coach("Jason Kidd", 21));
        league.get(7).setCoach(new Coach("Michael Malone", 6));
        league.get(8).setCoach(new Coach("Dwane Casey", 20));
        league.get(9).setCoach(new Coach("Steve Kerr", 4));
        league.get(10).setCoach(new Coach("Stephen Silas", 30));
        league.get(11).setCoach(new Coach("Rick Carlisle", 13));
        league.get(12).setCoach(new Coach("Tyronn Lue", 23));
        league.get(13).setCoach(new Coach("Darvin Ham", 24));
        league.get(14).setCoach(new Coach("Taylor Jenkins", 10));
        league.get(15).setCoach(new Coach("Erik Spoelstra", 3));
        league.get(16).setCoach(new Coach("Mike Budenholzer", 7));
        league.get(17).setCoach(new Coach("Chris Finch", 22));
        league.get(18).setCoach(new Coach("Willie Green", 15));
        league.get(19).setCoach(new Coach("Tom Thibodeau", 17));
        league.get(20).setCoach(new Coach("Mark Daigneault", 25));
        league.get(21).setCoach(new Coach("Jamahl Mosley", 26));
        league.get(22).setCoach(new Coach("Doc Rivers", 16));
        league.get(23).setCoach(new Coach("Monty Williams", 5));
        league.get(24).setCoach(new Coach("Chauncey Billups", 27));
        league.get(25).setCoach(new Coach("Mike Brown", 9));
        league.get(26).setCoach(new Coach("Gregg Popovich", 1));
        league.get(27).setCoach(new Coach("Nick Nurse", 2));
        league.get(28).setCoach(new Coach("Will Hardy", 12));
        league.get(29).setCoach(new Coach("Wes Unseld Jr.", 29));

    }

    public static void initRatings() {
        for (int i = 0; i < league.size(); i++) {
            league.get(i).computeOffensiveRating();
            league.get(i).computeDefensiveRating();
            league.get(i).computeStrategyRating();
            league.get(i).computeOverallRating();
        }

    }

}
