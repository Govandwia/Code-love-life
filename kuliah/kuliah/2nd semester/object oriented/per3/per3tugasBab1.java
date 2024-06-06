package per3;
import java.util.Scanner;

public class per3tugasBab1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 8;
    // int guess = sc.nextInt();

    // guess once;
    // if (guess == num) {
    //     System.out.println("tebakan benar");
    // } else {
    //     System.out.println("tebakan salah");
    //     if (guess > num) {
    //         System.out.println("tebakan terlalu besar");
    //     } else if (guess < num) {
    //         System.out.println("tebakan terlalu kecil");
    //     }
    // }
    
    // guess until true;
    while(true) {
        int guess = sc.nextInt();
        if (guess == num) {
            System.out.println("benar");
            break;
        } else {
            System.out.println("tebakan salah");
            if (guess > num) {
                System.out.println("tebakan terlalu besar");
            } else if (guess < num) {
                System.out.println("tebakan terlalu kecil");
            }
        }
    }
    sc.close();
 }   
}
