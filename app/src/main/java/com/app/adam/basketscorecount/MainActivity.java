package com.app.adam.basketscorecount;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvScoreA;
    TextView tvScoreB;

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScoreA= findViewById(R.id.team_a);
        tvScoreB= findViewById(R.id.team_b);
    }

    public int addthreePoint(int score){
        return score+3;
    }

    public int addtwoPoint(int score){
        return score+2;
    }

    public int addfreeThrow(int score){
        return score+1;
    }

    public void displayscoreA(String scoreA){
        tvScoreA.setText(scoreA);
    }

    public void displayscoreB(String scoreB){
        tvScoreB.setText(scoreB);
    }

    public void resetallscore(){
        scoreTeamA = 0;
        scoreTeamB = 0;
        tvScoreA.setText(String.valueOf(scoreTeamA));
        tvScoreB.setText(String.valueOf(scoreTeamB));
    }

    public void threePointA(View view) {
        scoreTeamA = addthreePoint(scoreTeamA);
        String angka = String.valueOf(scoreTeamA);
        displayscoreA(angka);
    }

    public void twoPointA(View view) {
        scoreTeamA = addtwoPoint(scoreTeamA);
        String angka = String.valueOf(scoreTeamA);
        displayscoreA(angka);
    }

    public void freeThrowA(View view) {
        scoreTeamA = addfreeThrow(scoreTeamA);
        String angka = String.valueOf(scoreTeamA);
        displayscoreA(angka);
    }

    public void threePointB(View view) {
        scoreTeamB = addthreePoint(scoreTeamB);
        String angka = String.valueOf(scoreTeamB);
        displayscoreB(angka);
    }

    public void twoPointB(View view) {
        scoreTeamB = addtwoPoint(scoreTeamB);
        String angka = String.valueOf(scoreTeamB);
        displayscoreB(angka);
    }

    public void freeThrowB(View view) {
        scoreTeamB = addfreeThrow(scoreTeamB);
        String angka = String.valueOf(scoreTeamB);
        displayscoreB(angka);
    }

    public void resetSkor(View view) {
        resetallscore();
        Toast.makeText(this, "Nilai tereset", Toast.LENGTH_SHORT).show();
    }

    //Implisit telfon dial nomor
    public void kirimReset(View view) {
        Intent intentKirim = new Intent(this, Main2Activity.class);
        intentKirim.putExtra("SCOREA", scoreTeamA);
        intentKirim.putExtra("SCOREB", scoreTeamB);
        startActivity(intentKirim);
    }

//eksplisit
//buat objek intent explisit
        /*
        text bantuan
         */
    //);

    //Intent intentKirim = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082187565653"));
    //startActivity(intentKirim);
}
