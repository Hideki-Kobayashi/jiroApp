package com.lifeistech.android.jiro_machijikan;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    EditText ninzu;
    TextView machijikan;
    Button go;
    int number;
    String numberText;
    //String machijikanText;
    int machijikanResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ninzu = (EditText) findViewById(R.id.ninzu);
        machijikan = (TextView) findViewById(R.id.machijikan);
        go = (Button) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item);

        adapter.add("三田本店");
        adapter.add("野猿街道店2");
        adapter.add("新宿歌舞伎町店");
        adapter.add("新宿小滝橋通り店");

        //Androidによる選択ダイアログを表示
        // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner s1 = (Spinner) findViewById(R.id.spinner1);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           /* @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(MainActivity.this, String.valueOf(arg0.getSelectedItem()) + "を選択しました。", Toast.LENGTH_LONG).show();
            }*/

            @Override
            public void onNothingSelected(AdapterView parent) {
                // TODO 自動生成されたメソッド・スタブ
            }

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                final String item = (String) spinner.getSelectedItem();{

                    @Override
                    public void onClick (View v){
                    if (item.equals("三田本店")) {
                        public void go (View v){
                            numberText = ninzu.getText().toString();
                            number = Integer.parseInt(numberText);
                            machijikanResult = number * 3;
                            machijikan.setText(String.valueOf(machijikanResult) + "分待ち");

                        }
                    } else if (item.equals("野猿街道2")) {
                        public void go (View v){
                            numberText = ninzu.getText().toString();
                            number = Integer.parseInt(numberText);
                            machijikanResult = number * 3;
                            machijikan.setText(String.valueOf(machijikanResult) + "分待ち");

                        }
                    } else if (item.equals("新宿歌舞伎町店")) {
                        public void go (View v){
                            numberText = ninzu.getText().toString();
                            number = Integer.parseInt(numberText);
                            machijikanResult = number * 5;
                            machijikan.setText(String.valueOf(machijikanResult) + "分待ち");

                        }
                    } else if (item.equals("新宿小滝橋通り店")) {
                        public void go (View v){
                            numberText = ninzu.getText().toString();
                            number = Integer.parseInt(numberText);
                            machijikanResult = number * 3;
                            machijikan.setText(String.valueOf(machijikanResult) + "分待ち");

                        }
                    }
                }
                }
            }
        });
    }

    /*public void go(View v){
        numberText = ninzu.getText().toString();
        number = Integer.parseInt(numberText);
        machijikanResult = number * 2;
        machijikan.setText(String.valueOf(machijikanResult) + "分待ち");
    }*/
    public void star(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
    public void camera (View v){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }


}
