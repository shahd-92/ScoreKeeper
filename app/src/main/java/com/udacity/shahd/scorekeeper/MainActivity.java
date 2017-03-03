package com.udacity.shahd.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int foulTeamA=0;
    int foulTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulForTeamA(int foul) {
            TextView foulView = (TextView) findViewById(R.id.team_a_fouls);
            foulView.setText(String.valueOf(foul));
        }

    public void addOneScoreTeamA (View v){
        scoreTeamA=scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }
    public void addOneFoulTeamA (View v){
        foulTeamA=foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * resets the given score and foul for Team A and B.
     */
    public void reset (View v){
        scoreTeamA=0;
        scoreTeamB=0;
        foulTeamA=0;
        foulTeamB=0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given foul for Team B.
     */
    public void displayFoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(foul));
    }
    public void addOneScoreTeamB (View v){
        scoreTeamB=scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }
    public void addOneFoulTeamB (View v){
        foulTeamB=foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }


}
