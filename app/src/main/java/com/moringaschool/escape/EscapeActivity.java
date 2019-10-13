package com.moringaschool.escape;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class EscapeActivity extends AppCompatActivity {
    private Button mEventButton;
    private EditText mlocationNameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
        mEventButton = (Button) findViewById(R.id.eventButton);
        mlocationNameText = (EditText) findViewById(R.id.locationNameText);
        mEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(EscapeActivity.this,EventActivity.class);
                startActivity(intent1);
            }
        });
    }
}


/*  String name = intent.getStringExtra("name");*/
/* mLocationTextView = (TextView) findViewById(R.id.locationNameText);*/