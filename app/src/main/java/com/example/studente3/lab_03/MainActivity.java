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
    private int mScroe = 0;

    public void reset(View view) {
        mScroe = 0;
        TextView scroeText = (TextView)findViewById(R.id.scroe);
        scroeText.setText(String.valueOf(mScroe));
    }

    public void onepoint(View view) {
        TextView scroeText = (TextView)findViewById(R.id.scroe);
        scroeText.setText(String.valueOf(++mScroe));

    }

    public void twopoint(View view) {
        TextView scroeText = (TextView)findViewById(R.id.scroe);
        scroeText.setText(String.valueOf(mScroe = mScroe + 2));
    }

    public void threepoint(View view) {
        TextView scroeText = (TextView)findViewById(R.id.scroe);
        scroeText.setText(String.valueOf(mScroe = mScroe+3));
    }

}
