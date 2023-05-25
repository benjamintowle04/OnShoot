package com.application.onshoot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.application.onshoot.Utils.Association;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Association.initTeams();
        Association.initRosters();
        Association.initCoaches();
        Association.initRatings();

       for (int i = 0; i < Association.league.size(); i++) {
           System.out.println(Association.league.get(i).getTeamName() + ": " + Association.league.get(i).getRoster().get(1).getPlayerName());
       }

    }
}