import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int gajiPokok = 500000;
        final int hargaPerBarang = 50000;

        System.out.print("Masukkan Jumlah Penjualan Bulan Ini: ");
        int jumlahPenjualan = in.nextInt();

        int totalPenjualan = jumlahPenjualan * hargaPerBarang;
        double gajiTotal = gajiPokok;

        if (jumlahPenjualan >= 80){
            gajiTotal += 0.35 * totalPenjualan;
        } else if (jumlahPenjualan >= 40) {
            gajiTotal += 0.25 * totalPenjualan;
        } else if (jumlahPenjualan < 15) {
            int kekurangan = 15 - jumlahPenjualan;
            double denda = 0.15 * kekurangan * hargaPerBarang;
            gajiTotal -= denda;
        } else {
            gajiTotal += 0.10 * totalPenjualan;
        }

        System.out.printf("Gaji yang diterima: Rp.%.2f%n", gajiTotal);
    }
}
