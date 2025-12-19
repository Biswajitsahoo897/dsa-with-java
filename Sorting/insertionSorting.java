package Sorting;

public class insertionSorting {
    public static void main(String[] args) {
        int a[]={3,1,6,7,2,5,10,21,14};
        for (int i = 1; i < a.length; i++) {
            int temp=a[i];
            int j=i-1;
            while(j>-1&&temp<a[j]){
                a[j+1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        for (int j : a) {
            System.out.print(j+" ");
        }
    }
}
