import java.util.Scanner;

public class InputandOutput {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.println("Masukan Kalimat: ");
        String kalimat = in.nextLine();

        String[] tokens = kalimat.split("[^A-Za-z]+");

        int hitungToken = 0;
        for (String token : tokens){
            if(!token.isEmpty()){
                hitungToken++;
            }
        }

        System.out.println(hitungToken);

        for(String token : tokens){
            if(!token.isEmpty()){
                System.out.println(token);
            }
        }
    }
}