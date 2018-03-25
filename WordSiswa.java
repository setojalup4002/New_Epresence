package com.example.wayy.proyektingkat;

/**
 * Created by Wayy on 2/25/2018.
 */

public class WordSiswa {
    private String nama, nisn;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    //constant value to represent no image
    private static final int NO_IMAGE_PROVIDED = -1;

    public WordSiswa(String nama, String nisn, int imageResourceId) {
        this.nama = nama;
        this.nisn = nisn;
        mImageResourceId = imageResourceId;
    }

    public String getNama() {
        return nama;
    }

    public String getNisn() {
        return nisn;
    }

    public int getImageResourceId (){
        return mImageResourceId;
    }

    public boolean hasImage (){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
