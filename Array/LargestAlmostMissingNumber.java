package Array;

import java.util.HashMap;
import java.util.HashSet;

// leetcode 3471
public class LargestAlmostMissingNumber {
    static int largestInteger(int []nums,int k){
        int res=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> set=new HashSet<>();
            
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }

            for(int iter:set){
                map.put(iter,map.getOrDefault(iter,0)+1);
            }
        }

        for(int x:map.keySet()){
            if(map.get(x)==1){
                res=Math.max(res,x);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={3,9,7,2,1,7}; int k=3;
        System.out.println(largestInteger(arr, k));

    }
}
