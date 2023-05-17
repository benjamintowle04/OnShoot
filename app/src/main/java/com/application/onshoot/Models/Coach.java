package com.application.onshoot.Models;

public class Coach {
    private String coachName;
    private int rank;
    private int rating; //Directly corresponds to the rank, since 2k doesnt have ratings for coaches, #1 will be 99, #2 will be 98...

    public Coach(String coachName, int rank) {
        this.coachName = coachName;
        this.rank = rank;
        this.rating = 99 - rank;
    }

    public String getCoachName() {return this.coachName;}
    public int getRank() {return this.rank;}
    public int getRating() {return this.rating;}
}
