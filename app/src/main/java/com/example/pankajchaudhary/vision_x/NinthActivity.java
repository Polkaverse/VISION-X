package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class NinthActivity extends AppCompatActivity {
    Timer timer;
        public Button btnk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(NinthActivity.this ,EleventhActivity.class);
                startActivity(intent);
                finish();
            }
        },20000);

        btnk  =(Button)findViewById(R.id.button99);
        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(NinthActivity.this ,EleventhActivity.class);
                startActivity(m);
            }
        });
    }
}
