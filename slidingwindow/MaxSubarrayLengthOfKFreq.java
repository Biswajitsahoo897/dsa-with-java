package slidingwindow;

import java.util.HashMap;

// leetcode 2958
public class MaxSubarrayLengthOfKFreq {
    static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int maxLength=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.get(nums[r])>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            
            maxLength=Math.max(r-l+1,maxLength);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,1,2,3,1,2};
        int k=2;

        System.out.println(maxSubarrayLength(arr, k));
    }
}
