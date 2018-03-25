package com.example.wayy.proyektingkat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IsiSiswaActivity extends AppCompatActivity {
    Button save, delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_siswa);

        save = (Button)findViewById(R.id.simpan_absensi);
        delete = (Button)findViewById(R.id.hapus_siswa);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(IsiSiswaActivity.this);
                progressDialog.setTitle("Sedang Membuat Perubahan");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(IsiSiswaActivity.this, "Data Berhasil di Ubah", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(IsiSiswaActivity.this, DataSiswaActivity.class));
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(IsiSiswaActivity.this);
                progressDialog.setTitle("Sedang Menghapus Data");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(IsiSiswaActivity.this, "Data Berhasil di Hapus", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(IsiSiswaActivity.this, DataSiswaActivity.class));
            }
        });
    }
}
