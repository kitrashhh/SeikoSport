package com.example.seikosport;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    public void LogIn (View view){
        Intent LogIn = new Intent(this, Login.class);
        startActivity(LogIn);
    }

    public void News (View view){
        Intent News = new Intent (this, news.class);
        startActivity(News);
    }

    public void Info (View view){
        Intent Info = new Intent(this, Info.class);
        startActivity(Info);
    }

    public void Contact (View view){
        Intent Contact = new Intent(this, Contact.class);
        startActivity(Contact);
    }

    public void Food (View view){
        Intent Food = new Intent(this, Venta.class);
        startActivity(Food);
    }

    public void Gym (View view){
        Intent Gym = new Intent(this, Login.class);
        startActivity(Gym);
    }

    public void Venta (View view){
        Intent Venta = new Intent(this, news.class);
        startActivity(Venta);
    }

    //nav open and close
    @Override
    public void onBackPressed(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}