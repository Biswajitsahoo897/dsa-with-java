package Array;

public class insertElementAtPos {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,9,11};
        int pos=4;
        int value=45;
        int n=arr.length;
        int newArr[]=new int[n+1];
        for (int i = 0; i <=n; i++) {
            if(i<pos){
                newArr[i]=arr[i];
            }
            else if(i==pos){
                newArr[i]=value;
            }
            else{
                newArr[i]=arr[i-1];
            }
        }
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
}
