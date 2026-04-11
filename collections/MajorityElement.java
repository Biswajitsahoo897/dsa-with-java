package collections;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int []arr={1,2,1,5,4,2,9,8,2};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        
        for(int i=0;i<n;i++){
            if(map.get(arr[i])>=(n/3)){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    
}