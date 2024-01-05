package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioButton;

public class RadioButtonTestActivity extends AppCompatActivity {
    ImageView imgNopic;
    RadioGroup rgFruit;
    RadioButton rbFruit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_test);

        rgFruit = findViewById(R.id.rgFruit);
        txtResult = findViewById(R.id.txtResult);
        imgNopic = findViewById(R.id.imgNopic);

        rgFruit.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgGroup, int i) {
                if (i == R.id.rbMango) {
                    imgNopic.setImageResource(R.drawable.mang);
                    txtResult.setText("Mango");
                } else if (i == R.id.rbOrange) {
                    imgNopic.setImageResource(R.drawable.oran);
                    txtResult.setText("Orange");
                } else if (i == R.id.rbBanana) {
                    imgNopic.setImageResource(R.drawable.bana);
                    txtResult.setText("Banana");
                } else if (i == R.id.rbGrape) {
                    imgNopic.setImageResource(R.drawable.grape);
                    txtResult.setText("Grape");
                }
                rbFruit=findViewById(i);
                txtResult.setText(rbFruit.getText().toString());

            }
        });
    }
}
