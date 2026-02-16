package Recursion;
import java.util.HashSet;

public class removeDuplicatesInString {
    static void removeDuplicates(String str,int index,StringBuilder newStr,boolean []map){
        str=str.toLowerCase();
        if(index==str.length()){
            System.out.println(newStr.toString());
            return;
        }
        char currChar=str.charAt(index);

        if(map[currChar-'a']==true){
            removeDuplicates(str, index+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, index+1, newStr.append(currChar), map);
        }
    }

    // using HashSet
    static void removeDuplicatesUsingHashSet(String str, int index, StringBuilder newStr, HashSet<Character> seen) {
    if (index == str.length()) {
        System.out.println(newStr.toString());
        return;
    }
    
    char currChar = str.charAt(index);
    
    if (seen.contains(currChar)) {
        removeDuplicatesUsingHashSet(str, index + 1, newStr, seen);
    } else {
        seen.add(currChar);
        removeDuplicatesUsingHashSet(str, index + 1, newStr.append(currChar), seen);
    }
}
    public static void main(String[] args) {
        String s="helloJavaDevloper";

        removeDuplicates(s, 0, new StringBuilder(""), new boolean[26]);

        removeDuplicatesUsingHashSet(s, 0, new StringBuilder(""), new HashSet<>());
    }
}
