package com.application.onshoot.Models;

import com.application.onshoot.Enums.Position;

/**
 * Model class for an individual player
 * used by the team class to initialize and determine their ratings
 * 5 players per team
 * @author Benjamin Towle
 */
public class Player {
    //General Info
    private String playerName;
    private int playerNumber;
    private int overallRating; //Overall rating for display use only while computed ratings are used for team ratings
    private Position position;


    //Offensive ratings
    private int threePtRating;
    private int midRangeRating;
    private int finishingRating;


    //Defensive ratings
    private int perimeterDefenseRating;
    private int interiorDefenseRating;
    private int reboundRating;


    //Gameplan/IQ ratings
    private int iqRating;
    private int playmakingRating;



    public Player(String playerName, Position position, int playerNumber, int overallRating, int threePtRating,
                  int midRangeRating, int finishingRating, int perimeterDefenseRating,
                  int interiorDefenseRating, int reboundRating, int iqRating, int playmakingRating) {

        this.playerName = playerName;
        this.position = position;
        this.playerNumber = playerNumber;
        this.overallRating = overallRating;
        this.threePtRating = threePtRating;
        this.midRangeRating = midRangeRating;
        this.finishingRating = finishingRating;
        this.perimeterDefenseRating = perimeterDefenseRating;
        this.interiorDefenseRating = interiorDefenseRating;
        this.reboundRating = reboundRating;
        this.iqRating = iqRating;
        this.playmakingRating = playmakingRating;
    }

    public int computeOffenseRating() {
        int sum = this.threePtRating + this.midRangeRating + this.finishingRating;
        double realAvg = (double)sum / 3.0;

        return (int) Math.round(realAvg);
    }

    public int computeDefenseRating() {
        int sum = this.perimeterDefenseRating + this.interiorDefenseRating + this.reboundRating;
        double realAvg = (double)sum / 3.0;

        return (int) Math.round(realAvg);
    }

    public int computeIntelligenceRating() {
        int sum = this.iqRating + this.playmakingRating;
        double realAvg = (double)sum / 2.0;

        return (int) Math.round(realAvg);
    }

    public String getPlayerName() {return this.playerName;}
    public int getPlayerNumber() {return this.playerNumber;}
    public int getOverallRating() {return this.overallRating;}
    public int getThreePtRating() {return this.threePtRating;}
    public int getMidRangeRating() {return this.midRangeRating;}
    public int getFinishingRating() {return this.finishingRating;}
    public int getPerimeterDefenseRating() {return this.perimeterDefenseRating;}
    public int getInteriorDefenseRating() {return this.interiorDefenseRating;}
    public int getReboundRating() {return this.reboundRating;}
    public int getIqRating() {return this.iqRating;}
    public int getPlaymakingRating() {return this.playmakingRating;}



}
