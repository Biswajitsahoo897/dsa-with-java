package Array;

public class maxSubArray {

    // kadane's algo ( always recommended)
    public static int maxSubArraySum3(int []arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0; //for handling the negative numbers like in this case

        }
        return max;
    }
    
    // Brute force approach 
    public static int maxSubArraySum1(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(currSum>maxSum) maxSum=currSum;
            }
            // System.out.println(maxSum);
        }
        return maxSum;
    }

    //using prefix sum array 
    
    public static int maxSubArraySum2(int [] arr){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0]; //the first one is same 
        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        // for jsut printing the prefix array 
        System.out.println("Printing the prefix sum array: ");
        for (int i : prefix) {
            System.out.print(i+" ");
            
        }
        System.out.println();
        int maxSum=0;
        for (int i = 0; i < n; i++) {
            int start=i;
            for (int j = i; j < n; j++) {
                int end=j;
                int currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                
                if(currSum>maxSum) maxSum=currSum;
            }
            // System.out.println(maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Max sub-array sum is(kadane's algo) : "+maxSubArraySum3(nums));
        System.out.println("Max sub-array sum is(using Brute force) : "+maxSubArraySum1(nums));
        System.out.println("Max sub-array sum is(using prefix sum) : "+maxSubArraySum2(nums));

        // maxSubArraySum2(nums);
    }
}
