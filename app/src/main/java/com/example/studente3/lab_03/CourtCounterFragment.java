package com.example.studente3.lab_03;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment implements View.OnClickListener {

    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_three_point;
    private Button m_btn_two_point;
    private Button m_btn_one_point;
    private int m_score;
    private StringBuilder sb_score = new StringBuilder();

    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        m_tv_team_name = (TextView) getView().findViewById(R.id.tv_name);
        m_tv_team_score = (TextView) getView().findViewById(R.id.tv_scroe);
        m_btn_three_point = (Button) getView().findViewById(R.id.btn_three);
        m_btn_three_point.setOnClickListener(this);
        m_btn_two_point = (Button) getView().findViewById(R.id.btn_two);
        m_btn_two_point.setOnClickListener(this);
        m_btn_one_point = (Button) getView().findViewById(R.id.btn_onePoint);
        m_btn_one_point.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_onePoint:
                m_score++;
                break;
            case R.id.btn_two:
                m_score = m_score + 2;
                break;
            case R.id.btn_three:
                m_score = m_score + 3;
            default:
                break;
        }
        display(m_score);
    }

    public void resetScore() {
        display(m_score = 0);
    }

    public void setName(String name) {
        m_tv_team_name.setText(name);
    }


    private void display(int score) {
        sb_score.delete(0, sb_score.length());
        sb_score.append(score);
        m_tv_team_score.setText(sb_score);
    }

}
