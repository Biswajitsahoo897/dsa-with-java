package Array;

import java.util.Arrays;

public class majorityElementInArray {
    public static int majorityElementUsingSorting(int []nums){
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
    public static int  majorityElement(int []nums){
        // using Boyer-Moore Majority Voting Algorithm , having more than k-occurrence
        int candidate=0,count=0;
        for (int i : nums) {
            if(count==0){
                candidate=i;
                count++;
            }
            else if(candidate==i){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;

    }
    public static void main(String[] args) {
        int []arr={1,3,1,5,1,2,1,1};
        System.out.println("Majority element is :(Moore's algo) "+majorityElement(arr));
        System.out.println("Majority element is(Using inbuild sorting) : "+majorityElementUsingSorting(arr));

    }
}
