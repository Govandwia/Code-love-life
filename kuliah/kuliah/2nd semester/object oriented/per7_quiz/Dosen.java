package per7_quiz;

public class Dosen extends User{
    private String nip;
    private String mengajarKelas;
    
    // public Kelas kelas;

    public Dosen(String nama, int umur, String prodi, String nip) {
        super(nama, umur, prodi);
        this.nip = nip;
    }

    @Override
    public String toString() {
        if(getNama() == "Umar Taufiq") {
            setMengajarKelas("PBO");
        } else if (getNama() == "Rochana") {
            setMengajarKelas("PBD");
        }

        return "Nama dosen = " + super.getNama() + "\n" +
               "Prodi = " + super.getProdi() + "\n" +
               "NIP = " + getNip() + "\n" +
               "Kelas yang diampu = " + getMengajarKelas() + "\n" +
               "---------------------------------";
    }


    // getter
    public String getNip() {
        return nip;
    }
    public String getMengajarKelas() {
        return mengajarKelas;
    }

    // setter
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setMengajarKelas(String mengajarKelas) {
        this.mengajarKelas = mengajarKelas;
    }

}
