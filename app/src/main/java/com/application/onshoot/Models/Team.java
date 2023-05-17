package com.application.onshoot.Models;

import java.util.ArrayList;

public class Team {
    private String city;
    private String teamName;
    private int overall;
    private ArrayList<Player> roster;
    private Coach coach;
    private int offenseRating;
    private int defenseRating;
    private int strategyRating;
    private int teamIndex;

    public Team (String city, String teamName, int teamIndex) {
        this.city = city;
        this.teamName = teamName;
        this.teamIndex = teamIndex;
    }

    public String getCity() {return this.city;}
    public String getTeamName() {return this.teamName;}
    public int getOverall() {return this.overall;}
    public int getOffenseRating() {return this.offenseRating;}
    public int getDefenseRating() {return this.defenseRating;}
    public int getStrategyRating() {return this.strategyRating;}
    public ArrayList<Player> getRoster() {return this.roster;}
    public int getTeamIndex() {return this.teamIndex;}

    public void setRoster(ArrayList<Player> players) {
        if (this.roster == null) {
            this.roster = new ArrayList<Player>();
        }

        for (int i = 0; i < players.size(); i++) {
            this.roster.add(players.get(i));
        }
    }

    public void computeOffensiveRating() {
       if (this.roster == null) {
           return;
       }
       int sum = 0;

       for (int i = 0; i < roster.size(); i++) {
           sum += roster.get(i).computeOffenseRating();
       }

       double realAvg = (double) sum / this.roster.size();
       this.offenseRating = (int)Math.round(realAvg);
    }

    public void computeDefensiveRating() {
        if (this.roster == null) {
            return;
        }
        int sum = 0;

        for (int i = 0; i < roster.size(); i++) {
            sum += roster.get(i).computeDefenseRating();
        }

        double realAvg = (double) sum / this.roster.size();
        this.defenseRating = (int)Math.round(realAvg);
    }

    public void computeStrategyRating() {
        if (this.roster == null) {
            return;
        }
        int sum = 0;

        for (int i = 0; i < roster.size(); i++) {
            sum += roster.get(i).computeIntelligenceRating();
        }
        sum += 2 * this.coach.getRating(); //Coach ratings get two rating spots in the average calculations

        double realAvg = (double) sum / (this.roster.size() + 2);
        this.strategyRating = (int)Math.round(realAvg);

    }

    public void computeOverallRating() {
        if (offenseRating == 0 || defenseRating == 0 || strategyRating == 0) {
            return;
        }

        int sum = this.offenseRating + this.defenseRating + this.strategyRating;
        double realAvg = (double) sum / 3.0;
        this.overall = (int)Math.round(realAvg);
    }



}
