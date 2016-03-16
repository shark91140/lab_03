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
    private int mSrcoe = 0;
    private int mSrcoe2 = 0;

    public void reset(View view) {
        mSrcoe = 0;
        mSrcoe2 =0;
        display(R.id.scroe, mSrcoe);
        display(R.id.scroe2, mSrcoe2);
    }

    private void display(int ID, int srcoe) {
        TextView scoreText = (TextView) findViewById(ID);
        scoreText.setText(String.valueOf(srcoe));
    }

    public void onePoint(View view) {
        display(R.id.scroe, ++mSrcoe);

    }

    public void twoPoint(View view) {
        display(R.id.scroe, mSrcoe = mSrcoe + 2);
    }

    public void threePoint(View view) {
        display(R.id.scroe, mSrcoe = mSrcoe + 3);
    }
    public void onePoint2(View view) {
        display(R.id.scroe2, ++mSrcoe2);

    }

    public void twoPoint2(View view) {
        display(R.id.scroe2, mSrcoe2 = mSrcoe2 + 2);
    }

    public void threePoint2(View view) {
        display(R.id.scroe2, mSrcoe2 = mSrcoe2 + 3);
    }
}
