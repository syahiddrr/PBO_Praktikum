package com.pbo;

public class Jadwal {
    private String hari;
    private String jamAwal;
    private String jamAkhir;
    private Dosen dosen;
    private Matakuliah matkul;


    public Jadwal(String hari, String jamAwal, String jamAkhir, Dosen dosen, Matakuliah matkul) {
        this.hari = hari;
        this.jamAwal = jamAwal;
        this.jamAkhir = jamAkhir;
        this.dosen = dosen;
        this.matkul = matkul;
    }

    public void displayJadwal() {
        System.out.println("Hari: " + hari +", Jam:" + jamAwal + "-" + jamAkhir);
        System.out.println("Dosen: " + dosen.getNama() +", Mata Kuliah: " + matkul.toString());
    }
}
