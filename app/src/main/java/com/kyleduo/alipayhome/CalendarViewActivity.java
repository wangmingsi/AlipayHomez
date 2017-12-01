package com.kyleduo.alipayhome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

/**
 * Created by admin on 2017/10/23.
 */
public class CalendarViewActivity extends AppCompatActivity {
    private CalendarView cv_calendar;
    private MaterialCalendarView materialCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendarview);
        materialCalendarView= (MaterialCalendarView) findViewById(R.id.cv_calendarView);
    }
}
