package com.moringaschool.escape;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {
    private EditText mlocationNameText;
    private EditText mlocationTypeText;
    private EditText mlocationDescriptionText;
    private EditText mlocationDresscodeText;
    private EditText mlocationTimeText;
    private Button mSubmitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        mlocationNameText = (EditText) findViewById(R.id.locationNameText);
        mlocationTypeText=(EditText) findViewById(R.id.locationTypeText);
        mlocationDescriptionText=(EditText) findViewById(R.id.locationDescriptionText);
        mlocationDresscodeText=(EditText) findViewById(R.id.locationDressCodeText);
        mlocationTimeText=(EditText) findViewById(R.id.locationTimeText);
        mSubmitButton = (Button) findViewById(R.id.SubmitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Name = mlocationNameText.getText().toString();
                String Type = mlocationTypeText.getText().toString();
                String Description = mlocationDescriptionText.getText().toString();
                String Dresscode = mlocationDresscodeText.getText().toString();
                String Time = mlocationTimeText.getText().toString();
                Intent intent2 = new Intent(EventActivity.this,SavedActivity.class);
                intent2.putExtra("Name", Name);
                intent2.putExtra("Type", Type);
                intent2.putExtra("Description", Description);
                intent2.putExtra("Dresscode", Dresscode);
                intent2.putExtra("Time", Time);
                startActivity(intent2);

            }
        });
    }

}
