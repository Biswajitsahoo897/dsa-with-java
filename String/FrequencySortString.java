import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencySortString {
    static String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder res=new StringBuilder();
        // stored all the character , with respective freq
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        // stored all the characters
        List<Character> list=new ArrayList<>(map.keySet());

        //sorted
        list.sort((a,b)->map.get(b)-map.get(a));

        // then append and return
        for(char c:list){
            int count=map.get(c);
            while(count-->0){
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str="tree";
        System.out.println(frequencySort(str));
    }
}
