package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GuruLoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button log, forgetPass;
    TextView reg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_login);
        log = (Button)findViewById(R.id.login);
        reg=(TextView)findViewById(R.id.register);
        forgetPass = (Button)findViewById(R.id.forgetPass);

        log.setOnClickListener(this);
        reg.setOnClickListener(this);
        forgetPass.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == reg){
            startActivity(new Intent(GuruLoginActivity.this, RegisterActivity.class));
        } if(view == log){
            startActivity(new Intent(GuruLoginActivity.this, GuruViewActivity.class));
        } if(view == forgetPass){
            startActivity(new Intent(GuruLoginActivity.this, LupaPassGuruActivity.class));
        }
    }

}
