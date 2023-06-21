package com.example.seikosport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.seikosport.R;

public class Zancadas extends AppCompatActivity {

    Button startbutton;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning;
    private long MTimeLeftinmills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zancadas);

        startbutton = findViewById(R.id.startbtn);
        mtextview = findViewById(R.id.time);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MTimeRunning){

                    stoptimer();

                }else{

                    startTimer();

                }
            }
        });
    }

    private void stoptimer(){
        countDownTimer.cancel();
        MTimeRunning = false;
        startbutton.setText("Empezar");
    }

    private void startTimer(){
        final CharSequence value1 = mtextview.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);

        final int number = Integer.valueOf(num2) * 60+ Integer.valueOf(num3);
        MTimeLeftinmills = number*1000;

        countDownTimer = new CountDownTimer(MTimeLeftinmills, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                MTimeLeftinmills = millisUntilFinished;
                updateTimer();

            }

            @Override
            public void onFinish() {

            }
        }.start();

        startbutton.setText("Pausa");
        MTimeRunning = true;

    }

    private void updateTimer(){
        int minutes = (int) MTimeLeftinmills/60000;
        int seconds = (int) MTimeLeftinmills%60000/1000;

        String timeLeftText="";
        if(minutes<10)
            timeLeftText="0";
        timeLeftText = timeLeftText + minutes+":";

        if(seconds<10)
            timeLeftText="0";
        timeLeftText += seconds;
        mtextview.setText(timeLeftText);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}