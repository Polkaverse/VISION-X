package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class FifthActivity extends AppCompatActivity {
    Timer timer ;
        public Button btnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(FifthActivity.this ,TenthActivity.class);
                startActivity(intent);
                finish();
            }
        },20000);

        btnd  =(Button)findViewById(R.id.button9);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(FifthActivity.this ,TenthActivity.class);
                startActivity(m);
            }
        });



    }
}
