public class Mahasiswa extends User{
    private String nim;
    private int angkatan;
    private Kelas enrolledClass;

    // constructor
    public Mahasiswa(String nama, int umur, String nim, String prodi, int angkatan ){
        super(nama, umur, prodi);
        this.nim = nim;
        this.angkatan = angkatan;
    }
    
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public int getUmur() {
        return super.getUmur();
    }
    @Override
    public String getProdi() {
        return super.getProdi();
    }
    public String getNim() {
        return nim;
    }
    public int getAngkatan() {
        return angkatan;
    }
    public Kelas getEnrolledClass() {
        return enrolledClass;
    }


    public String enrollClass(Kelas classObj) {
        if (enrolledClass != null && enrolledClass.getHari().equalsIgnoreCase(classObj.getHari())) {
            return "Gagal mendaftarkan " + getNama() + " ke " + classObj.getKode() + " karena memiliki kelas di hari yang sama yaitu hari " + classObj.getHari();
        }

        if(classObj.isFull()){
            return "Gagal mendaftarkan " + getNama() + " ke " + classObj.getKode() + "." ;
        }

        enrolledClass = classObj;
        classObj.addStudent(this);
        return "berhasil mendaftarkan " + getNama() + " ke " + classObj.getKode();
    }

    @Override
        public String toString() {
            return  "===============" + "\n" +
                    "Nama Mahasiswa = " + getNama() + "\n" +
                    "Prodi = " + getProdi() + "\n" +
                    "NIM = " + getNim() + "\n" +
                    "Angkatan = " + angkatan + "\n" +
                    "Kelas Yang Diikuti = " + (enrolledClass != null ? enrolledClass.getKode() : "Tidak ada") + "\n" +
                    "_______________" + "\n";
        }

}
