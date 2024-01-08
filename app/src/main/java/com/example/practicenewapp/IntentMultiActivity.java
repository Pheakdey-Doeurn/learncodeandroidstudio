package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentMultiActivity extends AppCompatActivity {

    Button btnClick;
    EditText editUsername,editPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_multi);

        editUsername = findViewById(R.id.txtUsername);
        editPass = findViewById(R.id.txtPass);

        btnClick = findViewById(R.id.btnNext);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntentMultiActivity.this,OneIntentMultiActivity.class);

                i.putExtra("KeyUname",editUsername.getText().toString().trim());
                i.putExtra("KeyUpass",editPass.getText().toString().trim());
                startActivity(i);
            }
        });
    }
}