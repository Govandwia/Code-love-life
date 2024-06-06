public class Mahasiswa {
        private String nama;
        private int umur;
        private String NIM;
        private String prodi;
        private int angkatan;
        private Kelas enrolledClass;
    
        public Mahasiswa(String nama,int umur, String NIM, String prodi, int angkatan) {
            this.nama = nama;
            this.umur = umur;
            this.NIM = NIM;
            this.prodi = prodi;
            this.angkatan = angkatan;
        }
    
        public String getNama() {
            return nama;
        }

        public int getUmur() {
            return umur;
        }
    
        public String getNIM() {
            return NIM;
        }
    
        public String getProdi() {
            return prodi;
        }
    
        public int getAngkatan() {
            return angkatan;
        }
    
        public Kelas getEnrolledClass() {
            return enrolledClass;
        }
    
        public String enrollClass(Kelas classObj) {
            if (enrolledClass != null && enrolledClass.getHari().equalsIgnoreCase(classObj.getHari())) {
                return "Gagal mendaftarkan " + nama + " ke " + classObj.getKode() + " karena memiliki kelas di hari yang sama.";
            }
    
            if (classObj.isFull()) {
                return "Gagal mendaftarkan " + nama + " ke " + classObj.getKode() + " karena kelas penuh.";
            }
    
            enrolledClass = classObj;
            classObj.addStudent(this);
            return "Berhasil mendaftarkan " + nama + " ke " + classObj.getKode() + ".";
        }
    
        @Override
        public String toString() {
            return "Nama Mahasiswa = " + nama + "\n" +
                    "Prodi = " + prodi + "\n" +
                    "NIM = " + NIM + "\n" +
                    "Angkatan = " + angkatan + "\n" +
                    "Kelas Yang Diikuti = " + (enrolledClass != null ? enrolledClass.getKode() : "Tidak ada") + "\n" +
                    "_______________" + "\n";
        }
}
