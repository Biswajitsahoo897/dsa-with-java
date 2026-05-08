
public class LongestPalindromicSubstring {

    static int[] valid(String s,int n,int p1,int p2){
        while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
            // p1 moves backword and p2 moves forward as we have to check the palindrome

            p1--;
            p2++;
        }
        int endLen=p2-p1-1;
        int startLen=p1+1;
        // on the very last iteration starlen would be -1 
        return new int[]{startLen,endLen};
    }
    static String longestPalindrome(String s) {
        int n=s.length();
        int maxLen=-1;
        int startIdx=-1;
        for(int i=0;i<n;i++){
            int []even=valid(s,n,i,i+1);
            int []odd=valid(s,n,i-1,i+1);
            if(even[1]>maxLen){
                maxLen=even[1];
                startIdx=even[0];
            }
            if(odd[1]>maxLen){
                maxLen=odd[1];
                startIdx=odd[0];
            }
        }
        return s.substring(startIdx,maxLen+startIdx);
    }
    public static void main(String[] args) {
        String s="wrwebafabaad";
        String res=longestPalindrome(s);
        System.out.println(res);
    
    }
}