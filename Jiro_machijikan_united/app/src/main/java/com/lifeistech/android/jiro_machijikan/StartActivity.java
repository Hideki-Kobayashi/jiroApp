package com.lifeistech.android.jiro_machijikan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Spinner s1 = (Spinner) findViewById(R.id.spinner1);
        final String item = (String) s1.getSelectedItem();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item);

        adapter.add("三田本店");
        adapter.add("野猿街道店2");
        adapter.add("新宿歌舞伎町店");
        adapter.add("新宿小滝橋通り店");

        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
                if (item.equals("三田本店")) {
                    Intent intent = new Intent(StartActivity.this,MitaActivity.class);
                    startActivity(intent);

                } else if (item.equals("野猿街道2")) {
                    Intent intent = new Intent(StartActivity.this,Yaen2Activity.class);
                    startActivity(intent);


                } else if (item.equals("新宿歌舞伎町店")) {
                    Intent intent = new Intent(StartActivity.this,KabukityoActivity.class);
                    startActivity(intent);


                } else if (item.equals("新宿小滝橋通り店")) {
                    Intent intent = new Intent(StartActivity.this,ShinjukunisiActivity.class);
                    startActivity(intent);


                }

            }
            @Override
            public void onNothingSelected(AdapterView parent) {
                // TODO 自動生成されたメソッド・スタブ
            }


        });
    }
}
