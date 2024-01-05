package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonTestActivity extends AppCompatActivity {
    ImageView imgNopic;
    RadioButton rbFruit;
    RadioGroup rgGroup;
    TextView txtFruit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_test);

        rgGroup=findViewById(R.id.rgGroup);
        txtFruit= findViewById(R.id.txtFruit);
        imgNopic =findViewById(R.id.imgNopic);

        rgGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgGroup, int i) {
               if(i == R.id.rbMango) {
                   imgNopic.setImageResource(R.drawable.mang);
                   txtFruit.setText("Mango");
               }else if(i == R.id.rbOrange) {
                       imgNopic.setImageResource(R.drawable.oran);
                       txtFruit.setText("Orange");
               }else if(i == R.id.rbBanana) {
                        imgNopic.setImageResource(R.drawable.bana);
                        txtFruit.setText("Banana");
               }else if(i == R.id.rbGrape) {
                        imgNopic.setImageResource(R.drawable.grape);
                        txtFruit.setText("Grape");
               }

                rbFruit= findViewById(i);
                txtFruit.setText(rbFruit.getText().toString());
            }
        });

    }

}