package per3;

public class per3TernaryOp {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = (a <= b) ? a : b ;
        int d = (a == b) ? a : b ;

        System.out.println(c);
        System.out.println(d);
    }
}
