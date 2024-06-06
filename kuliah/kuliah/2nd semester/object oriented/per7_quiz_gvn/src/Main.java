public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Umar Taufiq", 38, "TRPL", "88/888888/SV/888888");
        Dosen dosen2 = new Dosen("Rochana", 30, "TRPL", "99/999999/SV/999999");

        Mahasiswa mahasiswaA = new Mahasiswa("Revalina",18, "11/111111/SV/111111", "TRPL", 2023);
        Mahasiswa mahasiswaB = new Mahasiswa("Dina",20, "22/222222/SV/22222", "TRPL", 2023);
        Mahasiswa mahasiswaC = new Mahasiswa("Putri",19, "33/333333/SV/333333", "TRE", 2023);
        Mahasiswa mahasiswaD = new Mahasiswa("Eka",20, "44/4444444/SV/444444", "TRE", 2023);

        Kelas ppboB2 = new Kelas("SVPLB2PBO", "PBO", dosen1, "Senin", 3);
        Kelas pbdB2 = new Kelas("SVPLB2PBD", "PBD", dosen2, "Senin", 3);

        System.out.println(mahasiswaA.enrollClass(ppboB2));
        System.out.println(mahasiswaB.enrollClass(pbdB2));
        System.out.println(mahasiswaC.enrollClass(ppboB2));
        System.out.println(mahasiswaD.enrollClass(ppboB2));

        System.out.println(mahasiswaA);
        System.out.println(mahasiswaB);
        System.out.println(mahasiswaC);
        System.out.println(mahasiswaD);
        System.out.println(ppboB2);
        System.out.println(pbdB2);
        System.out.println(dosen1);
        System.out.println(dosen2);
    }
}
