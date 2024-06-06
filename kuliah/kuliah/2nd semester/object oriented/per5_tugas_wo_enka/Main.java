package per5_tugas_wo_enka;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("The gustavo shockbreaker", "Ivan injeksi");
        User pustakawan1 = new User("Walter putih", "Pustakawan");
        User pengunjung1 = new User("El matadore tequila el konco", "Pengunjung");
        User pengunjung2 = new User("Khidir Karawita", "Pengunjung");
        
        // check apakah buku dipinjam
        System.out.println(buku1.isBukuDipinjam());
        buku1.pinjam(pustakawan1, pengunjung1, 7);
        // user lain mencoba meminjam buku yang sama
        buku1.pinjam(pustakawan1, pengunjung2, 5);

        // mengembalikan buku
        buku1.kembalikanBuku(pengunjung1);

        System.out.println("Buku setelah dikembalikan");
        // memanggil objek dalam bentuk toString()
        System.out.println(buku1);
    }
}
