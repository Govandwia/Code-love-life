abstract class Orang {
    private String nama;
    private String tanggalLahir;
    private String alamat;
    
    public Orang (String nama, String tanggalLahir, String alamat){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }
    public String getAlamat() {
        return alamat;
    }
    // setter
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    abstract String DisplayDataMahasiswa();

}

class Mahasiswa extends Orang{
    private String NIM;
    private String prodi;

    public Mahasiswa(String nama, String NIM, String tanggalLahir, String prodi, String alamat) {
        super(nama, tanggalLahir, alamat);
        this.NIM = NIM;
        this.prodi = prodi;
    }

    // getter
    public String getNIM() {
        return NIM;
    }
    public String getProdi() {
        return prodi;
    }
    // setter
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }


    @Override
    String DisplayDataMahasiswa() {
        return "Nama : " + super.getNama() + "\n" +
               "NIM : " + this.NIM + "\n" +
               "Tanggal lahir : " + super.getTanggalLahir() + "\n" +
               "Prodi : " + this.prodi + "\n" +
               "Alamat : " + super.getAlamat() + "\n" + 
               "----------------------------------------";
    }
    
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad Irfan Valerian", "23/52525/SV/23456", "11 Januari 2005", "TRPL", "Tangerang");
        Mahasiswa mahasiswa2 = new Mahasiswa("Muhammad Fahrul Razi", "23/12312/SV/232323", "11 November 2005", "TRPL", "Karanganyar");

        System.out.println(mahasiswa1.DisplayDataMahasiswa());
        System.out.println(mahasiswa2.DisplayDataMahasiswa());
    }
}
