package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class SiswaViewActivity extends AppCompatActivity {
    Button setSiswa, logoutSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_view);
        ListView kSiswa=(ListView)findViewById(R.id.kelasSiswa);

        setSiswa = (Button)findViewById(R.id.settingSiswa);
        logoutSiswa = (Button)findViewById(R.id.logoutSiswa);

        setSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SiswaViewActivity.this, SettingSiswaActivity.class));
            }
        });

        logoutSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SiswaViewActivity.this, LoginSiswaActivity.class));
                Toast.makeText(SiswaViewActivity.this, "Berhasil Logout", Toast.LENGTH_SHORT).show();
            }
        });

        String isiKelas[]={"XII IPA 3 : Fisika","XII IPA 3 : Bahasa Indonesia"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, isiKelas);
        kSiswa.setAdapter(Adapter);

        kSiswa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(SiswaViewActivity.this, IsiKelasSiswaActivity.class));
                } else if (position == 1) {
                    startActivity(new Intent(SiswaViewActivity.this, IsiKelasSiswaActivity.class));
                }
            }
        });
    }
}
