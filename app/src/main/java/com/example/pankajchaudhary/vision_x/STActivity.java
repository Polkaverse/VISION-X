package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class STActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);

        new Handler().postDelayed(new Runnable() {       // opening screen
            @Override
            public void run() {
                Intent homeIntent=new Intent(STActivity.this,MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
