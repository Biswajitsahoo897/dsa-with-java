package Array;
// Leetcode 238 
public class productOfArrrayExceptSelf {
    public static int [] productExceptSelf(int[]nums){
        int n=nums.length;
        int []result=new int[n];
        int p=1;
        for(int i=0;i<n;i++){
            result[i]=p;
            p*=nums[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            result[i]*=p;
            p*=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int []arr=productExceptSelf(nums);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
