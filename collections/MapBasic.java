package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapBasic {
    public static void main(String[] args) {

        // 1. HashMap 
        // best is O(1) , Worst is O(N)

        HashMap<String,Integer> map=new HashMap<>();
        map.put("ind",100);
        map.put("aus",300);
        map.put("uk",90);
        map.put("usa",40);

        
        // if key was an integer then write Integer k:map.keySet()
        // for(String s:map.keySet()){
        //     System.out.println("Key :"+s+" "+"value:"+map.get(s));
        // }
        
        System.out.println(map);
        

        // 2.LinkedHashMap
        // Insertion order maintained , uses doubly linkedlist internally , operation same as the HashMap

        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("ind",100);
        lhm.put("aus",300);
        lhm.put("usa",40);
        lhm.put("uk",90);
        
        System.err.println(lhm);
        
        
        // 3.TreeMap
        
        // keys are sorted
        TreeMap<String ,Integer> tm=new TreeMap<>();
        tm.put("uk",90);
        tm.put("ind",100);
        tm.put("usa",40);
        tm.put("aus",300);

        System.out.println(tm);
    }
}
