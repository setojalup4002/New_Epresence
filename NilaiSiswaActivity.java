package com.example.wayy.proyektingkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NilaiSiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai_siswa);
        ListView listNSiswa=(ListView)findViewById(R.id.listNilaiSiswa);

        String isiNilai[]={"Tugas Bab 1 \nScore : 90","Tugas Bab 2 \nScore : 80","Ulangan Harian 1 \nScore : 82"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, isiNilai);
        listNSiswa.setAdapter(Adapter);
    }
}
