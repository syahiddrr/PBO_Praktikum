import java.util.Scanner;
public class InputandOutput2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa jumlah kata yang ingin dimasukan: ");
        int jumlah = in.nextInt();
        String[] kata = new String[jumlah];
        int[] angka = new int[jumlah];
        for (int i = 0; i < jumlah; i++){
            System.out.println("Masukan kata ke-" + (i+1) + ": ");
            kata[i] = in.next();
            System.out.println("Masukan angka ke-" + (i+1) + ": ");
            angka[i] = in.nextInt();
        }
        System.out.println("==============================");
        for (int i = 0; i < jumlah; i++){
            System.out.printf("%-15s%03d%n" ,kata[i], angka[i]);
        }
        System.out.println("==============================");
    }
}
