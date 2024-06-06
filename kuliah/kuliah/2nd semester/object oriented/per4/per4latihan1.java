package per4;
// print bil 1-5 menggunakan for;while;do while loop
public class per4latihan1 {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println("End of for loop...");

        // while loop
        int j = 1;
        while (j < 6) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("End of while loop..");

        // do while loop
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 6);
        System.out.println("End of Do while loop.");
    }
}
