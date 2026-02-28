package Bit_manipulation;

import java.util.Scanner;

public class FlipBitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            int count=0;
            while(a!=0 || b!=0){
                // first gives the last bit of the a , same goes for b 
                // doing xor so that only different bits will be counted
                if(((a&1)^(b&1))!=0){
                    count++;
                }
                a=a>>1;
                b=b>>1;
            }
            
            System.out.println(count);

        }

        sc.close();
    } 
}
