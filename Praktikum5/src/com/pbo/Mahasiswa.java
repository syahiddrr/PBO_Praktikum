package com.pbo;

public class Mahasiswa extends Orang {
        private String nim;
        private String jurusan;
        private String kelas;
        private int semester;

        public Mahasiswa(String nama, int umur, String alamat, String nim, String jurusan, String kelas, int semester) {
            super(nama, umur, alamat);
            this.nim = nim;
            this.jurusan = jurusan;
            this.kelas = kelas;
            this.semester = semester;
        }

        public void displayInfo(){
            super.displayinfo();
            System.out.println("NIM: " + nim + ", Jurusan: " + jurusan + ", Kelas: " + kelas + ", Semester: " + semester);
        }

}
