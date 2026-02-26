package Bit_manipulation;

import java.util.Scanner;

public class sumOfXOR {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long ans=0;
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long count=0;
            for(int i=0;i<32;i++){
                count=0;
                for(int j=0;j<n;j++){
                    if(((arr[j]>>i)&1)==1){
                        count++;
                    }
                }
                ans+=(1<<i)*(count)*(n-count);
            }
            System.out.println(2*ans);
        }      
        sc.close();
    }
}
