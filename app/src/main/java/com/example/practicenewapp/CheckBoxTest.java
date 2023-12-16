package com.example.practicenewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxTest extends AppCompatActivity {
//CheckBox chBox;
//TextView txtTitle;
CheckBox chBox1,chBox2,chBox3,chBox4;
ImageView img1,img2,img3,img4;

TextView txtFruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_test);
//        chBox=(CheckBox) findViewById(R.id.chBox);
//        txtTitle=(TextView) findViewById(R.id.txtTitle);
        chBox1=(CheckBox) findViewById(R.id.chBox1);
        chBox2=(CheckBox) findViewById(R.id.chBox2);
        chBox3=(CheckBox) findViewById(R.id.chBox3);
        chBox4=(CheckBox) findViewById(R.id.chBox4);
        img1=(ImageView) findViewById(R.id.img1);
        img2=(ImageView) findViewById(R.id.img2);
        img3=(ImageView) findViewById(R.id.img3);
        img4=(ImageView) findViewById(R.id.img4);
        txtFruit=(TextView) findViewById(R.id.txtFruit);



    }
//    public  void checkMe(View view){
//        if(chBox.isChecked()){
//            Toast.makeText(this, "You checked the box", Toast.LENGTH_SHORT).show();
//            txtTitle.setText("CheckBox is Checked");
//        }
//        else {
//            Toast.makeText(this, "You unchecked the box", Toast.LENGTH_SHORT).show();
//            txtTitle.setText("CheckBox is UnChecked");
//
//        }
//    }
    String Str="";

    public void SELECT_OPTION(View view){
    String message="";
        if(chBox1.isChecked()) {
            img1.setImageDrawable(getDrawable(R.drawable.mang));
            message += "Mango,";

        }
        else  {img1.setImageDrawable(getDrawable(R.drawable.no_pictures));
            message += "";
        }
        if(chBox2.isChecked()) {
            img2.setImageDrawable(getDrawable(R.drawable.bana));
            message += "Banana,";

        }
        else  {img2.setImageDrawable(getDrawable(R.drawable.no_pictures));
            message += "";
        }
        if(chBox3.isChecked()) {
            img3.setImageDrawable(getDrawable(R.drawable.grape));
            message += "Grape,";

        }
        else  {img3.setImageDrawable(getDrawable(R.drawable.no_pictures));
            message += "";
        }
        if(chBox4.isChecked()) {
            img4.setImageDrawable(getDrawable(R.drawable.oran));
            message += "Orange";

        }
        else  {img4.setImageDrawable(getDrawable(R.drawable.no_pictures));
            message += "";
        }
        if(!message.equals(""))
        txtFruit.setText(message);
        else txtFruit.setText("I like nothing");
    }
//

}