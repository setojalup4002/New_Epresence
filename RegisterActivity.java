package com.example.wayy.proyektingkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class RegisterActivity extends AppCompatActivity {
    EditText etName, etUser, etNip, etNohp, etPassword, etRePassword;
    Button daftar;
    DataHelper db;
    String nama, user, nip, nohp, password, rePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DataHelper(this);

        etName = (EditText)findViewById(R.id.addNama);
        etUser = (EditText)findViewById(R.id.addUser);
        etNip = (EditText)findViewById(R.id.addNip);
        etNohp = (EditText)findViewById(R.id.addNohp);
        etPassword = (EditText)findViewById(R.id.addPassword);
        etRePassword = (EditText)findViewById(R.id.addRePassword);
        daftar = (Button)findViewById(R.id.daftar);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validasiData() && cekPw()){
                    register();
                }
            }
        });
    }

    public void register(){
        etName.setText("");
        etUser.setText("");
        etNip.setText("");
        etNohp.setText("");
        etPassword.setText("");
        etRePassword.setText("");
        Toast.makeText(RegisterActivity.this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
        db.CreateGuru(new ModalGuru(nama, user, nip, nohp, password, rePassword));
    }


    public boolean validasiData(){
        boolean val=false;

        nama=etName.getText().toString();
        user=etUser.getText().toString();
        nip=etNip.getText().toString();
        nohp=etNohp.getText().toString();
        password=etPassword.getText().toString();
        rePassword=etRePassword.getText().toString();

        if(nama.isEmpty() || user.isEmpty() || nip.isEmpty() || nohp.isEmpty() ||
                password.isEmpty() || rePassword.isEmpty()){
            Toast.makeText(this, "Form Harus Terisi Semua", Toast.LENGTH_SHORT).show();

        }else{
            val=true;
        }
        return val;
    }

    public boolean cekPw(){
        boolean cek=false;
        String cekPassword=etPassword.getText().toString();
        String cekRePassword=etRePassword.getText().toString();
        if(!cekPassword.equals(cekRePassword)){
            Toast.makeText(this, "Password tidak sama, ulangi lagi !!", Toast.LENGTH_SHORT).show();
        }else{
            cek = true;
        }
        return cek;
    }
}
