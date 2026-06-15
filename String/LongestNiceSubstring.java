import java.util.HashSet;

public class LongestNiceSubstring {
    static String longestNiceSubstring(String s) {
        if (s.length() < 2) {
            return "";
        }
        // storing it in the hashset
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(Character.toLowerCase(c)) &&
                set.contains(Character.toUpperCase(c))) {
                continue;
            }

            // if like we encounter with any string , which ain't nice then 
            // just split it up (divide and conqueror) and check left and right  
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            // return the string which is greater 
            return left.length() >= right.length() ? left : right;
        }
        // or the entire string itself is nice
        return s;
    }
    public static void main(String[] args) {
        String s="YazaAay";
        longestNiceSubstring(s);
    }
}
