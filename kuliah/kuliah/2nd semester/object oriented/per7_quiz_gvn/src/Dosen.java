import java.util.ArrayList;
import java.util.List;

public class Dosen {
    private String nama;
    private String prodi;
    private int umur;
    private String NIP;
    private List<Kelas> classesTaught;

    public Dosen(String nama, int umur, String prodi, String NIP) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
        this.NIP = NIP;
        classesTaught = new ArrayList<>();
    }

    public String getName() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getNIP() {
        return NIP;
    }

    public List<Kelas> getClassesTaught() {
        return classesTaught;
    }
    // 
    // 
    public void addKelas(Kelas classObj) {
        classesTaught.add(classObj);
    }

    @Override
    public String toString() {
        StringBuilder classesInfo = new StringBuilder();
        for (Kelas kelas : classesTaught) {
            classesInfo.append(kelas.getKode()).append(", ");
        }
        String classesList = classesInfo.length() > 0 ? classesInfo.substring(0, classesInfo.length() - 2) : "None";
        return "Nama Dosen: " + nama + "\n" +
                "Prodi: " + prodi + "\n" +
                "NIP: " + NIP + "\n" +
                "Kelas yang Diajar: " + classesList + "\n" +
                "_______________" + "\n";
    }
}
