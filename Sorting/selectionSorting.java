package Sorting;

public class selectionSorting {

    public static void main(String[] args) {
        int[]arr={3,90,6,7,2,9,10,1,11};
        int n =arr.length;
        for (int i = 0; i <n; i++) {
            int minIndex=i;
            for (int j = i+1; j <n; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            // swap the values
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
