package com.example.wayy.proyektingkat;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Wayy on 3/16/2018.
 */

public class AbsensiAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public AbsensiAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AbsensiPertemuanFragment();
        }else{
            return new AbsensiKeseluruhanFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.absensi_pertemuan);
        }else{
            return mContext.getString(R.string.absensi_keseluruhan);
        }
    }
}
