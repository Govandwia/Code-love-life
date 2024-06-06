import java.util.ArrayList;
import java.util.List;

public class Kelas {
    private String kode;
    private String matakuliah;
    private Dosen dosen;
    private String hari;
    private int kapasitas;
    private List<Mahasiswa> studentsEnrolled;

    public Kelas(String kode, String matakuliah, Dosen dosen, String hari, int kapasitas) {
        this.kode = kode;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
        this.hari = hari;
        this.kapasitas = kapasitas;
        studentsEnrolled = new ArrayList<>();
        dosen.addKelas(this);
    }
    // 
    // 
    public String getKode() {
        return kode;
    }

    public String getMatakuliah() {
        return matakuliah;
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
    // 
    // 
    public boolean isFull() {
        return studentsEnrolled.size() >= kapasitas;
    }

    public void addStudent(Mahasiswa student) {
        studentsEnrolled.add(student);
    }

    @Override
    public String toString() {
        StringBuilder studentsInfo = new StringBuilder();
        for (Mahasiswa mahasiswa : studentsEnrolled) {
            studentsInfo.append(mahasiswa.getNama()).append(", ");
        }
        String studentsList = studentsInfo.length() > 0 ? studentsInfo.substring(0, studentsInfo.length() - 2) : "None";
        return "Kelas " + kode + "\n" +
                "Mata Kuliah: " + matakuliah + "\n" +
                "Kapasitas = " + kapasitas + "\n" +
                "Hari " + hari + "\n" +
                "Dosen Pengampu = " + dosen.getName() + "\n" +
                "List Siswa: " + studentsList + "\n" +
                "_______________" + "\n";
    }
}
