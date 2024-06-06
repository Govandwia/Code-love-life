public class User {
    private String nama;
    private int umur;
    private String prodi;

    // constructor
    User(String nama, int umur, String prodi) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
