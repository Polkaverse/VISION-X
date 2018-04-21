package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecActivity extends AppCompatActivity {
    private Button btn, btnof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        btnof =(Button)findViewById(R.id.button3);
        btn =(Button)findViewById(R.id.button); // next activity

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(SecActivity.this,ThirdActivity.class);
                startActivity(p);
            }
        });

        btnof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SecActivity.this,SixthActivity.class);
                startActivity(i);
            }
        });
    }
}
