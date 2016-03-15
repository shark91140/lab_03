package com.example.studente3.lab_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int mScore = 0;

    public void reset(View view) {
        mScore = 0;
        display(mScore);
    }

    private void display(int score) {
        TextView scoreText = (TextView) findViewById(R.id.scroe);
        scoreText.setText(String.valueOf(score));
    }

    public void onePoint(View view) {
        display(++mScore);

    }

    public void twoPoint(View view) {
        display(mScore = mScore + 2);
    }

    public void threePoint(View view) {
        display(mScore = mScore +3);
    }

}
