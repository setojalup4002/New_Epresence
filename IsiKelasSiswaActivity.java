package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IsiKelasSiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_kelas_siswa);
        ListView isiKelasSiswa=(ListView)findViewById(R.id.isiKelasSiswa);

        String isiKelas[]={"Absensi","Nilai Saya","Inforamasi Guru"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, isiKelas);
        isiKelasSiswa.setAdapter(Adapter);

        isiKelasSiswa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(IsiKelasSiswaActivity.this, AbsensiSiswaActivity.class));
                } else if (position == 1) {
                    startActivity(new Intent(IsiKelasSiswaActivity.this, NilaiSiswaActivity.class));
                } else if(position == 2){
                    startActivity(new Intent(IsiKelasSiswaActivity.this, InformasiGuruActivity.class));
                }
            }
        });
    }
}
