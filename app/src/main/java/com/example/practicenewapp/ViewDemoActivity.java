package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ViewDemoActivity extends AppCompatActivity {
TextView txtTitle;
EditText Uname, Upass;
Button BSHOW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_demo);

    txtTitle=(TextView) findViewById(R.id.txtTitle);

    BSHOW=(Button)findViewById(R.id.btnshowme);

    Uname = (EditText) findViewById(R.id.txtusername);
    Upass = (EditText) findViewById(R.id.txtpass);


    txtTitle.setText("Login User");

    BSHOW.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strusername,strpass;
            strusername=Uname.getText().toString();
            strpass=Upass.getText().toString();
            Toast.makeText(ViewDemoActivity.this, "UerName: "+strusername+
                            "\n\n"+"Password: "+ strpass,
                    Toast.LENGTH_SHORT).show();
        }
    });

    }

  /* public void Show_Me (View v){
        String EditUser, Editpass;

        EditUser = Uname.getText().toString();
        Editpass = Upass.getText().toString();

        Toast.makeText(this, "UerName: "+EditUser+
                        "\n\n"+"Password: "+ Editpass,
                Toast.LENGTH_SHORT).show();
    } */
}