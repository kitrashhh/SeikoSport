package com.example.seikosport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

    }

    public void Empezar (View view){
        Intent Empezar = new Intent(this, Puente.class);
        startActivity(Empezar);
    }

    public void Empezar2 (View view){
        Intent Empezar2 = new Intent(this, Sentadillas.class);
        startActivity(Empezar2);
    }

    public void Empezar3 (View view){
        Intent Empezar3 = new Intent(this, Zancadas.class);
        startActivity(Empezar3);
    }

    public void Empezar4 (View view){
        Intent Empezar4 = new Intent(this, Stepup.class);
        startActivity(Empezar4);
    }

    public void Empezar5 (View view){
        Intent Empezar5 = new Intent(this, Frogpump.class);
        startActivity(Empezar5);
    }


    public void Regresar (View view){
        Intent Regresar = new Intent(this, MainActivity.class);
        startActivity(Regresar);
    }

}