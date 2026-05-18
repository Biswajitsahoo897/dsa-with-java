package collections;

import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElement {
    static int[] topKFrequent(int[] nums, int k) {
        int []res=new int[k];
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Integer[] newNums=new Integer[map.size()];
        int j=0;
        for(int p:map.keySet()){
            newNums[j++]=p;
        }

        Arrays.sort(newNums,(a,b)->map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            res[i]=newNums[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3};
        int k=2;
        System.out.println(topKFrequent(arr, k));
    }
}
