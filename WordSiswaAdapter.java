package com.example.wayy.proyektingkat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Wayy on 2/25/2018.
 */

public class WordSiswaAdapter extends ArrayAdapter<WordSiswa> {
    public WordSiswaAdapter(@NonNull Context context, ArrayList<WordSiswa> siswa) {
        super(context, 0, siswa);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View dataSiswaView = convertView;
        if(dataSiswaView == null){
            dataSiswaView = LayoutInflater.from(getContext()).inflate(R.layout.data_siswa, parent, false);
        }
        WordSiswa curentWord = getItem(position);
        TextView nisn = (TextView)dataSiswaView.findViewById(R.id.nisn);

        nisn.setText(curentWord.getNisn());

        TextView nama = (TextView)dataSiswaView.findViewById(R.id.nama);

        nama.setText(curentWord.getNama());


        ImageView imageView=(ImageView) dataSiswaView.findViewById(R.id.image);
        //check if an image has provided
        if (curentWord.hasImage()){
            imageView.setImageResource(curentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }
        return dataSiswaView;
    }
}
