package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OneIntentMultiActivity extends AppCompatActivity {

    Button btnPre;
    TextView txtUsername,txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_intent_multi);

        //Find Value in TextView
        txtUsername = findViewById(R.id.txtUsername);
        txtPass = findViewById(R.id.txtPass);

        //get value from Intent Class
        Intent getValue = getIntent();
        String strName,strPass;

        strName=getValue.getStringExtra("KeyUname");
        strPass=getValue.getStringExtra("KeyUpass");

        txtUsername.setText(strName);
        txtPass.setText(strPass);

        if(strName.equals("User001")&& strPass.equals("User@001")){
            txtUsername.setText(strName);
            txtPass.setText(strPass);
        }else{
            Toast.makeText(this, "User not Found", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(OneIntentMultiActivity.this,IntentMultiActivity.class);
            startActivity(i);
        }
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