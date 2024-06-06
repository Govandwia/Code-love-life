public class TidakTetap extends Pegawai{
    private double bonus = 0.04;

    public TidakTetap(String nama, String jabatan, double gajiPokok){
        super(nama, jabatan, gajiPokok = 550.00);
    }

    public double getTakeHomePay() {
        return super.getGajiPokok() + getGajiBonus() - getAsuransiKesehatan();
    }

    public double getGajiBonus() {
        return super.getGajiPokok() * bonus;
    }

    public double getAsuransiKesehatan() {
        double hitung = (super.getGajiPokok() + getGajiBonus()) * 0.1;
        if (hitung > 30.00) {
            return 30.00;
        } else {
            return hitung;
        }
    }

    @Override
    public String toString() {
        return "------------------------------" + "\n" +
        "nama : " + super.getNama() + "\n" +
        "Status : Pegawai tetap" + "\n" +
        "Jabatan : " + super.getJabatan() + "\n" +
        "Gaji pokok : " + super.getGajiPokok() + "\n" +
        "Bonus : " + getGajiBonus() + "\n" + 
        "Tunjangan : " + "tidak mendapat tunjangan" + "\n" +
        "Asuransi kesehatan : " + getAsuransiKesehatan() + "\n" +
        "Take home pay : " + getTakeHomePay() + "\n" +
               "------------------------------";

    }

    // @Override
    // public void rincian(){
    //     System.out.println("nama : " + super.getNama());
    //     System.out.println("Status : Pegawai tetap");
    //     System.out.println("Jabatan : " + super.getJabatan());
    //     System.out.println("Gaji : " + super.getGajiPokok());
    //     System.out.println("Bonus: " + getGajiBonus());
    //     System.out.println("Tunjangan: " + "Tidak mendapat tunjangan");
    //     System.out.println("Asuransi Kesehatan : " + getAsuransiKesehatan());
    //     System.out.println("Take home pay: "+ getTakeHomePay());
    // }

}
