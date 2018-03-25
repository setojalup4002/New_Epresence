package com.example.wayy.proyektingkat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TambahNilaiActivity extends AppCompatActivity {
    Button addNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_nilai);
        addNilai = (Button)findViewById(R.id.tambah_nilai);
        addNilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(TambahNilaiActivity.this);
                progressDialog.setTitle("Sedang Menambahkan");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(TambahNilaiActivity.this, "Berhasil menambahkan Jenis Nilai", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TambahNilaiActivity.this, DataNilaiActivity.class));
            }
        });
    }
}
