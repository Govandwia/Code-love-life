public class Dosen extends Manusia {
    private String prodi;
    private String nip;

    public Dosen(String Nama, int Umur, String Prodi, String NIP){
        // super.nama = Nama;
        // super.umur = Umur ;
        super(Nama, Umur);
        this.prodi = Prodi;
        this.nip  = NIP;
    }

    // public String getNama(){
    //     return super.nama;
    // }
}
