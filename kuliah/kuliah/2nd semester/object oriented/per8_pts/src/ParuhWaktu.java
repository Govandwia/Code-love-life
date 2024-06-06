public class ParuhWaktu extends Pegawai{
    private int lamaJamKerja;
    private double tarifPerJam;

    public ParuhWaktu(String nama, String jabatan, double gajiPokok, int lamaJamKerja, double tarifPerJam){
        super(nama, jabatan, gajiPokok);
        super.setGajiPokok(0);
        this.lamaJamKerja = lamaJamKerja;
        this.tarifPerJam = tarifPerJam;
    }
    
    public double getTakeHomePay() {
        return lamaJamKerja * tarifPerJam;
    }

    @Override
    public String toString() {
        return "------------------------------" + "\n" +
        "nama : " + super.getNama() + "\n" +
        "Status : Pegawai paruh waktu" + "\n" +
        "Jabatan : " + super.getJabatan() + "\n" +
        "tarif per jam : " + tarifPerJam + "\n" +
        "lama jam kerja : " + lamaJamKerja + "\n" +
        "Bonus : " + "null" + "\n" + 
        "Tunjangan : " + "null " + "\n" +
        "Asuransi kesehatan : " + "null" + "\n" +
        "Take home pay : " + getTakeHomePay() + "\n" +
               "------------------------------";

    }
}
