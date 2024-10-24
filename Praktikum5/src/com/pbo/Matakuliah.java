package com.pbo;

public class Matakuliah {
    private String kodeMk;
    private String namaMk;

    public Matakuliah(String kodeMk, String namaMk) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }

    public String toString() {
        return  namaMk + " (" + kodeMk + ")";
    }
}
