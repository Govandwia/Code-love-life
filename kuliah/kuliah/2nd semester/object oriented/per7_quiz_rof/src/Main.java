import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Dosen Umar = new Dosen("Umar Taufiq", 38, "TRPL", "88/888888/SV/888888");
    Dosen Rochana = new Dosen("Rochana", 30, "TRPL", "99/999999/SV/9999999");

    Mahasiswa Revalina = new Mahasiswa("Revalina", 18, "TRPL", "11/111111/SV/111111", 2023);
    Mahasiswa Dina = new Mahasiswa("Dina", 20, "TRPL", "22/222222/SV/222222", 2023);
    Mahasiswa Putri = new Mahasiswa("Putri", 19, "TRE", "33/333333/SV/33333", 2022);
    Mahasiswa Eka = new Mahasiswa("Eka", 20, "TRE", "44/4444444/SV/4444444", 2022);

    Kelas ppbo2 = new Kelas("SVPLB2PBO", "PPBO", Umar, 3, "Senin");
    Kelas ppbd2 = new Kelas("SVPLB2PBD", "PPBD", Rochana, 3, "Senin");

    ppbo2.enroll(Eka);
    System.out.println(ppbo2);
    System.out.println("=".repeat(30));
    ppbd2.enroll(Dina);
    System.out.println(ppbd2);
  }
}
