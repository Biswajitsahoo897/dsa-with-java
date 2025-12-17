package Array;
import java.util.HashSet;

public class distinictElements {
    // Brute force approach -- O(n^2)
    static boolean containsDuplicate(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {                
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // expected approach -- O(n)
    static boolean usingHashSet(int []arr){
        HashSet<Integer> hset=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(hset.contains(arr[i])){
                return true;
            }
            else{
                hset.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []num={2,3,6,7,4,1};
        System.out.println(containsDuplicate(num));
        System.out.println(usingHashSet(num));
    }
}
