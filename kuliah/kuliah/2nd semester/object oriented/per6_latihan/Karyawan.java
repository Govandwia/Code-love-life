package per6_latihan;

public class Karyawan {
    private String nama;
    private int gaji;
    private double insentif;

    // constructor
    public Karyawan(String nama, int gaji, double insentif) {
        this.nama = nama;
        this.gaji = gaji;
        this.insentif = insentif;
    }  


    // getter
    public int getGaji() {
        return gaji;
    }
    public String getNama() {
        return nama;
    }

    public double getInsentif() {
        return insentif;
    }


    // setter
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setInsentif(double insentif) {
        this.insentif = insentif;
    }



    
    public void rincian() {
        System.out.println("Nama: " + nama +", Gaji:" + gaji);
    }

}
