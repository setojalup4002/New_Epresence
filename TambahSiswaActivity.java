package com.example.wayy.proyektingkat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TambahSiswaActivity extends AppCompatActivity {
    Button addSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_siswa);

        addSiswa = (Button)findViewById(R.id.tambah_siswa);
        addSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(TambahSiswaActivity.this);
                progressDialog.setTitle("Sedang Menambahkan");
                progressDialog.setMessage("Harap tunggu sebentar...");
                progressDialog.show();
                Toast.makeText(TambahSiswaActivity.this, "Berhasil menambahkan Siswa", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TambahSiswaActivity.this, DataSiswaActivity.class));
            }
        });
    }
}
