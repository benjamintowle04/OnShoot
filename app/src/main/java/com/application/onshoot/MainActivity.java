package com.application.onshoot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> randomQuotes = new ArrayList<String>() {
        {
            add("\"If I was a Caesar salad, the croutons would be my friends, the lettuce would be my family and the dressing would be my mom.\" – Kevin Garnett");
            add("\"I thought we were up.\" – JR Smith");
            add("\"If going to turn this team around 360 degrees.\" -Jason Kidd");
            add("\"Any time Detroit scores more than 100 points and holds the other team below 100 points, they almost always win.\" -Doug Collins");
            add("\" I ain't gonna be no escape-goat\" -Karl Malone");
            add("\"All series long we’ve been able to penetrate their bigs, get deep, and suck the D in.\" – Jason Terry");
            add("\"I’m tired of getting a taste of em. I want the whole load.\" – Paul Pierce");
            add("\"Left hand, right hand, it doesn’t matter; I’m amphibious.\" – Charles Shackleford");
            add("“Oh road trips? I thought you said roaches. I got a lot of bad thoughts about roaches. I grew up around roaches… I grew up around roaches, and it was bad. Too many of them. Too many friends, I’ve got a lot of roach friends. They wake up in my cereal, they wake up, you know, ‘Ron what’s up, good morning’. One leg in my macaroni, the other leg in my corn. You know, they just make themselves comfortable at my home. They’re my friends. I like roaches. I mean, I don’t want to be around them, I want to leave them where they at. But yeah, I know a lot of them.” – Ron Artest");
            add("“Y’all know how we have dogs and stuff right? So I think it was bigger people in the world before us, and the dinosaurs was they pets.” – Jordan Clarkson");
        }
    };
    TextView randomQuoteText;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomQuoteText = findViewById(R.id.home_screen_quote);
        int n = rand.nextInt(randomQuotes.size());
        randomQuoteText.setText(randomQuotes.get(n));

    }

    @Override
    protected void onResume() {
        super.onResume();
        int n = rand.nextInt(randomQuotes.size());
        randomQuoteText.setText(randomQuotes.get(n));

    }

}