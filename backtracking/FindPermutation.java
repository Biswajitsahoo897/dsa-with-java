package backtracking;

public class FindPermutation {
    static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }

        // Time complexity ->O(n*n!); space complexity: O(n)
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permutation(s, "");
    }
}
