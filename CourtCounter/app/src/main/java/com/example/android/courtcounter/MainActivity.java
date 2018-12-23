package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;
    int score1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1(View view){
        score=score+3;
        displayForTeamA(score);
    }
    public void btn2(View view){
        score=score+2;
        displayForTeamA(score);
    }
    public void btn3(View view){
        score=score+1;
        displayForTeamA(score);
    }
    public void btn4(View view){
        score1=score1+3;
        displayForTeamB(score1);
    }
    public void btn5(View view){
        score1=score1+2;
        displayForTeamB(score1);
    }
    public void btn6(View view){
        score1=score1+1;
        displayForTeamB(score1);
    }
    public void btn7(View view){
        score1=0;
        displayForTeamB(score1);
        score=0;
        displayForTeamA(score);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score1));
    }
}
