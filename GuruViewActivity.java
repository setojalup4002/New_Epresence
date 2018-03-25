package com.example.wayy.proyektingkat;

import android.content.Intent;
import android.icu.util.ValueIterator;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class GuruViewActivity extends AppCompatActivity{
    Button btnKelas;
    Button setting, logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_view);


        ListView listKelas=(ListView)findViewById(R.id.listKelas);
        btnKelas = (Button)findViewById(R.id.buttonKelas);
        btnKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuruViewActivity.this, TambahKelasActivity.class));
            }
        });

        setting = (Button)findViewById(R.id.setting);
        logout = (Button)findViewById(R.id.logout);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuruViewActivity.this, SettingGuruActivity.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuruViewActivity.this, GuruLoginActivity.class));
                Toast.makeText(GuruViewActivity.this, "Berhasil Logout", Toast.LENGTH_SHORT).show();
            }
        });

        String kelas[]={"XII IPS 3 : Matematika Keuangan","XI IPS 2 : Sejarah","X IPA 2 : Bahasa Indonesia","XII IPA 4 : Fisika"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, kelas);
        listKelas.setAdapter(Adapter);

        listKelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(GuruViewActivity.this, IsiKelasGuruActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(GuruViewActivity.this, IsiKelasGuruActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(GuruViewActivity.this, IsiKelasGuruActivity.class));
                }else if(position == 3){
                    startActivity(new Intent(GuruViewActivity.this, IsiKelasGuruActivity.class));
                }
            }
        });

    }


}
