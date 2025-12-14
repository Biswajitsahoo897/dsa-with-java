package Array;

public class binarySearch {
    public static int binarysearch(int []num,int target){
        int start=0,end=num.length-1;
        // this method only works for the sorted array
        while (start<end) {
            int mid=(start+end)/2;
            if(num[mid]==target) return mid; //FOUND
            if(num[mid]<target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1; // Not FOUND
    }

    //printing the subarray
    
    public static void printSubarray(int num[]){
        for (int i = 0; i <=num.length; i++) {
            int start=i;
            for (int j = i+1; j <= num.length; j++) {
                int end=j;
                for (int k = start; k < end; k++) {
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // int[] nums = {2, 3, -8, 7, -1, 2, 3};
        int[] nums = {2, 5,8,35,66,70,90,101};

        int arr[]={2,4,6,8,10};
        int target=-8;
        System.out.println("The value is at index : "+binarysearch(nums, target));
        printSubarray(arr);
    }
}
