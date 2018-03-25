package com.example.wayy.proyektingkat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IsiAbsensiActivity extends AppCompatActivity {
    Button simpanAbsensi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_absensi);

        simpanAbsensi = (Button)findViewById(R.id.simpan_absensi);

        simpanAbsensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(IsiAbsensiActivity.this);
                progressDialog.setTitle("Sedang Menyimpan");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(IsiAbsensiActivity.this, "Berhasil Menyimpan Absensi", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(IsiAbsensiActivity.this, AbsensiActivity.class));
            }
        });
    }
}
