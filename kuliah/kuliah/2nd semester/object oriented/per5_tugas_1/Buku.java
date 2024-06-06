package per5_tugas_1;

public class Buku {
    private String judul; //private
    private String penulis;
    boolean isDipinjam;
    private int lamaPeminjaman;
    User peminjam;

    
    // getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }

    
    // setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setLamaPeminjaman(int lamaPeminjaman) {
        this.lamaPeminjaman = lamaPeminjaman;
    }

    // constructor
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.isDipinjam = false;
        this.lamaPeminjaman = 0;
    }

    public void pinjam(User admin, User peminjam, int lamaPeminjaman) {
        if(isDipinjam == true) {
            System.out.println("Buku sedang dipinjam");
        } else if (!admin.getRole().equals("Pustakawan")) {
            System.out.println("Perlu izin pustakawan!");
        } else {
            this.isDipinjam = true;
            this.peminjam = peminjam;
            this.lamaPeminjaman = lamaPeminjaman;
            System.out.println("Buku berhasil dipinjam!");
        }
    }

    public boolean isBukuaDipinjam() {
        return isDipinjam;
    }
}
