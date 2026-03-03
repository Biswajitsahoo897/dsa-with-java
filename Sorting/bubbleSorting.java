package Sorting;
public class bubbleSorting {
    // u can't just pass only i , j to swap function because it doesn't know which array to swap in
    //  so we have to pass the array as well , basic coding stuff
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void bubblesorting(int[] arr){
        int n=arr.length;
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j<i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        printArray(arr);
    }
    static void printArray(int []arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []a={4,2,1,5,8,3,10};
        System.out.println("Original Array :");
        printArray(a);
        System.out.println("After sorting : ");
        bubblesorting(a);
    }
}
