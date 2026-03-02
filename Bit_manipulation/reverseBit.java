package Bit_manipulation;
// SI quesion
import java.util.Scanner;

public class reverseBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();
            long res=0;
            for(int i=0;i<32;i++){
                
                // shift res to the left to make space for the next bit
                // then extract the last bit of n and add(using bitwise or) it to res
                // Right shift n to process the next bit
                
                res=res<<1;
                res|=(n&1);
                n>>=1;
            }
            System.out.println(res);

        }
        sc.close();
    }
}

