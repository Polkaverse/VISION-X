package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {
    private Button fbtn,vbtn,abtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        fbtn =(Button)findViewById(R.id.button5);
        vbtn =(Button)findViewById(R.id.button6);
        abtn =(Button)findViewById(R.id.button7);

        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d=new Intent(SixthActivity.this,SeventhActivity.class);
                startActivity(d);
            }
        });

        vbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R=new Intent(SixthActivity.this,EighthActivity.class);
                startActivity(R);
            }
        });

        abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent S=new Intent(SixthActivity.this,EighthActivity.class);
                startActivity(S);
            }
        });
    }
}
