package per5.example;

import per5.school.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        // instance
        Mahasiswa mahasiswa = new Mahasiswa("limee iverson", "23/500911/SV/140445", 2024);

        // mengubah value
        mahasiswa.nama = "Gustavo shockbreaker";
        mahasiswa.jumlahBolos = 8;
        
        // mahasiswa.password = "apalah";
        mahasiswa.setPassword("apalah");

        // output
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.getNim());
        System.out.println(mahasiswa.getAngkatan());

        // panggil method
        mahasiswa.bolehUjian();

        // print semua yang terdapat di class Mahasiswa
        System.out.println(mahasiswa);
    }
}
