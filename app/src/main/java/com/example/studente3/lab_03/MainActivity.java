package com.example.studente3.lab_03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        name();
    }

    public void name() {
        CourtCounterFragment Team_A =
                (CourtCounterFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_team_a);
        CourtCounterFragment Team_B =
                (CourtCounterFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_team_b);
        Team_A.setName("黃蜂");
        Team_B.setName("火箭");
    }


    public void reset(View view) {
        CourtCounterFragment Team_A =
                (CourtCounterFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_team_a);
        CourtCounterFragment Team_B =
                (CourtCounterFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_team_b);

        Team_A.resetScore();
        Team_B.resetScore();

    }
}
