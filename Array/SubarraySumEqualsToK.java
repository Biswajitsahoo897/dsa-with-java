package Array;

import java.util.HashMap;

public class SubarraySumEqualsToK {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int currSum=0;
        int count=0;
        for(int num:nums){
            currSum+=num;

            if(currSum==k){
                count++;
            }

            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);    
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,1,9,8,-3,7,1};
        System.out.println(subarraySum(arr, 5));
    }
}
