package com.example.timepicker;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DialogFragment fragment = new TimePickerFragment();
        fragment.show(getSupportFragmentManager(),
                getString(R.string.timepicker));
    }

    public void prosessTimePickerResult (int hour, int minute){
        String hour_string = Integer.toString(hour);
        String minuet_string = Integer.toString(minute);
        String timeMessage = (hour_string + " : " + minuet_string);

        Toast.makeText(this, timeMessage, Toast.LENGTH_SHORT).show();


    }
}
