package com.example.wayy.proyektingkat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TambahAbsensiActivity extends AppCompatActivity {
    Button subAbs, cancelAbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_absensi);
        subAbs = (Button)findViewById(R.id.submitAbsensi);
        cancelAbs = (Button)findViewById(R.id.batalAbsensi);

        subAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(TambahAbsensiActivity.this);
                progressDialog.setTitle("Sedang Menambahkan");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(TambahAbsensiActivity.this, "Berhasil menambahkan Absensi Baru", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TambahAbsensiActivity.this, AbsensiActivity.class));
            }
        });

        cancelAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TambahAbsensiActivity.this, AbsensiActivity.class));
            }
        });

    }
}
