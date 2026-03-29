package Sorting;

public class HeapSort {

    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void heapify(int []arr,int i ,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxidx=i;
        // left part
        if(left<size && arr[maxidx]<arr[left]){
            maxidx=left;
        }
        
        // right part
        if(right<size && arr[maxidx]<arr[right]){
            maxidx=right;
        }

        if(maxidx!=i){
            swap(arr, i, maxidx);
            heapify(arr, maxidx, size);
        }
    }
    static void heapSort(int []arr){
        // step 1 build max heap first 
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,i,n); //it's a maxHeap ofc bcz the we are swaping with the first element with the last one
        }

        // step 2 push the maxelement to the end of the array
        // sorting phase 
        for(int i=n-1;i>=0;i--){
            swap(arr, 0, i); //move max ele to the end of the array
            heapify(arr, 0, i); //fix the reamining element 
        }

    }
    public static void main(String[] args) {
        int []arr={1,2,4,5,3,9,10,7};
        heapSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
