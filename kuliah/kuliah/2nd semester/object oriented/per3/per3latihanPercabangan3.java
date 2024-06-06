package per3;
import java.util.Scanner;

public class per3latihanPercabangan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input harga belanja : ");
        int beli = sc.nextInt();

        if (beli > 100000) {
            System.out.println("Diskon: 10%");
        } else if (beli > 75000 && beli < 100000) {
            System.out.println("Diskon: 8%");
        } else if (beli > 50000 && beli < 75000) {
            System.out.println("Diskon: 5%");
        } else if (beli > 25000 && beli < 50000) {
            System.out.println("Diskon: 3%");
        } else if ( beli <= 25000) {
            System.out.println("Tidak mendapatkan diskon");
        }

        sc.close();
    }
}
