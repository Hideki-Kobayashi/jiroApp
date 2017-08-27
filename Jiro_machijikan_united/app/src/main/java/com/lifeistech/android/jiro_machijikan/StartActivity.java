package com.lifeistech.android.jiro_machijikan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


    }
    public void mita(View v){
        Intent intent = new Intent(this,MitaActivity.class);
        startActivity(intent);
    }
    public void yaen2(View v){
        Intent intent = new Intent(this,Yaen2Activity.class);
        startActivity(intent);
    }
    public void kabukityou(View v){
        Intent intent = new Intent(this,KabukityoActivity.class);
        startActivity(intent);
    }
    public void shinjukunishi(View v){
        Intent intent = new Intent(this,ShinjukunisiActivity.class);
        startActivity(intent);
    }
}
