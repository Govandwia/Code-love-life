package per6;

public class Cow extends Animal{
    public Cow(String warna, int jumlahKaki) {
        super(warna, jumlahKaki);
    }

    @Override
    public void tidur() {
        System.out.println("p turu");
    } 
}
