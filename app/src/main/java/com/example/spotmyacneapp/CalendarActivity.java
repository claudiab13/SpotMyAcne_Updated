package com.example.spotmyacneapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class CalendarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        ImageButton back = findViewById(R.id.backCalendar);

        back.setOnClickListener(view -> {
            Intent intent = new Intent(CalendarActivity.this, HomeActivity.class);
            startActivity(intent);
        });

       /*CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnFocusChangeListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                // Aici se va deschide noul ecran când utilizatorul selectează o zi în calendar
                openNewScreen(date);
            }
        });
*/


    }
}
