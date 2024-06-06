package per4;
/*
 * for (inisialisasi; kondisi; step) {
 *  statement yang dijalankan secara berulang selama kondisi bernilai benar
 * };
 * 
 * while (kondisi) {
 * statement yang dijalankan secara berulang selama kondisi bernilai benar
 * };
 * 
 * 
 * do {
 *  statement yang dijalankan secara berulang selama kondisi bernilai benar
 * } while (kondisi);
 */
public class per4CobaPerulangan {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // foreach loop
        int ar[] = {10, 50, 60, 80, 90};
        for (int element : ar) {
            System.out.println(element + "");
        }

        // 
    }
}
