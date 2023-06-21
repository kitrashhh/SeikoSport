package com.example.seikosport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class news extends AppCompatActivity {

    TextView tv1;
    CheckBox op1, op2, op3, op4, op5, op6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        tv1 = findViewById(R.id.Total);

        op1 = findViewById(R.id.Nike);
        op2 = findViewById(R.id.Jordan);
        op3 = findViewById(R.id.Adidas);
        op4 = findViewById(R.id.Samba);
        op5 = findViewById(R.id.Puma);
        op6 = findViewById(R.id.Charly);

    }

    public void Calcular (View view){
        int total = 0;

        if(op1.isChecked()){
            total = total + 1400;
        }
        if(op2.isChecked()){
            total = total + 2500;
        }
        if(op3.isChecked()){
            total = total + 800;
        }
        if(op4.isChecked()){
            total = total + 2100;
        }
        if(op5.isChecked()){
            total = total + 1100;
        }
        if(op6.isChecked()){
            total = total + 600;
        }

        tv1.setText("Total: "+total);

    }

    public void cancelar (View view){
        op1.setChecked(false);
        op2.setChecked(false);
        op3.setChecked(false);
        op4.setChecked(false);
        op5.setChecked(false);
        op6.setChecked(false);

        tv1.setText("");
    }

    public void Paga (View view){

        Intent Paga = new Intent(this, paga.class);
        startActivity(Paga);
    }


    public void Regresa (View view){
        Intent Regresa = new Intent(this, MainActivity.class);
        startActivity(Regresa);
    }
}