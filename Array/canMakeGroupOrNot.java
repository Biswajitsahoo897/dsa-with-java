package Array;
import java.util.*;
    
public class canMakeGroupOrNot {

    static boolean canGroup(int[] hand, int groupSize) {
        
        if (hand.length % groupSize != 0) return false;
        
        Map<Integer, Integer> map = new TreeMap<>(); //using treemap as it stores the key in sorted format
        
        // counting the freq 
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int num : map.keySet()) {
            int freq = map.get(num);
            
            if (freq > 0) {
                for (int i = 0; i < groupSize; i++) {
                    int next = num + i;
                    
                    if (map.getOrDefault(next, 0) < freq) {
                        return false;
                    }
                    
                    map.put(next, map.get(next) - freq);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // int []hand = {1,2,3,4,6,7,8}; //false
        int []hand = {1,2,3,6,7,8,9,10,11}; //true
        int groupSize = 3;
        System.out.println(canGroup(hand, groupSize));
    }
}

