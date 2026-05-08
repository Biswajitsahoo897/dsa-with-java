package slidingwindow;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int maxLen=0,l=0;
        for(int r=0;r<s.length();r++){
            char curr=s.charAt(r);
            while(set.contains(curr)){
                set.remove(s.charAt(l));
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);       
            set.add(curr);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str="dfwewasdis";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
