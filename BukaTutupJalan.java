import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan nomor plat untuk 4 mobil (pisahkan dengan spasi):");
        String platMobil1 = in.next();
        String platMobil2 = in.next();
        String platMobil3 = in.next();
        String platMobil4 = in.next();

        String gabungPlat = platMobil1 + platMobil2 + platMobil3 + platMobil4;
        long platgabungan = Long.parseLong(gabungPlat);

        if ((platgabungan - 999999) % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
