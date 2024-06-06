package per6_latihan;

public class Tetap extends Karyawan{
    // attributes
    private double bonus = 0.2;

    // constructor
    public Tetap(String nama, int gaji, double insentif){
        super(nama, gaji, 0.025);
    }

    // hitung bonus gaji
    public double getTotalBonus(){
        return super.getGaji() * bonus;
    }

    // hitung insentif gaji
    public double getTotalInsentif() {
        return super.getGaji() * super.getInsentif();
    }

    @Override
    public void rincian() {
        System.out.println("Nama: " + super.getNama());
        System.out.println("Status: Karyawan tetap");
        System.out.println("gaji: " + super.getGaji());
        System.out.println("Total bonus: " + (getTotalBonus()));
        System.out.println("Total insentif: " + (getTotalInsentif()));
        System.out.println("Total gaji: " + (getGaji() + getTotalBonus() + getTotalInsentif()));
        System.out.println("-------------------");
    }
}
