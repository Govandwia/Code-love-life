package per3;
import java.util.Scanner;

public class per3latihanPercabangan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char huruf = 'K';
        // input char
        System.out.println("Di antara huruf A sampai Z.");
        System.out.println("Tebak satu huruf: ...");
        char tebakan = sc.next().charAt(0);
        
        if (tebakan == huruf) {
            System.out.println("Benar");
        } else {
            System.out.println("SALAHHHH");
        }

        sc.close();
    }
}
