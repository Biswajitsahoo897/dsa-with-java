package Sorting;
public class bubbleSorting {
    static void bubblesorting(int[] arr){
        int n=arr.length;
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j<i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
