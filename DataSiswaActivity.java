package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class DataSiswaActivity extends AppCompatActivity {
    Button addSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_siswa);

        ListView listSis=(ListView)findViewById(R.id.listSiswa);

        addSiswa = (Button) findViewById(R.id.addSiswa);

        addSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataSiswaActivity.this, TambahSiswaActivity.class));
            }
        });

        ArrayList<WordSiswa> siswa = new ArrayList<WordSiswa>();
        siswa.add(new WordSiswa("Seto Jalu Priyono", "6706164002", R.drawable.siswa));
        siswa.add(new WordSiswa("Rizky Eka Maulana", "6706164086", R.drawable.siswa));
        siswa.add(new WordSiswa("Wahyu Nurhidayat", "6706160059", R.drawable.siswa));
        siswa.add(new WordSiswa("Bunga Rizkiyani", "6706162050", R.drawable.siswa));
        siswa.add(new WordSiswa("Faisal Amir", "6706160007", R.drawable.siswa));
        siswa.add(new WordSiswa("Khudio Khizari", "6706160058", R.drawable.siswa));
        siswa.add(new WordSiswa("Pepul Apriyanto", "6706160026", R.drawable.siswa));
        siswa.add(new WordSiswa("Bedul Sumarno", "6706162134", R.drawable.siswa));

        WordSiswaAdapter Adapter = new WordSiswaAdapter(this, siswa);
        listSis.setAdapter(Adapter);

        listSis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(DataSiswaActivity.this, IsiSiswaActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(DataSiswaActivity.this, IsiSiswaActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(DataSiswaActivity.this, IsiSiswaActivity.class));
                }else if(position == 3){
                    startActivity(new Intent(DataSiswaActivity.this, IsiSiswaActivity.class));
                }
            }
        });
    }
}
