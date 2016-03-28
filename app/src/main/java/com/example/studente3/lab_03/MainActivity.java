package com.example.studente3.lab_03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CourtCounterFragment Team_A;
    private CourtCounterFragment Team_B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Team_A = (CourtCounterFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_team_a);
        Team_B = (CourtCounterFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_team_b);
        name();
        setImage();
    }

    public void name() {

        Team_A.setName(getString(R.string.team_a_name));
        Team_B.setName(getString(R.string.team_b_name));
    }

    public void setImage() {
        Team_A.setLogo(R.drawable.team_a_logo);
        Team_B.setLogo(R.drawable.team_b_logo);
    }


    public void reset(View view) {

        Team_A.resetScore();
        Team_B.resetScore();

    }
}
