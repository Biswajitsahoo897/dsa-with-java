import java.util.*;

public class Test2 {
    // static int a=89;

    // static void subsets(String s, int index, String ans){

    //     if(index == s.length()){
    //         if(ans.length() > 0)
    //             System.out.println(ans);
    //         return;
    //     }
    //     // include
    //     subsets(s, index+1, ans + s.charAt(index));

    //     // exclude
    //     subsets(s, index+1, ans);
    // }
    static void change(int []arr){
        arr[1]=99;
    }
    public static void main(String[] args){
        // subsets("ABC",0,"");
        // int a =90;
        // System.out.println(a);
        // change(12);
        // System.out.println(a);   

        // int []arr={1,4,6};
        // change(arr);
        // for(int x:arr){
        //     System.out.print(x+" ");
        // }
        String num="52192";
        int n=Integer.parseInt(num);
        int original=n;
        String res="";
        int largestOdd=-1;
        for(int i=0;i<num.length();i++){
            while(n!=0){
                int rem=n%10;
                if(rem%2==1){
                    largestOdd=Math.max(largestOdd,rem);
                }
                res+=largestOdd;
                n/=10;
            }
        }
        System.out.println(res);

        String s="aSd";

        System.out.println((char)((int)s.charAt(1)+32));
    }
}

