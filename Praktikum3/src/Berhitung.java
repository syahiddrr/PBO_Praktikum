import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan (bilangan 1)(+,-,*,/,%)(bilangan 2): ");
        int bil1 = in.nextInt();
        char operasi = in.next().charAt(0);
        int bil2 = in.nextInt();

        int hasil = 0;

        switch (operasi){
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                if (bil2 != 0){
                    hasil = bil1 / bil2;
                } else {
                    System.out.println("Error : operasi pembagian nol akan menghasilkan pembagian tidak valid");
                    return;
                }
                break;
            case '%':
                if (bil2 != 0) {
                    hasil = bil1 % bil2;
                } else {
                    System.out.println("Error : operasi modulus dengan nol akan mengakibatkan modulus tidak valid");
                    return;
                }
                break;
            default:
                System.out.println("silahkan masukan operator yang valid!");
                return;
        }

        System.out.println("Hasil: " +hasil);
    }
}
