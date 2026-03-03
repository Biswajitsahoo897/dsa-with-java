package Bit_manipulation;
import java.util.*;

public class x0s_and_y1s {
    static long M=1000000007;

    static long solve(long a , long n){
        long ans=1;
        a=a%M;
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

            long a=solve(2,x+y);
            long b=solve(2,y);
            System.out.println((a-b+M)%M);
        }
        sc.close();
    }
}