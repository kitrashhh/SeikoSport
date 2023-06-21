package com.example.seikosport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Venta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);
    }

    public void Regresa (View view){
        Intent Regresa = new Intent(this, MainActivity.class);
        startActivity(Regresa);
    }

}