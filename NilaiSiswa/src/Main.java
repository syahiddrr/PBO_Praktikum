import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Nilai Tugas : ");
        float nilaiTugas = in.nextFloat();
        System.out.print("Masukan Nilai UTS : ");
        float nilaiUTS = in.nextFloat();
        System.out.print("Masukan Nilai UAS : ");
        float nilaiUAS = in.nextFloat();
        float nilaiAkhir = ((20*nilaiTugas)/100 ) + ((35*nilaiUTS)/100) + ((45*nilaiUAS)/100);
        String Grade;

        if(nilaiAkhir >= 80){
            Grade = "A";
        } else if (nilaiAkhir >= 75) {
            Grade = "B";
        } else if (nilaiAkhir >= 65) {
            Grade = "C";
        } else if (nilaiAkhir >= 49) {
            Grade = "D";
        } else {
            Grade = "E";
        }
        System.out.println("Nilai akhir anda : " +nilaiAkhir);
        System.out.print("Grade Anda : " + Grade);
    }
}