package com.example.wayy.proyektingkat;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AbsensiPertemuanFragment extends Fragment {


    public AbsensiPertemuanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_absensi_pertemuan, container, false);

        Button addAbsensi;

        addAbsensi = (Button)rootView.findViewById(R.id.tambah_absensi);
        addAbsensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TambahAbsensiActivity.class));
            }
        });

        ListView isiAbsen=(ListView)rootView.findViewById(R.id.isiAbsensi);

        String isiAbsensi[]={"Jum'at, 23 Jan 2018","Jum'at, 30 Jan 2018","Senin, 5 Feb 2018","Jum'at, 9 Feb 2018"};

        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
                android.R.id.text1, isiAbsensi);
        isiAbsen.setAdapter(Adapter);

        isiAbsen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(getActivity(), IsiAbsensiActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(getActivity(), IsiAbsensiActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(getActivity(), IsiAbsensiActivity.class));
                }else if(position == 3){
                    startActivity(new Intent(getActivity(), IsiAbsensiActivity.class));
                }
            }
        });
        return rootView;
    }

}
