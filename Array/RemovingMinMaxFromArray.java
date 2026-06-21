package Array;

public class RemovingMinMaxFromArray {
    public static int removeMinMax(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=0,maxIndex=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        int l=Math.min(maxIndex,minIndex);
        int r=Math.max(maxIndex,minIndex);
        
        // exploring three options , and choosing the min one  

        int op1=r+1;
        int op2=nums.length-l;
        int op3=(l+1)+(nums.length-r);

        return Math.min(op1,Math.min(op2,op3));
    }
    public static void main(String[] args) {
        int []nums={2,10,7,8,1,8,6};

        int count=removeMinMax(nums);
        System.out.println(count);
    }
}