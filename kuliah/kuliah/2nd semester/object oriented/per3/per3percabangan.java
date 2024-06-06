package per3;
import java.util.Scanner;

public class per3percabangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        // if statement

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // switch case
        switch (time) {
            case 8:
                System.out.println("good morning");
                break;
            case 12 :
                System.out.println("good evening");
                break;
            case 16:
                System.out.println("good afternoon");
                break;
            case 21:
                System.out.println("good night");
                break;
            default:
                System.out.println("lah");
                break;
        }


        sc.close();
    }
}
