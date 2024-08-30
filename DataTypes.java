import  java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Angka yang akan di cek : ");
        long angka = in.nextLong();


        if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE){
            System.out.println(angka + " bisa masuk kedalam tipe data Byte");
        } else {
            System.out.println(angka + " tidak bisa masuk ke tipe data Byte");
        }

        if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE){
            System.out.println(angka + " bisa masuk kedalam tipe data Integer");
        } else {
            System.out.println(angka + " tidak bisa masuk ke tipe data Integer");
        }

        if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE){
            System.out.println(angka + " bisa masuk kedalam tipe data Long");
        } else {
            System.out.println(angka + " tidak bisa masuk ke tipe data Long");
        }

        if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE){
            System.out.println(angka + " bisa masuk kedalam tipe data Short");
        } else {
            System.out.println(angka + " tidak bisa masuk ke tipe data Short");
        }
    }
}