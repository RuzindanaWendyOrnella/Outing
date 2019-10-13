package com.moringaschool.escape;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {
    private EditText mlocationNameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        mlocationNameText = (EditText) findViewById(R.id.locationNameText);
    }

}
