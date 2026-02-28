package Bit_manipulation;

import java.util.Scanner;

public class SwapBitsAdjancent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int res=0;
            int pos=0;

            while(n!=0){
                int first=(n)&1;
                int second=(n>>1)&1;
                // Swap the bits by shifting first bit to the left 
                // and second bit to the right
                res|=(first<<(pos+1));
                res|=(second<<pos);

                // Right shift n by 2 to process the next pair of bits
                n>>=2;
                pos+=2;

            }
            System.out.println(res);

        }
        sc.close();
    }
}

/*
INPUT:
10
OUTPUT:
5
*/
