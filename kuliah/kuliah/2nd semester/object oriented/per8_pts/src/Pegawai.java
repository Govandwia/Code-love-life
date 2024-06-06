public class Pegawai {
    private String nama;
    private String jabatan;
    private double gajiPokok = 550.00;

    public Pegawai (String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public void rincian() {
        System.out.println("Nama: " + nama +", Gaji:" + gajiPokok);
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public String getJabatan() {
        return jabatan;
    }
    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
