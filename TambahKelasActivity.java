package com.example.wayy.proyektingkat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class TambahKelasActivity extends AppCompatActivity {
    Button addKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_kelas);

        addKelas = (Button)findViewById(R.id.tambah_kelas);
        addKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(TambahKelasActivity.this);
                progressDialog.setTitle("Sedang Menambahkan");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(TambahKelasActivity.this, "Berhasil menambahkan Kelas", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TambahKelasActivity.this, GuruViewActivity.class));
            }
        });
    }

}
