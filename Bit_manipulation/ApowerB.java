package Bit_manipulation;

import java.util.Scanner;

public class ApowerB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long M=1000000007;
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=1;
            a=a%M;
            while(b>0){
                if((b&1)==1){
                    ans=(ans*a)%M;
                }
                a=(a*a)%M;
                b=b>>1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}


// Time Complexity : O(logN) as there is t test cases so O(t*(logN))