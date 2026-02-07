package queue;

import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="aabccxbaeexd";
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
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }

}