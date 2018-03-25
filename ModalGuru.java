package com.example.wayy.proyektingkat;

/**
 * Created by Wayy on 2/16/2018.
 */

public class ModalGuru {
    private String nama,user,nip,nohp,password,repassword;

    public ModalGuru(String nama, String user, String nip, String nohp, String password, String repassword) {
        this.nama = nama;
        this.user = user;
        this.nip = nip;
        this.nohp = nohp;
        this.password = password;
        this.repassword = repassword;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNohp() {
        return this.nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return this.repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}
