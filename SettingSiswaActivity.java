package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingSiswaActivity extends AppCompatActivity {
    Button saveSetSiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_siswa);

        saveSetSiswa = (Button)findViewById(R.id.saveDataSiswa);

        saveSetSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingSiswaActivity.this, SiswaViewActivity.class));
                Toast.makeText(SettingSiswaActivity.this, "Data Berhasil Di Simpan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
