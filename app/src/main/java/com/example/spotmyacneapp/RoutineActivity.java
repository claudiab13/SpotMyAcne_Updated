package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RoutineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        ImageButton back = findViewById(R.id.backRoutine);

        back.setOnClickListener(view -> {

            Intent intent = new Intent(RoutineActivity.this, CalendarActivity.class);
            startActivity(intent);


        });
    }
}
