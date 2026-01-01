package Recursion;

import java.util.Scanner;

public class fibonacciSeries {
    static int fibonacciSeriesFun(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        return fibonacciSeriesFun(n-1)+fibonacciSeriesFun(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeriesFun(i)+" ");
        }
        sc.close();
    }
}
