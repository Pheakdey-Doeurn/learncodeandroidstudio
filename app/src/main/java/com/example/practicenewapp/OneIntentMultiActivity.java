package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneIntentMultiActivity extends AppCompatActivity {

    Button btnPre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_intent_multi);
        btnPre =  findViewById(R.id.btnPre);
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OneIntentMultiActivity.this,IntentMultiActivity.class);
                startActivity(i);
            }
        });
    }
}