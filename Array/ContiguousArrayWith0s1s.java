package Array;

import java.util.HashMap;

public class ContiguousArrayWith0s1s {

    static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        int maxl=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefixSum+=-1;
            }else{
                prefixSum+=1;
            }

            if(map.containsKey(prefixSum)){
                int l=i-map.get(prefixSum);
                maxl=Math.max(l,maxl);
            }
            else {
                map.put(prefixSum,i);
            }
        }
        return maxl;
    }
    public static void main(String[] args) {
        int []arr={1,0,0,1,0,1,1,0,0,1};
        System.out.println(findMaxLength(arr));
    }
}