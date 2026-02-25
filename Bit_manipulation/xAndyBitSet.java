package Bit_manipulation;

import java.util.*;

public class xAndyBitSet {
    static long M=1000000007;
    static long solve(long a,long n){
        long ans=1;
        while(n>0){
            if((n&1)==1){
                ans=(ans*a)%M;
            }
            a=(a*a)%M;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            // (a n)->(2, x) same goes for y also
            long powerOfX=solve(2,x);
            long powerOfY=solve(2,y);
            if(x==y){
                System.out.println(powerOfX);
            }
            else{
                System.out.println((powerOfX+powerOfY)%M);
            }
        }
        sc.close();
    }
}
