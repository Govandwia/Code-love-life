package per4;
import java.lang.Math;

public class per4latihan4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            double square = Math.sqrt(i);
            System.out.println("Akar dari " + i + " adalah " + square);
            System.out.println("Error adalah " + (i - (square * square)));
            System.out.println(" ");
        }
    }
}
