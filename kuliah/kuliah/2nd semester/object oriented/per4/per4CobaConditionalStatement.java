package per4;

public class per4CobaConditionalStatement {
    public static void main(String[] args) {
        // Break
        int num ;
        num = 100;
        for(int  i=0; i < num; i++) {
            if (i*i >= num)
            {break;}
            System.out.print(i+" ");
        }
        System.out.println("loop selesai.");

        // Continue
        for (int i = 0; i <= 15; i++) {
            if(i == 10 || i == 12) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
