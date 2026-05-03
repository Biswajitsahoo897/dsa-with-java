package dp;

import java.util.Scanner;

public class ComuteFactorial {
    static int maxN=10000000;
    static int M=1000000007;
    static long prefixSum[]=new long[maxN+1];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        prefixSum[0]=1;
        prefixSum[1]=1;
        for (int i = 2; i <=maxN; i++) {
            prefixSum[i]=(prefixSum[i-1]*i)%M;
        }
        while (t-->0) {
            int n=sc.nextInt();
            System.out.println(prefixSum[n]);
        }
        sc.close();
    }
}
