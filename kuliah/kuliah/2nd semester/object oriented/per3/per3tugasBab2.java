package per3;
import java.util.Scanner;

public class per3tugasBab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("-");
        System.out.println("Inputkan tiga string yang diikut '-'' di tiap kata: ");
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());

        sc.close();
    }
}
