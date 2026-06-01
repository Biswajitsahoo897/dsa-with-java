package Bit_manipulation;

import java.util.*;
public class countSetBits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TC => NlogN
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int c=0;
            while(n!=0){
                n=n&(n-1);
                c++;
            }
            System.out.println(c);
        }
        sc.close();
        
        
    }



    // Leetcode 338 (Using DP) TC => O(N)
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        // ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=ans[i/2]+(i&1);
        }
        return ans;
    }
}

