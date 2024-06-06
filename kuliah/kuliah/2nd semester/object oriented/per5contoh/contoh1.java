package per5contoh;

public class contoh1 {
    public static void main(String[] args) {
        contoh1.printedData(0, "Data1", "Data2", "Data3");
    }

    public static void printedData(int number, String... varg) {
        System.out.println(number);
        for(String data : varg) {
            System.out.println(data);
        }
    }

    class contoh2 {
        int row = 9;
        int column = 11;

        contoh2(int row, int column) {
            this.row = row;
            this.column = column;
        }
        
        @Override
        public String toString() {
            return "banyak baris: " + this.row + "\n"+
                   "banyak kolom: " + this.column + "\n";
        }
    }

}

