package queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepeatingProblem {

    static void firstNonRepeatingCharacter(String s){
        int []freq=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.offer(ch);
            freq[ch-'a']++;
            
            //while the queue is not empty AND the front character is repeating then only remove
            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
            }
            // display
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    static void firstNonRepeatingInteger(int []arr){
        // int []freq=new int[26];
        HashMap<Integer,Integer> freq=new HashMap<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            q.offer(curr);
            freq.put(curr,freq.getOrDefault(curr, 0)+1);
            
            while(!q.isEmpty() && freq.get(q.peek())>1){
                q.poll();
            }
            
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }

    }
    public static void main(String[] args) {
        String s="aabccxbaeexd";
        int arr[] = {4,5,4,5,3};
        firstNonRepeatingCharacter(s);
        firstNonRepeatingInteger(arr);
    }

}