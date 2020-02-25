package edu.harvard.cs50.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreِِA (int score)
    {
        TextView textview = (TextView) findViewById(R.id.teamA_score);
        textview.setText(String.valueOf(score));

    }

    public void displayScoreِِB (int score)
    {
        TextView textview = (TextView) findViewById(R.id.teamB_score);
        textview.setText(String.valueOf(score));

    }

    public void scoreOneA (View view)
    {
        scoreA += 1;
        displayScoreِِA(scoreA);
    }

    public void scoreOneB (View view)
    {
        scoreB += 1;
        displayScoreِِB(scoreB);
    }

    public void scoreTwoA (View view)
    {
        scoreA += 2;
        displayScoreِِA(scoreA);
    }

    public void scoreTwoB (View view)
    {
        scoreB += 2;
        displayScoreِِB(scoreB);
    }

    public void scoreThreeA (View view)
    {
        scoreA += 3;
        displayScoreِِA(scoreA);
    }

    public void scoreThreeB (View view)
    {
        scoreB += 3;
        displayScoreِِB(scoreB);
    }

    public void Reset (View view)
    {
        scoreA = 0;
        scoreB = 0;
        displayScoreِِA(scoreA);
        displayScoreِِB(scoreB);
    }
}
