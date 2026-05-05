package slidingwindow;

public class LongestRepCharacterReplacement {
    static int longestRepeatingCharacterReplacement(String s,int k){
        int l=0,r=0,maxLen=0,maxF=0;
        int n=s.length();

        int freq[]=new int[26];
        while(r<n){
            char curr=s.charAt(r);
            freq[curr-'A']++;
            maxF=Math.max(maxF, freq[curr-'A']);

            if((r-l+1)-maxF>k){
                // window is invalid , so shrink it from left and left++
                freq[s.charAt(l)-'A']--;
                l++;
            }

            // always check for the maxLen
            // the window size which is (r-l+1) either grows or stays the same
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="AABABBA";
        int k=2;

        System.out.println(longestRepeatingCharacterReplacement(s, k));
    }
}
