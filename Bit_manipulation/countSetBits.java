package Bit_manipulation;

import java.util.*;
public class countSetBits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

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
}

