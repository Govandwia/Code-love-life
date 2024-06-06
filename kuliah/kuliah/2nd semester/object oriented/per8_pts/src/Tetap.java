public class Tetap extends Pegawai{
    private int tunjangan;
    private double asuransiKesehatan = 30.00;
    private double bonus = 0.04;
    

    public Tetap(String nama, String jabatan, double gajiPokok, int tunjangan){
        super(nama, jabatan, gajiPokok = 550.00);
        this.tunjangan = tunjangan;
    }

    public double getTakeHomePay(){
        return super.getGajiPokok() + tunjangan + getGajiBonus();
    }

    public double getGajiBonus() {
        return (super.getGajiPokok()+tunjangan)* bonus;
    }

    @Override
    public String toString() {
        return "------------------------------" + "\n" +
        "nama : " + super.getNama() + "\n" +
        "Status : Pegawai tetap" + "\n" +
        "Jabatan : " + super.getJabatan() + "\n" +
        "Gaji pokok : " + super.getGajiPokok() + "\n" +
        "Bonus : " + getGajiBonus() + "\n" + 
        "Tunjangan : " + tunjangan + "\n" +
        "Asuransi kesehatan : " + asuransiKesehatan + " (*Dengan keterangan: tanpa potongan gaji)"+ "\n" +
        "Take home pay : " + getTakeHomePay() + "\n" +
               "------------------------------";
    }
    // @Override
    // public void rincian(){
    //     System.out.println("-------------");
    //     System.out.println("nama : " + super.getNama());
    //     System.out.println("Status : Pegawai tetap");
    //     System.out.println("Jabatan : " + super.getJabatan());
    //     System.out.println("Gaji : " + super.getGajiPokok());
    //     System.out.println("Bonus: " + getGajiBonus());
    //     System.out.println("Tunjangan: " + tunjangan);
    //     System.out.println("Asuransi Kesehatan : 30");
    //     System.out.println("Take home pay: "+ getTakeHomePay());
    //     System.out.println("-------------");
    // }
}
