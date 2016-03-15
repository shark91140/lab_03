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
    private int mScroe2 = 0;

    public void reset(View view) {
        mScroe = 0;
        mScroe2 =0;
        TextView scroeText = (TextView)findViewById(R.id.scroe);
        scroeText.setText(String.valueOf(mScroe));
        TextView scroeText2 = (TextView)findViewById(R.id.scroe2);
        scroeText2.setText(String.valueOf(mScroe2));
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
    public void onepoint2(View view) {
        TextView scroeText = (TextView)findViewById(R.id.scroe2);

        scroeText.setText(String.valueOf(++mScroe2));

    }

    public void twopoint2(View view) {
        TextView scroeText = (TextView)findViewById(R.id.scroe2);

        scroeText.setText(String.valueOf(mScroe2 = mScroe2+2));
    }

    public void threepoint2(View view) {
        TextView scroeText = (TextView)findViewById(R.id.scroe2);

        scroeText.setText(String.valueOf(mScroe2 = mScroe2+3));
    }
}
