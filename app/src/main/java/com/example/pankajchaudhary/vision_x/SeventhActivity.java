package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeventhActivity extends AppCompatActivity {
        private Button  btns ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        btns =(Button)findViewById(R.id.button8);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g= new Intent(SeventhActivity.this,NinthActivity.class);
                startActivity(g);
            }
        });
    }
}
