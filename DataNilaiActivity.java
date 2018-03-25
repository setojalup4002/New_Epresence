package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DataNilaiActivity extends AppCompatActivity {
    Button btnNilai;
    ListView listN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_nilai);
        listN = (ListView)findViewById(R.id.isiNilai);

        btnNilai = (Button)findViewById(R.id.btnNilai);

        btnNilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataNilaiActivity.this, TambahNilaiActivity.class));
            }
        });

        String jenis_nilai[]={"Ulangan Harian 1","UTS","Tugas Mingguan","Uas"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, jenis_nilai);
        listN.setAdapter(Adapter);

        listN.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(DataNilaiActivity.this, IsiNilaiActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(DataNilaiActivity.this, IsiNilaiActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(DataNilaiActivity.this, IsiNilaiActivity.class));
                }else if(position == 3){
                    startActivity(new Intent(DataNilaiActivity.this, IsiNilaiActivity.class));
                }
            }
        });
    }
}
