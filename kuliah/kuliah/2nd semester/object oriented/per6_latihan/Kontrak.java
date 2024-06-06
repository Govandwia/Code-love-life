package per6_latihan;

public class Kontrak extends Karyawan{
    private int gajiPerJam;
    private int totalJamPerBulan;

    // constructor
    public Kontrak(String nama, int gajiPerJam, int totalJamPerBulan){
        super(nama, gajiPerJam * totalJamPerBulan, 0.02);
        this.totalJamPerBulan = totalJamPerBulan;
        this.gajiPerJam = gajiPerJam;
    }
    
    
    public double getTotalInsentif(){
        return gajiPerJam * totalJamPerBulan * super.getInsentif();
    }
    
    
    @Override
    public void rincian() {
        System.out.println("Nama: " + super.getNama());
        System.out.println("Status: Karyawan kontrak");
        System.out.println("gaji: " + super.getGaji());
        System.out.println("Total bonus: 0" );
        System.out.println("Total insentif: " + (getTotalInsentif()));
        System.out.println("Total gaji: " + (super.getGaji() + getTotalInsentif()));
        System.out.println("-------------------");
    }
    // getter
    public int getGajiPerJam() {
        return gajiPerJam;
    }
    public int getTotalJamPerBulan() {
        return totalJamPerBulan;
    }

    // setter
    public void setGajiPerJam(int gajiPerJam) {
        this.gajiPerJam = gajiPerJam;
    }

    public void setTotalJamPerBulan(int totalJamPerBulan) {
        this.totalJamPerBulan = totalJamPerBulan;
    }
}
