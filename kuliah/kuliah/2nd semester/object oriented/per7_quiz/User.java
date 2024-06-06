package per7_quiz;

public class User {
    private String nama;
    private int umur;
    private String prodi;

    public User(String nama, int umur, String prodi) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getProdi() {
        return prodi;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
