import java.util.*;

public class Kelas {
  private String kodeKelas;
  private String namaKelas;
  private String hari;
  private int jumlahSiswa;
  private ArrayList<Mahasiswa> dataKelas = new ArrayList<Mahasiswa>();
  private Dosen dosen;

  public Kelas(String KodeKelas, String Nama_Kelas, Dosen dosen, int Kapasitas, String Hari) {
    this.kodeKelas = KodeKelas;
    this.namaKelas = Nama_Kelas;
    this.hari = Hari;
    this.jumlahSiswa = Kapasitas;
    this.dosen = dosen;
  }

  public void enroll(Mahasiswa pendaftar) {
    boolean sudahDaftar = true;
    if (this.dataKelas.size() < this.jumlahSiswa) {
      dataKelas.add(pendaftar);
      System.out.println("Berhasil mendaftarkan " + pendaftar.getNama() + " Ke kelas " + this.kodeKelas);
    } else {
      System.out.println("Kelas " + this.kodeKelas + " sudah penuh.");
    }
  }

  public void tampilkanDaftarMahasiswa() {
    System.out.println("Daftar Mahasiswa di Kelas " + this.kodeKelas + ":");
    for (Mahasiswa mahasiswa : dataKelas) {
      System.out.println("- " + mahasiswa.getNama());
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n")
        .append("Daftar Mahasiswa:\n");

    for (Mahasiswa mahasiswa : dataKelas) {
      sb.append("- ").append(mahasiswa.getNama()).append("\n");
    }
    return "Kelas : " + this.kodeKelas + "\n" +
        "Mata Kuliah : " + this.namaKelas + "\n" +
        "Kapasitas : " + this.jumlahSiswa + "\n" +
        "Hari : " + this.hari + "\n" +
        "Dosen Pengampu : " + this.dosen.getNama() + "\n"
        + "Daftar siswa : " + sb.toString() + "=".repeat(30);

  }
}
