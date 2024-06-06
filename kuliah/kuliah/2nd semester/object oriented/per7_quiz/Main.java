package per7_quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dosen dosenA = new Dosen("Umar Taufiq", 38, "TRPL", "23/2323232/SV/232332");
        Dosen dosenB = new Dosen("Rochana", 30, "TRPL", "44/44444/SV/44444");

        Mahasiswa mahasiswaA = new Mahasiswa("Revalina", 18, "TRPL", "23/2323/SV/232323", 2023);
        Mahasiswa mahasiswaB = new Mahasiswa("Dina", 20, "TRPL", "23/14045/SV/123345", 2023);
        Mahasiswa mahasiswaC = new Mahasiswa("Putri", 19, "TRE", "22/45045/SV/9119111", 2022);
        Mahasiswa mahasiswaD = new Mahasiswa("Eka", 20, "TRE", "22/4209898/SV/42002", 2022);

        Kelas pbo = new Kelas("SVPLB2PBO", "PBO", dosenA, 3, "senin");
        Kelas pbd = new Kelas("SVPLB2PBO", "PBD", dosenB, 3, "senin");

        // enroll
        pbo.enroll(mahasiswaA);
        // pbd.enroll(mahasiswaA);
        ArrayList <Mahasiswa> daftarMahasiswa = new ArrayList<>(Arrays.asList(mahasiswaB,mahasiswaC,mahasiswaD));
        // pbo.enroll(daftarMahasiswa);
        System.out.println();


        System.out.println(pbo);
        System.out.println(pbd);
        System.out.println(dosenA);
        System.out.println(dosenB);
        System.out.println(mahasiswaA);
        System.out.println(mahasiswaB);
        System.out.println(mahasiswaC);
        System.out.println(mahasiswaD);

    }
}
