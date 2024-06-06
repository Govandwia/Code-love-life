import java.util.ArrayList;
import java.util.List;


public class Dosen extends User{
    private String nip;
    private List<Kelas> classesTaught;

    // constructor
    Dosen(String nama, int umur,String prodi, String nip) {
        super(nama,umur,prodi);
        this.nip = nip;
        classesTaught = new ArrayList<>();
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getProdi() {
        return super.getProdi();
    }

    @Override
    public int getUmur() {
        return super.getUmur();
    }

    public String getNip() {
        return nip;
    }
    public List<Kelas> getClassesTaught() {
        return classesTaught;
    }

    // functions
    public void addKelas(Kelas classObj) {
        classesTaught.add(classObj);
    }

    @Override
    public String toString() {
        StringBuilder classesInfo = new StringBuilder();
        for(Kelas kelas : classesTaught) {
            classesInfo.append(kelas.getKode()).append(",");
        }
        String classesList = classesInfo.length() > 0 ? classesInfo.substring(0, classesInfo.length()-1) : "None";
        return "Nama dosen : " + getNama() + "\n" +
                "prodi : " + getProdi() + "\n" +
                "NIP : " + nip +  "\n" +
                "kelas yang diajar : " + classesList + "\n" +
                "-------------" + "\n";

    }
}
