package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for team A by 3.
     */
    public void clickGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the number of penalty cards for Team A (Portugal).
     * */
    public void penaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalties);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the number of penalty cards for Team A by 1.
     */
    public void clickPenaltyTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        penaltyForTeamA(penaltyTeamA);
    }

    /**
     * Displays the given score for Team B.*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void clickGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the number of penalty cards for Team B (Spain).
     * */
    public void penaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalties);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the number of penalty cards for Team B by 1.
     */
    public void clickPenaltyTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        penaltyForTeamB(penaltyTeamB);
    }

    public void clickReset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        penaltyForTeamA(penaltyTeamA);
        penaltyForTeamB(penaltyTeamB);
    }
}

