package per4;

public class per4latihan5 {
    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int num = 1;

        int [][] array = new int [row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                array[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j =0; j < column; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

    }
}


        // int baris = 3;
        // int kolom = 4;

        // int num = 1
        // int[][] array = new int [baris][kolom];

        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; i < array[i].length; j++) {
        //         for (int k = 1; k <= 12; k ++) {
        //             if(i == 0 || i == 1 && j == 3) {
        //                 continue;
        //             }
        //             array[i][j] = k;
        //         }
        //     }
        // }