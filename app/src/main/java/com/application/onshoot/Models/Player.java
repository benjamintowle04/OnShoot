package com.application.onshoot.Models;

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
    private int overallRating;


    //Offensive ratings
    private int threePtRating;
    private int midRangeRating;
    private int finishingRating;


    //Defensive ratings
    private int perimeterDefenseRating;
    private int interiorDefenseRating;
    private int blockRating;


    //Gameplan/IQ ratings
    private int iqRating;
    private int awarenessRating;



    public Player(String playerName, int playerNumber, int overallRating, int threePtRating,
                  int midRangeRating, int finishingRating, int perimeterDefenseRating,
                  int interiorDefenseRating, int blockRating, int iqRating, int awarenessRating) {

        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.overallRating = overallRating;
        this.threePtRating = threePtRating;
        this.midRangeRating = midRangeRating;
        this.finishingRating = finishingRating;
        this.perimeterDefenseRating = perimeterDefenseRating;
        this.interiorDefenseRating = interiorDefenseRating;
        this.blockRating = blockRating;
        this.iqRating = iqRating;
        this.awarenessRating = awarenessRating;
    }

    public int computeOffenseRating() {
        //TODO calculate offense rating
        return 0;
    }

    public int computeDefenseRating() {
        //TODO calculate offense rating
        return 0;
    }

    public int computeIntelligenceRating() {
        //TODO calculate offense rating
        return 0;
    }

    public String getPlayerName() {return this.playerName;}
    public int getPlayerNumber() {return this.playerNumber;}
    public int getOverallRating() {return this.overallRating;}
    public int getThreePtRating() {return this.threePtRating;}
    public int getMidRangeRating() {return this.midRangeRating;}
    public int getFinishingRating() {return this.finishingRating;}
    public int getPerimeterDefenseRating() {return this.perimeterDefenseRating;}
    public int getInteriorDefenseRating() {return this.interiorDefenseRating;}
    public int getBlockRating() {return this.blockRating;}
    public int getIqRating() {return this.iqRating;}
    public int getAwarenessRating() {return this.awarenessRating;}



}
