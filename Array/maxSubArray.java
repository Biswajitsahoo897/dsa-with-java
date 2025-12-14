package Array;

// kadane's algo

public class maxSubArray {
    public static int maxsubarray(int []arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0; //for handling the negative numbers like in this case

        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Maximum sum of array is : "+maxsubarray(nums));
    }
}
