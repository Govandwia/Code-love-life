public class Mahasiswa extends Manusia{
    private String prodi;
    private String nim;
    private int angkatan;


    public Mahasiswa(String Nama, int Umur, String Prodi, String NIM, int Angkatan){
        super(Nama, Umur);
        Prodi = this.prodi;
        NIM = this.nim;
        Angkatan = this.angkatan;
    }

    // public String getNama(){
    //     return Mahasiswa.getNama();
    // }


}
