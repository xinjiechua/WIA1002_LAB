package LAB09;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(exponent(2, 1));
    }
    public static long exponent(int x, int m){
        if (m == 0) return 1;
        return x * exponent(x, m-1);
    }
}
