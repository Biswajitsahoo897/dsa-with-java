package Array;

public class Sort_0_And_1 {
    static void swap(int []arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int []arr={1,0,0,1,0,1,0,1};
        // using two pointer
        int p1=0,p2=arr.length-1;
        while(p1<p2){
            if(arr[p1]==0) p1++;
            else if(arr[p2]==1) p2--;
            else {
                swap(arr,p1,p2);
                p1++;
                p2--;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
