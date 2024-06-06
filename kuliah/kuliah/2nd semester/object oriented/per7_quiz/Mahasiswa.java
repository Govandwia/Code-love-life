package per7_quiz;

public class Mahasiswa extends User{
    private int angkatan;
    private String nim;
    private String ikutKelas;

    public Mahasiswa(String nama, int umur, String prodi,String nim, int angkatan) {
        super(nama, umur, prodi);
        this.nim = nim;
        this.angkatan = angkatan;
    }

    @Override
    public String toString() {
        return "Nama Mahasiswa = " + getNama() + "\n" +
               "Prodi = " + getProdi() + "\n" +
               "NIM = " + getNim() + "\n" +
               "ANgkatan = " + getAngkatan() + "\n" +
               "Kelas yang diikuti = " + getIkutKelas() + "\n" +
               "---------------------------------";
    }

    // getter
    public String getNim() {
        return nim;
    }

    public int getAngkatan() {
        return angkatan;
    }
    public String getIkutKelas() {
        return ikutKelas;
    }

    // setter
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setIkutKelas(String ikutKelas) {
        this.ikutKelas = ikutKelas;
    }
}
