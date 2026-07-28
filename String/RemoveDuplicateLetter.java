import java.util.Stack;

/*
Given a string s, remove duplicate letters so that every letter appears 
once and only once. 
You must make sure your result is the smallest in lexicographical order 
among all possible results.

*/
public class RemoveDuplicateLetter {
    static String removeDuplicateLetter(String s){

        int []lastIndex=new int[26];
        
        // keeping the track of the last index
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        boolean visited[]=new boolean[26];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-'a';
            if(!visited[curr]){
                visited[curr]=true;
                while(!stack.isEmpty() && stack.peek()>curr && lastIndex[stack.peek()]>i){
                    visited[stack.pop()]=false;
                }
                stack.push(curr);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int x:stack){
            sb.append((char)(x+'a'));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="cbacdcbc";
        // String s="bcabc";

        System.out.println(removeDuplicateLetter(s));

    }
}
