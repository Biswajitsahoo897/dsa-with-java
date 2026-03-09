package Recursion;

import java.util.Scanner;

public class InterleavingsString {
    static void interleavingsFun(String a,String b,int p1,int p2,char []res,int idx ){
        if(p1==a.length()){
            while(p2<b.length()){
                res[idx++]=b.charAt(p2++);

            }
            System.out.println(new String(res));
            return;
        }

        if(p2==b.length()){
            while(p1<a.length()){
                res[idx++]=a.charAt(p1++);

            }
            System.out.println(new String(res));
            return;
        }
        if(a.charAt(p1)<b.charAt(p2)){
            res[idx]=a.charAt(p1);
            interleavingsFun(a,b,p1+1,p2,res,idx+1);
            res[idx]=b.charAt(p2);
            interleavingsFun(a,b,p1,p2+1,res,idx+1);

        }
        else{
            res[idx]=b.charAt(p2);
            interleavingsFun(a,b,p1,p2+1,res,idx+1);
            res[idx]=a.charAt(p1);
            interleavingsFun(a,b,p1+1,p2,res,idx+1);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=1;i<=t;i++){
            String a=sc.next();
            String b=sc.next();
            char []ch=new char[a.length()+b.length()];
            System.out.println("Case #"+i+":");
            interleavingsFun(a,b,0,0,ch,0);
        }
        sc.close();     
        
    }
}
