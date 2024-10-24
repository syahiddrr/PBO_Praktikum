package com.pbo;

public class Orang {
    protected String nama;
    protected int umur;
    protected String alamat;

    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void displayinfo(){
        System.out.println("Nama: " + nama +", umur: " + umur +", Alamat: " + alamat);
    }
}
