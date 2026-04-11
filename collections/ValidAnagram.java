package collections;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();

        String s="knee";
        String t="keen";

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        for(int i=0;i<t.length();i++){
            
            char curr=t.charAt(i);

            if(map.get(curr)!=null){
                if(map.get(curr)==1){
                    map.remove(curr);
                }else{
                    map.put(curr,map.get(curr)-1);
                }
            }
        }
        if(map.isEmpty()) System.out.println("True");
        else System.out.println("False");

    }
}
