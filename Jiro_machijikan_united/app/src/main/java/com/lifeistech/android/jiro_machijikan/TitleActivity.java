package com.lifeistech.android.jiro_machijikan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TitleActivity extends AppCompatActivity {
    Runnable moveToStartActivity;
    Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        //android.app.ActionBar actionBar = getActionBar();
        //actionBar.hide();
        getSupportActionBar().hide();

        // ここをスレッドにする意味はない？スプラッシュ画面かな？
        moveToStartActivity = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TitleActivity.this, StartActivity.class);
                startActivity(intent);
                finish();
            }
        };

        h = new Handler();
        h.postDelayed(moveToStartActivity, 3000);



    }
}
