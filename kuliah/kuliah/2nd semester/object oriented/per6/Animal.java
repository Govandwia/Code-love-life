package per6;

public class Animal {
    int jumlahKaki;
    String warna;
    

    public Animal(String warna, int jumlahKaki) {
        this.warna = warna;
        this.jumlahKaki = jumlahKaki;
    }

    public void tidur() {
        System.out.println("Zzz..");
    }


    public void suara(){
        System.out.println("Noise");
    }
    // ovrload
    public void suara(int jumlah){
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Noise ");
        }
    }
}
