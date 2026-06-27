package slidingwindow;

import java.util.HashMap;

public class LongestSubstringwithKUniques {
    static int longestKSubstr(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int count=-1;
        int left=0;

        // sliding window
        for(int right=0;right<s.length();right++){
            char rcurr=s.charAt(right);
            map.put(rcurr,map.getOrDefault(rcurr,0)+1);
            
            //remove condition from left side 
            while(map.size()>k){
                char lcurr=s.charAt(left);
                // 'a' , 3 -> 'a' ,2
                map.put(lcurr,map.get(lcurr)-1);
                
                // edge case if the above statement becomes 0
                
                // 'a' , 1 -> 'a' ,0 then simply remove it
                if(map.get(lcurr)==0){
                    map.remove(lcurr);
                }
                
                left++;
            }
            // check for the window at the end
            if(map.size()==k){
                count=Math.max(count,right-left+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        System.out.println(longestKSubstr(s, k)); // ans 7 "cbebebe"
    }
}
