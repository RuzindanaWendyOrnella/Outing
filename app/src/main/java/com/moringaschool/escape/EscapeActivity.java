package com.moringaschool.escape;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class EscapeActivity extends AppCompatActivity {
    private TextView mEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
      /*  mEventButton = (TextView) findViewById(R.id.eventButton);*/
    }
}


/*  String name = intent.getStringExtra("name");*/
/* mLocationTextView = (TextView) findViewById(R.id.locationNameText);*/