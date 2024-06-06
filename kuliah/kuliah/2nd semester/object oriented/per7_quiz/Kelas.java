package per7_quiz;

public class Kelas {
    private String kode;
    private String mataKuliah;
    private int jumlahMahasiswaMax;
    private String hari;
    int counterMahasiswa;
    
    boolean isPenuh;
    
    Mahasiswa mahasiswa;
    Dosen dosen;


    public Kelas(String kode, String mataKuliah,Dosen dosen, int jumlahMahasiswaMax, String hari) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.jumlahMahasiswaMax = jumlahMahasiswaMax;
        this.hari = hari;
        isPenuh = false;
        counterMahasiswa = 0;
        this.dosen = dosen;
    }

    @Override
    public String toString() {
        return "Kelas = " + getKode() + "\n" +
               "Mata Kuliah = " + getMataKuliah() + "\n" +
               "Kapasitas = " + getJumlahMahasiswaMax() + "\n" +
               "Dosen pengampu = " + dosen.getNama() + "\n" +
               "List Siswa = " + "" + "\n" + //kurnag list ny
               "---------------------------------";
    }
    

    // method enroll
    public void enroll(Mahasiswa mahasiswa){
        if (isPenuh == true) {
            System.out.println("Gagal mendaftarkan "  +" ke kelas " + getMataKuliah() + " karena kelas penuh");
        } else if (counterMahasiswa == jumlahMahasiswaMax) {
            System.out.println("Gagal mendaftarkan "  +" ke kelas " + getMataKuliah() + " karena kelas penuh");
        } 
        else {
            counterMahasiswa++;
            mahasiswa.setIkutKelas(getMataKuliah());
            System.out.println(mahasiswa.getIkutKelas());
            System.out.println("Berhasil mendaftarkan " + mahasiswa +" ke kelas " + getMataKuliah());
        }
    }

    // getter
    public String getHari() {
        return hari;
    }
    public int getJumlahMahasiswaMax() {
        return jumlahMahasiswaMax;
    }
    public String getKode() {
        return kode;
    }
    public String getMataKuliah() {
        return mataKuliah;
    }

    // setter
    public void setHari(String hari) {
        this.hari = hari;
    }
    public void setJumlahMahasiswaMax(int jumlahMahasiswaMax) {
        this.jumlahMahasiswaMax = jumlahMahasiswaMax;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
}
