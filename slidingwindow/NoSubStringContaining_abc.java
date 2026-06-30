package slidingwindow;
public class NoSubStringContaining_abc {
    // leetcode 1358
    static int numberOfSubstrings(String s) {
        int count[]=new int[3];
        int res=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            // add the current element
            count[s.charAt(i)-'a']++;

            // shrinking the window
            while(count[0]>0 && count[1]>0 && count[2]>0){
                count[s.charAt(left++)-'a']--;
            }
            res+=left;
            // if left=4 this means 
            // [0..i]
            // [1..i]
            // [2..i]
            // [3..i] are valid
        }
        return res;
    }
    public static void main(String[] args) {
        String s="abcabc";
        System.out.println(numberOfSubstrings(s));
        
    }
}
