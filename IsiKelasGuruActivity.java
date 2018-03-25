package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IsiKelasGuruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_kelas_guru);
        ListView isiKelasGuru=(ListView)findViewById(R.id.isiKelasGuru);

        String isiKelas[]={"Data Siswa","Absensi","Data Nilai Siswa"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, isiKelas);
        isiKelasGuru.setAdapter(Adapter);

        isiKelasGuru.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(IsiKelasGuruActivity.this, DataSiswaActivity.class));
                } else if (position == 1) {
                    startActivity(new Intent(IsiKelasGuruActivity.this, AbsensiActivity.class));
                } else if (position == 2) {
                    startActivity(new Intent(IsiKelasGuruActivity.this, DataNilaiActivity.class));
                }
            }
        });
    }
}
