package Array;

public class NextPermutation {
    static void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;

        // first find the breakpoint
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        // if there isn't any, then just rev the entire array
        // means the current one is the last permutation so back to original
        if(idx==-1){
            rev(nums,0,n-1);
            return;
        }
        
        // find the next greater and the swap
        for(int i=n-1;i>=idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,idx,i);
                break;
            }
        }

        // reverse the suffix wala part
        rev(nums,idx+1,n-1);
    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void rev(int []arr,int a,int b){
        while(a<b){
            swap(arr,a++,b--);
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3};
        nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
