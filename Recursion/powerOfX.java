package Recursion;

public class powerOfX {
    public static double myPow(double x, int n) {
    long N = n;
    if (N == 0) return 1;
    if (N < 0) {
        N = -N;
        x = 1 / x;
    }
    if (N % 2 == 1)
        return x * myPow(x, (int)(N - 1));
    else
        return myPow(x * x, (int)(N / 2));
    }
    public static void main(String[] args) {
        System.out.println(myPow(2, 5));
        System.out.println(myPow(3, -3));
        System.out.println(myPow(4, 7));
    }
}
