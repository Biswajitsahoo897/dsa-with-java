package backtracking;

public class keypadCombination {
    static char[][] L = {
        {}, {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };

    public static void letterCombinations(String D) {

        int len = D.length();

        if (len == 0) {
            System.out.println("");
            return;
        }

        dfs(0, len, new StringBuilder(), D);
    }

    public static void dfs(int pos, int len, StringBuilder sb, String D) {

        if (pos == len) {
            System.out.print(sb.toString()+" ");
        } 
        else {
            char[] letters = L[D.charAt(pos)-'0'];

            for (int i = 0; i < letters.length; i++) {
                dfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
