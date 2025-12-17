package Array;

public class rotateArray {
    public static void reverse(int[] arr,int start,int end){
        while (start<=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []nums={1,2,4,5,9,8};
        System.out.println("Original Array :");
        for (int i : nums) {
            System.out.print(i+" ");
            
        }
        System.out.println();

        System.out.println("Array reverse order print");
        int n=nums.length;
        if(n==0)return;
        int d=2;
        d%=n;
        // first reverse d element
        reverse(nums, 0,d-1);
        // reverse remaining n-d elements
        reverse(nums, d,n-1);
        // then reverse the entire array
        reverse(nums, 0,n-1);
    }
}
