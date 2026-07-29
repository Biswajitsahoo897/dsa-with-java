import java.util.HashMap;

public class WordPattern {
    static boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        if(pattern.length()!=str.length) return false;
        HashMap<Character, String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char curr=pattern.charAt(i);
            if(map1.containsKey(curr)){
                if(!map1.get(curr).equals(str[i])) return false;
            }
            else map1.put(curr,str[i]);
            if(map2.containsKey(str[i])){
                if(map2.get(str[i])!=curr) return false;
            }
            else map2.put(str[i],curr);
        }
        return true;
    }
    public static void main(String[] args) {
        String s="dog cat cat dog";
        String pattern ="abba";
        System.out.println(wordPattern(pattern, s));
    }
}
