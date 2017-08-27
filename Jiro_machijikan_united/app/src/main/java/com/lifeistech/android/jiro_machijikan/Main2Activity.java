package com.lifeistech.android.jiro_machijikan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);

    }

    public void button1(View v) {
        b1.setBackgroundResource(R.drawable.ramen);
    }
    public void button2(View v) {
        b1.setBackgroundResource(R.drawable.ramen);
        b2.setBackgroundResource(R.drawable.ramen);
    }
    public void button3(View v) {
        b1.setBackgroundResource(R.drawable.ramen);
        b2.setBackgroundResource(R.drawable.ramen);
        b3.setBackgroundResource(R.drawable.ramen);
    }
    public void button4(View v) {
        b1.setBackgroundResource(R.drawable.ramen);
        b2.setBackgroundResource(R.drawable.ramen);
        b3.setBackgroundResource(R.drawable.ramen);
        b4.setBackgroundResource(R.drawable.ramen);
    }
    public void button5(View v) {
        b1.setBackgroundResource(R.drawable.ramen);
        b2.setBackgroundResource(R.drawable.ramen);
        b3.setBackgroundResource(R.drawable.ramen);
        b4.setBackgroundResource(R.drawable.ramen);
        b5.setBackgroundResource(R.drawable.ramen);
    }
}


