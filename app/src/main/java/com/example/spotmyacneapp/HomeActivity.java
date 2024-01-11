package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("HomeActivity", "onCreate called");

        Button map = findViewById(R.id.map);
        Button calendar = findViewById(R.id.calendar);

        map.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, MapActivity.class);
            startActivity(intent);
        });

        calendar.setOnClickListener(view -> {
            Log.d("Calendar", "Butonul de calendar a fost apăsat."); // Mesaj de log pentru a confirma apăsarea butonului

            Intent intent = new Intent(HomeActivity.this, CalendarActivity.class);
            startActivity(intent);
            Log.d("Calendar", "Redirecționare către MapActivity."); // Mesaj de log pentru a confirma redirecționarea

        });

    }
}

