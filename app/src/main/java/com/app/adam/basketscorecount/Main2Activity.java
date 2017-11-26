package com.app.adam.basketscorecount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvScoreA, tvScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String kalimatA="";
        String kalimatB="";

        tvScoreA= findViewById(R.id.teamA);
        tvScoreB= findViewById(R.id.teamB);

        Intent intentterima = getIntent();
        int a = intentterima.getIntExtra("SCOREA", 0);
        int b = intentterima.getIntExtra("SCOREB", 0);

        tvScoreA.setText(kalimatA+a);
        tvScoreB.setText(kalimatB+b);
     }
}
