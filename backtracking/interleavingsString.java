package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class interleavingsString {

    static void interleavingsStringFun(String a,String b,String res,ArrayList<String> ans){
        if(a.length()==0 && b.length()==0){
            ans.add(res);
            return;
        }

        if(a.length()>0){
            interleavingsStringFun(a.substring(1), b, res+a.charAt(0), ans);
        }

        if(b.length()>0){
            interleavingsStringFun(a, b.substring(1), res+b.charAt(0), ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=1;i<=t;i++){
            String a=sc.next();
            String b=sc.next();

            ArrayList<String> ans=new ArrayList<>();
            
            System.out.println("Case #"+i+": ");

            interleavingsStringFun(a,b,"",ans);
            Collections.sort(ans);

            for(String s:ans){
                System.out.println(s);
            }

        }
        sc.close();
    }
}
