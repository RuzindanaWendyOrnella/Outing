package com.moringaschool.escape;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView (R.id.LoginButton) Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginButton = (Button) findViewById(R.id.LoginButton);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EscapeActivity.class);
                startActivity(intent);

            }
        });
    }
}
   /* (MainActivity.this, EscapeActivity.class);
}*/
 /*mLocationNameText = (EditText) findViewById(R.id.locationNameText);
        mLocationTypeText = (EditText) findViewById(R.id.locationTypeText);
        mLocationDescriptionText = (EditText) findViewById(R.id.locationDescriptionText);
        mLocationDressCodeText = (EditText) findViewById(R.id.locationDressCodeText);
        mLocationTimeText = (EditText) findViewById(R.id.locationTimeText);*/