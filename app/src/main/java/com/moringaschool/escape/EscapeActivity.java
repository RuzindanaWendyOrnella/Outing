package com.moringaschool.escape;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
public class EscapeActivity extends AppCompatActivity {
    @BindView(R.id.eventButton)
    Button mEventButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
        ButterKnife.bind(this);
        mEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(EscapeActivity.this, EventActivity.class);
                startActivity(intent1);
            }

        });

    }

}