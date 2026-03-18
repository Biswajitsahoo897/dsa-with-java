package Sorting;
import java.util.*;

public class sumOfPairs {
    static boolean sumOfPairsFun(int []arr,int k){
        int p1=0,p2=arr.length-1;

        while(p1<p2){
            if(arr[p1]+arr[p2]==k){
                return true;
            }else if(arr[p1]+arr[p2]<k){
                p1++;
            }else{
                p2--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(sumOfPairsFun(arr,k)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }

        }
        sc.close();
        
    }
}

