package tree.BST;

import java.util.*;
public class CheckBST {

    static boolean checkBST(int []arr,int i,int min,int max,int n){
        if(i>n) return true;

        if(arr[i]<=min||arr[i]>=max) return false;

        return checkBST(arr,2*i,min,arr[i],n)&&
        checkBST(arr,2 *i+1,arr[i],max,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int []arr=new int[n+1];

            for(int j=1;j<=n;j++){
                arr[j]=sc.nextInt();
            }

            if(checkBST(arr,1,Integer.MIN_VALUE,Integer.MAX_VALUE,n)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }       
        sc.close();
    }
}

