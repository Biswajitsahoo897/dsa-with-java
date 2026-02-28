package Recursion;
import java.util.*;

public class towerOfHanoi {
    static void TOH_Modified(char src, char temp,char des,int n){
        if(n==0) return;

        if(n==1) {
            System.out.println("Move 1 from "+src+" to "+temp);
            System.out.println("Move 1 from "+temp+" to "+des);
            return;
        }
        TOH_Modified(src,temp,des,n-1);
        System.out.println("Move "+n+" from "+src+" to "+temp);
        TOH_Modified(des,temp,src,n-1);
        System.out.println("Move "+n+" from "+temp+" to "+des);
        TOH_Modified(src,temp,des,n-1);

    }
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
        
        //Method 1 using a,b,c  
        System.out.println((int)(Math.pow(2,n)-1)); //no of moves required to solve
        TOH('A','B','C',n);

        // Mehtod 2 using a,b,c but with 2 moves for each disk ,
        // can't move directly from src(a) to des(c)

        // System.out.println((long)(Math.pow(3,n)-1));
        // TOH_Modified('A','B','C',n);
        }
        sc.close();
    }
}
