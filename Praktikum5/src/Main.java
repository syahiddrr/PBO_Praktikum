import com.pbo.*;

public class Main {
    public static void main(String[] args){
        Mahasiswa[] mahasiswaList = new Mahasiswa[10];
        mahasiswaList[0] = new Mahasiswa("Muammar",19, "Ciwaruga", "231511052", "Teknik Informatika", "2B", 2);
        mahasiswaList[1] = new Mahasiswa("Syahid",20, "Sarijadi", "231511053", "Teknik Informatika", "2B", 2);
        mahasiswaList[2] = new Mahasiswa("Rahmallah",18, "Kebon Kolot", "231511054", "Teknik Informatika", "2B", 2);
        mahasiswaList[3] = new Mahasiswa("Nalendra",19, "Cimahi", "231511055", "Teknik Informatika", "2B", 2);
        mahasiswaList[4] = new Mahasiswa("Praja",21, "Subang", "231511056", "Teknik Informatika", "2B", 2);
        mahasiswaList[5] = new Mahasiswa("Miladi",19, "Bekasi", "231511057", "Teknik Informatika", "2B", 2);
        mahasiswaList[6] = new Mahasiswa("Fandi",19, "Kota Baru", "231511058", "Teknik Informatika", "2B", 2);
        mahasiswaList[7] = new Mahasiswa("Luthfi",19, "Kota Baru", "231511059", "Teknik Informatika", "2B", 2);
        mahasiswaList[8] = new Mahasiswa("Keenan",19, "Kota Baru", "231511060", "Teknik Informatika", "2B", 2);
        mahasiswaList[9] = new Mahasiswa("Fahmi",19, "Subang", "231511061", "Teknik Informatika", "2B", 2);

        Dosen[] dosenList = new Dosen[10];
        dosenList[0] = new Dosen("Yudi Widiasana", 52, "Jl.Diponegoro", "KO013N");
        dosenList[1] = new Dosen("Santi Sundari", 49, "Jl.Kartini", "KO014N");
        dosenList[2] = new Dosen("Trisna Gelar", 50, "Jl.Merdeka", "KO015N");
        dosenList[3] = new Dosen("Ade Hodijah", 47, "Jl.Gajah Mada", "KO016N");
        dosenList[4] = new Dosen("Muhammad Rizqi", 45, "Jl.Sudirman", "KO017N");
        dosenList[5] = new Dosen("Bambang Wisnuadhi", 55, "Jl.Ahmad Yani", "KO018N");
        dosenList[6] = new Dosen("Ade Chandra", 57, "Jl.Pemuda", "KO019N");
        dosenList[7] = new Dosen("Zulkifli Arsyad", 46, "Jl.Pahlawan", "KO020N");
        dosenList[8] = new Dosen("Siti Dwi", 47, "Jl.Cikutra Raya", "KO021N");
        dosenList[9] = new Dosen("Yadhi Aditya", 53, "Jl.Baru", "KO022N");

        Matakuliah[] matkulList = new Matakuliah[7];
        matkulList[0] = new Matakuliah("21IF2015", "Komputer Grafik");
        matkulList[1] = new Matakuliah("21IF2016", "Pengantar Rekayasa Perangkat Lunak");
        matkulList[2] = new Matakuliah("21IF2017", "Basis Data");
        matkulList[3] = new Matakuliah("21IF2018", "Aljabar Linear");
        matkulList[4] = new Matakuliah("21IF2019", "Proyek 3");
        matkulList[5] = new Matakuliah("21IF2020", "Pemrograman Berbasis Objek");
        matkulList[6] = new Matakuliah("21IF2021", "Matematika Diskrit 2");

        Jadwal[] jadwalList = new Jadwal[5];
        jadwalList[0] = new Jadwal("Senin", "8.40", "10.40",dosenList[0],matkulList[0]);
        jadwalList[1] = new Jadwal("Selasa", "7.00", "9.40",dosenList[3],matkulList[2]);
        jadwalList[2] = new Jadwal("Rabu", "10.40", "12.20",dosenList[5],matkulList[4]);
        jadwalList[3] = new Jadwal("Kamis", "9.30", "11.40",dosenList[8],matkulList[6]);
        jadwalList[4] = new Jadwal("Jumat", "7.00", "14.40",dosenList[9],matkulList[1]);

        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs != null) {
                mhs.displayInfo();
                System.out.println();
            }
        }

        System.out.println("Data Dosen:");
        for (Dosen dosen : dosenList) {
            if (dosen != null) {
                dosen.displayInfo();
                System.out.println();
            }
        }

        System.out.println("Jadwal Perkuliahan:");
        for (Jadwal jadwal : jadwalList) {
            if (jadwal != null) {
                jadwal.displayJadwal();
                System.out.println();
            }
        }
    }
}