package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LupaPassGuruActivity extends AppCompatActivity {
    Button konfir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_pass_guru);

        konfir = (Button)findViewById(R.id.konfir);

        konfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LupaPassGuruActivity.this, ResetPassActivity.class));
            }
        });
    }
}
