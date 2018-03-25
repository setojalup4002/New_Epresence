package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton gr, sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gr=(ImageButton)findViewById(R.id.guru);
        sw=(ImageButton)findViewById(R.id.siswa);

        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grKlik= new Intent(MainActivity.this, GuruLoginActivity.class);
                startActivity(grKlik);
            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginSiswaActivity.class));
            }
        });
    }
}
