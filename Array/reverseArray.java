package Array;

public class reverseArray {
    public static void reverse(int num[]){
        int start=0,end=num.length-1;
        while (start<end) {
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
        
    }
    public static void printArray(int num[]){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,6,10,34,55,21,13};
        reverse(nums);
        printArray(nums);
    }
}
