package per4;

import java.util.Arrays;

/**
 * bentuk umum deklarasi array : 
 * - tipedata [] namaVariabel = new tipedata [ukuran]
 * - tipedata namaVariabel [] = new tipedata [ukuran]
 */

public class per4CobaArray1 {
public static void main(String[] args) {
    // 2 array
    // deklarasi dan inisiasi array
    // tanpa ukuran
    int [] array1;
    array1 = new int [3];
    array1[0] = 3;
    array1[1] = 3;
    array1[2] = 3;
    int jumlah = array1[0] + array1[1] + array1[2];
    System.out.println("Jumlah int di array1: " + jumlah);

    // dengan ukuran
    char [] array2 = new char [6];
    array2[0] = 'b';
    array2[1] = 'a';
    array2[2] = 'k';
    array2[3] = 's';
    array2[4] = 'o';
    array2[5] = 'o';
    String teks ="" + array2[0] + array2[1] + array2[2] + array2[3] + array2[4] + array2[5];
    System.out.println("Gabungan char di array2: " + teks);

    // Otomatis isi elemen
    int [] array3 = {10,20,30,40,50};
    int [] array4 = new int [] {11,22,33,44,55};
    System.out.println(Arrays.toString(array3));
    System.out.println(Arrays.toString(array4));


    // Array 2 dimensi
    // ukuran 2 x 3 dengan elemen increment dari 1
    int baris = 2;
    int kolom = 3;
    int [][] tabel = new int [baris][kolom];
    tabel[0][0] = 1;
    tabel[0][1] = 2;
    tabel[0][2] = 3;

    tabel[1][0] = 4;
    tabel[1][1] = 5;
    tabel[1][2] = 6;
    String tekstabel1 = "" + tabel[0][0] + tabel[0][1] + tabel[0][2];
    String tekstabel2 = "" + tabel[1][0] + tabel[1][1] + tabel[1][2];
    System.out.println(tekstabel1);
    System.out.println(tekstabel2);
    }
}