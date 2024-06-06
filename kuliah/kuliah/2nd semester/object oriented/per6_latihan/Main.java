package per6_latihan;

public class Main {
    public static void main(String[] args) {
        Tetap Ina = new Tetap("Ina", 5000000,0);
        Tetap Eko = new Tetap("Eko", 3500000, 0);
        Kontrak Adi = new Kontrak("Adi", 40000, 80);

        System.out.println("=============");
        Ina.rincian();
        Eko.rincian();
        Adi.rincian();

    }
}
