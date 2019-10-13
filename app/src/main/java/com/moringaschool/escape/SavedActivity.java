package com.moringaschool.escape;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.jar.Attributes;

public class SavedActivity extends AppCompatActivity {
    private TextView mlocationNameText;
    private TextView mlocationTypeText;
    private TextView mlocationDescriptionText;
    private TextView mlocationDresscodeText;
    private TextView mlocationTimeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);
        mlocationNameText = (TextView) findViewById(R.id.locationNameText);
        mlocationTypeText=(TextView) findViewById(R.id.locationTypeText);
        mlocationDescriptionText=(TextView) findViewById(R.id.locationDescriptionText);
        mlocationDresscodeText=(TextView) findViewById(R.id.locationDressCodeText);
        mlocationTimeText=(TextView) findViewById(R.id.locationTimeText);
        Intent intent2 = getIntent();
        String Name = intent2.getStringExtra("Name");
        System.out.println(Name);
        String Type = intent2.getStringExtra("Type");
        String Description = intent2.getStringExtra("Description");
        String Dresscode = intent2.getStringExtra("Dresscode");
        String Time = intent2.getStringExtra("Time");
        mlocationNameText.setText(  "NAME: " + Name);
        mlocationTypeText.setText(  "TYPE: " + Type);
        mlocationDescriptionText.setText(  "DESCRIPTION: " + Description);
        mlocationDresscodeText.setText("DRESSCODE: " +  Dresscode);
        mlocationTimeText.setText(  "TIME: " + Time);
        Toast.makeText(SavedActivity.this, "Congratulations,your Event Has Been Saved!", Toast.LENGTH_LONG).show();
    }
}
