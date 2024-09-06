import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    private String namaMakanan;
    private String namaMinuman;

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }
}

class Pesanan {
    private String namaBarang;
    private int hargaBarang;
    private int jumlah;

    public Pesanan(String namaBarang, int hargaBarang, int jumlah) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlah = jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int hitungTotalHarga() {
        return hargaBarang * jumlah;
    }
}

class Pembeli {
    private String namaPembeli;

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }
}

public class Kantin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pembeli pembeli = new Pembeli();
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

        System.out.println("Masukkan Nama anda: ");
        String namaPembeli = in.nextLine();
        pembeli.setNamaPembeli(namaPembeli);

        boolean pesanMakananLagi = true;
        while (pesanMakananLagi) {
            System.out.println("Pilih Makanan Yang Ingin dibeli: ");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Ayam Goreng");
            System.out.println("4. Batagor");
            System.out.println("5. Nasi Katsu");
            String pilihanMakanan = in.nextLine();

            int hargaMakanan = 0;
            switch (pilihanMakanan.toLowerCase()) {
                case "nasi goreng":
                    hargaMakanan = 15000;
                    break;
                case "mie goreng":
                    hargaMakanan = 10000;
                    break;
                case "ayam goreng":
                    hargaMakanan = 18000;
                    break;
                case "batagor":
                    hargaMakanan = 10000;
                    break;
                case "nasi katsu":
                    hargaMakanan = 15000;
                    break;
                default:
                    System.out.println("Makanan Tidak Ada");
                    continue;
            }

            System.out.println("Berapa jumlah yang ingin dibeli?");
            int jumlahMakanan = in.nextInt();
            in.nextLine();

            daftarPesanan.add(new Pesanan(pilihanMakanan, hargaMakanan, jumlahMakanan));

            System.out.println("Ingin memesan makanan lagi? (ya/tidak)");
            pesanMakananLagi = in.nextLine().equalsIgnoreCase("ya");
        }

        // Proses pemesanan minuman
        boolean pesanMinumanLagi = true;
        while (pesanMinumanLagi) {
            System.out.println("Pilih Minuman Yang Ingin dibeli: ");
            System.out.println("1. Es Teh");
            System.out.println("2. Es Kopi Susu");
            System.out.println("3. Es Campur");
            System.out.println("4. Es Kelapa");
            System.out.println("5. Es Jeruk");
            String pilihanMinuman = in.nextLine();

            int hargaMinuman = 0;
            switch (pilihanMinuman.toLowerCase()) {
                case "es teh":
                    hargaMinuman = 5000;
                    break;
                case "es kopi susu":
                    hargaMinuman = 10000;
                    break;
                case "es campur":
                    hargaMinuman = 8000;
                    break;
                case "es kelapa":
                    hargaMinuman = 10000;
                    break;
                case "es jeruk":
                    hargaMinuman = 5000;
                    break;
                default:
                    System.out.println("Minuman Tidak Ada");
                    continue;
            }

            System.out.println("Berapa jumlah yang ingin dibeli?");
            int jumlahMinuman = in.nextInt();
            in.nextLine();

            daftarPesanan.add(new Pesanan(pilihanMinuman, hargaMinuman, jumlahMinuman));

            System.out.println("Ingin memesan minuman lagi? (ya/tidak)");
            pesanMinumanLagi = in.nextLine().equalsIgnoreCase("ya");
        }

        System.out.println("\n--- Detail Pembelian ---");
        System.out.println("Nama Pembeli: " + pembeli.getNamaPembeli());

        int totalHarga = 0;
        for (Pesanan pesanan : daftarPesanan) {
            System.out.println(pesanan.getNamaBarang() + " - Rp" + pesanan.getHargaBarang() + " x " + pesanan.getJumlah() + " = Rp" + pesanan.hitungTotalHarga());
            totalHarga += pesanan.hitungTotalHarga();
        }

        System.out.println("Total Harga: Rp" + totalHarga);
    }
}
