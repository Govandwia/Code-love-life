package per5.school;
// class mahasiswa
public class Mahasiswa extends Manusia { // manusia => parent class, mahasiswa => sub class
    // Atribut
    public String nama;
    private String password;
    private String nim;
    private int angkatan;
    int semester;
    double ipk;
    public int jumlahBolos;

    // getter
    // kalau kelas lain mau ambil password
    public String getPassword() {
        return password;
    }

    public String getNim() {
        return nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    // Setter
    // set password
    public void setPassword(String password) {
        this.password = password;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    // constructor
    public Mahasiswa(String namaMahasiswa, String nim, int angkatanMahasiswa) {
        super.nama = namaMahasiswa; //super => manggil parent class
        super.umur = umur;
        this.nim = nim; //memanggil diri sendiri (bukan parameter)
        angkatan = angkatanMahasiswa;
        this.jumlahBolos = 0;
    }

    // method
    public void bolehUjian() {
        if (jumlahBolos > 7) {
            System.out.println("Mahasiswa tidak boleh ujian");
        } else {
            System.out.println("Mahasiswa boleh ujian");
        }
    }

    // @override => isi tostring ketika memanggil mahasiswa isinya akan beda
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nama= " + nama + 
                "\nNim = " + nim + 
                "\nAngkatan = " + angkatan + 
                "\nSemester = " + semester +
                "\nIPK = " + ipk +
                "\nJumlah bolos = " + jumlahBolos;
    }
}
