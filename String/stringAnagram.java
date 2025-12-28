public class stringAnagram {
    public static void isAnagramUsingCharFrequency(String s1, String s2) {
        int []freq=new int[256];

        for(char c:s1.toCharArray()){
            freq[c]++;
        }

        for(char c:s2.toCharArray()){
            freq[c]--;
        }

        boolean isAnagram=true;
        for(int count:freq){
            if(count!=0){
                isAnagram=false;
                break;
            }
        }

        if(isAnagram){
            System.out.println(s1+" and "+s2+" are anagrams.");
        }else{
            System.out.println(s1+" and "+s2+" are not anagrams.");
        }
    }
    // LeetCode Approach - 242
    static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false; 
        int[] count = new int[26];

        for (final char c : s.toCharArray()){
            ++count[c - 'a'];
        }

        for (final char c : t.toCharArray()) {
            if (count[c - 'a'] == 0) return false;
            --count[c - 'a'];
        }

        return true;
    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        isAnagramUsingCharFrequency(s1, s2);
        isAnagram(s1, s2);
    }
}
