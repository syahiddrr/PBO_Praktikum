package com.pbo;

public class Dosen extends Orang{
    private String nip;

    public Dosen(String nama, int umur, String alamat, String nip) {
        super(nama, umur, alamat);
        this.nip = nip;
    }

    public void displayInfo() {
        super.displayinfo();
        System.out.println("NIP: " + nip);
    }

    public String getNama(){
        return nama;
    }
}
