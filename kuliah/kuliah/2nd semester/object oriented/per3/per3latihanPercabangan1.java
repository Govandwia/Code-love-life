package per3;
import java.util.Scanner;

public class per3latihanPercabangan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hari = sc.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jum'at");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
        }

        sc.close();
    }
}
