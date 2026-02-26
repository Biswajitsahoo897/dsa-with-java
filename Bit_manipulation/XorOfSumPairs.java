package Bit_manipulation;

import java.util.Scanner;

public class XorOfSumPairs {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            int []arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
                ans=ans^(arr[i]+arr[i]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
