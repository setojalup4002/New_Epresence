package com.example.wayy.proyektingkat;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Wayy on 2/16/2018.
 */
public class DataHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "absensi.db";
    public static final String TABLE_NAME = "registrasi_guru";
    public static final String tb_nama = "nama";
    public static final String tb_user = "user";
    public static final String tb_nip = "nip";
    public static final String tb_nohp = "nohp";
    public static final String tb_password = "password";
    public static final String tb_repassword = "repassword";
    private static final String CREATE_TABLE_REGISTRASI="CREATE TABLE "+TABLE_NAME+"("
            +tb_nama+" text, "+tb_user+" text, "+tb_nip+" text, "+tb_nohp+" text,"
            +tb_password+" text,"+tb_repassword+" text"+")";


    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_REGISTRASI);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void CreateGuru(ModalGuru mdNotif){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(tb_nama, mdNotif.getNama());
        values.put(tb_user, mdNotif.getUser());
        values.put(tb_nip, mdNotif.getNip());
        values.put(tb_nohp, mdNotif.getNohp());
        values.put(tb_password, mdNotif.getPassword());
        values.put(tb_repassword, mdNotif.getRepassword());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
}
