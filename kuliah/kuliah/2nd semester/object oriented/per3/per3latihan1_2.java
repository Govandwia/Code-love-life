package per3;
import java.util.Scanner;

public class per3latihan1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas = sc.nextInt();
        int tinggi = sc.nextInt();
        double luas = (alas * tinggi)/2;

        System.out.println(luas);
        sc.close();
        // jangan lupa di close input(sc) nya
    }
}
