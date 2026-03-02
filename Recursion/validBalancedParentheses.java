package Recursion;

import java.util.Scanner;

public class validBalancedParentheses {
    static void validBP(char p[],int open ,int close,int n,int idx){
        if(open==close && open==(n/2)){
            System.out.println(p);
            return;
        }

        if(open<(n/2)){
            p[idx]='{';
            validBP(p,open+1,close,n,idx+1);
        }
        if(close<open){
            p[idx]='}';
            validBP(p,open,close+1,n,idx+1);

        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            char []p=new char[2*n];
            System.out.println("Test Case #"+i+":");
            validBP(p,0,0,2*n,0);
        }
        sc.close();
    }
}
