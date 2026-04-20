package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    static void generateBinaryUsingBitManipulation(int n){ //TC => O(N*Log(N))
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int tem=i;
            String res="";
            while(tem!=0){
                if(tem%2==0){
                    res+="0";
                }else{
                    res+="1";
                }
                tem/=2;
            }
            
            // to change the order 01 to 10
            StringBuilder sb=new StringBuilder(res);
            res=sb.reverse().toString();
            ans.add(res);
        }
        System.out.println(ans);
    }

    static void generateBinaryUsingQueue(int n){ // TC=> O(N)
        Queue<String>q=new LinkedList<>();
        ArrayList<String> res=new ArrayList<>();
        q.offer("1");
        while(n-->0){
            String curr=q.poll();
            String s1=curr;
            s1+="0";
            String s2=curr;
            s2+="1";
            q.offer(s1);
            q.offer(s2);
            res.add(curr);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int n=5;
        generateBinaryUsingBitManipulation(n);
        generateBinaryUsingQueue(n);

    }
}
