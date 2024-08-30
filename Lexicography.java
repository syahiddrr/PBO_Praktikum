import java.util.Scanner;

public class Lexicography {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan kata pertama : ");
        String katapertama = in.nextLine();

        System.out.print("Masukan kata kedua : ");
        String katakedua = in.nextLine();

        String combine = katapertama + " " + katakedua;

        int length = combine.length();
        boolean hasillexico = katapertama.compareTo(katakedua) > 0;

        System.out.println(length);
        System.out.print("Apakah kata pertama lebih besar dari kata kedua : " + hasillexico);
    }
}
