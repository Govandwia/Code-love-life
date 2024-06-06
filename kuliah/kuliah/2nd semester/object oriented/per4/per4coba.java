package per4;
// semua yang di proyektor dicobain dah intinya
public class per4coba {
    public static void main(String[] args) {
        // int[][] angka = new int[3][2];
        // angka[0][0] = 1;
        // angka[0][1] = 2;
        // angka[1][0] = 3;
        // angka[1][1] = 4;
        // // 1 2
        // // 3 4


        // for (int i = 0; i < angka.length; i++) {
        //     for(int j = 0; j < angka[i].length; j++) {
        //         System.out.println(angka[i][j]);
        //     }
        // }
        

        // int i = 0;
        // ==while loop==
        // while (i < 5) {
        //     System.out.println(i);
        //     i++;
        // }
        

        // ==do loop==
        // do {
        //     i++;
        //     System.out.println(i);
        // } while (i < 5);

        // ==break==
        // int i = 0;
        // while(i < 15) {
        //     System.out.println(i);
        //     if ( i == 8 ) {
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("loop selesai");


        for(int j = 0; j < 20 ; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }
    }
}
