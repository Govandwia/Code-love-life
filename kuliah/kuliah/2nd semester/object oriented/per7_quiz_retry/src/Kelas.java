import java.util.ArrayList;
import java.util.List;

public class Kelas {
    private String kode;
    private String mataKuliah;
    private Dosen dosen;
    private String hari;
    private int kapasitas;
    private List<Mahasiswa> studentsEnrolled;

    // constructor
    public Kelas(String kode, String mataKuliah, Dosen dosen, String hari, int kapasitas) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.hari = hari;
        this.kapasitas = kapasitas;
        studentsEnrolled = new ArrayList<>();
        dosen.addKelas(this);
    }
    
    // getter
    public String getKode() {
        return kode;
    }
    public String getMataKuliah() {
        return mataKuliah;
    }
    public Dosen getDosen() {
        return dosen;
    }
    public String getHari() {
        return hari;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public List<Mahasiswa> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    // functions
    public boolean isFull(){ //to check is it full or not
        return studentsEnrolled.size() >= kapasitas;
    }

    public void addStudent(Mahasiswa student) {
        studentsEnrolled.add(student); // adding mahasuswa to kelas
    }

    @Override
    public String toString() {
        StringBuilder studentsInfo = new StringBuilder();
        for (Mahasiswa mahasiswa : studentsEnrolled) {
            studentsInfo.append(mahasiswa.getNama()).append(",");
        }
        String studentsList = studentsInfo.length() > 0 ? studentsInfo.substring(0, studentsInfo.length()-1) : "None";
        return "kelas " + kode + "\n" +
                "mata kuliah : " + mataKuliah + "\n" +
                "kapasistas : " + kapasitas + "\n" +
                "hari : " + hari + "\n" +
                "Dosen pengampu : " + dosen.getNama() + "\n" +
                "Daftar siswa : " + studentsList + "\n" + 
                "-------------------" + "\n";
    }
}   
