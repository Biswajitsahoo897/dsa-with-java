package Recursion;
import java.util.*;

public class towerOfHanoi {

    static void TOH(char src,char temp,char des,int n){
        if(n==0){
            return;
        }
        TOH(src,des,temp,n-1);
        System.out.println("Move "+n+" from "+src+" to "+des);
        TOH(temp,src,des,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            System.out.println((int)(Math.pow(2,n)-1)); //no of moves required to solve
            TOH('A','B','C',n);
        }
        sc.close();
    }
}
