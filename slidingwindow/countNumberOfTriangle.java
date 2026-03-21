package slidingwindow;

import java.util.Arrays;
import java.util.Scanner;

public class countNumberOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); 
        while(t-->0){
            int n=sc.nextInt();
            int []A=new int[n];
            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
            }
            Arrays.sort(A);
            int count=0;
            for(int k=n-1;k>=2;k--){
                int p1=0,p2=k-1;
                while(p1<p2){
                    if(A[p1]+A[p2]>A[k]){
                        count+=p2-p1;
                        // p2-p1 bcz if A[p1]+A[p2]>A[k] then 
                        // A[p1+1]+A[p2], A[p1+2]+A[p2]... A[p2-1]+A[p2]
                        //  will also be greater than A[k] 
                        p2--;
                    }else{
                        p1++;
                    }
                }
            }
            System.out.println(count);
        }      
        sc.close(); 
    }
}
