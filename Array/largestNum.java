package Array;

public class largestNum {
    public static int largestNumber(int marks[]){
        int large=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if(large<marks[i]){
                secLarge=large;
                large=marks[i];
            }
            else if(marks[i]>secLarge || large!=marks[i]){
                secLarge=marks[i];
            }
        }
        return large;   // for largest
        // return secLarge; // for second largest
    }
    public static void main(String[] args) {
        int marks[]={2,5,10,101,32,90,54,3,99};
        System.out.println("The Highest mark is :"+largestNumber(marks));
        // System.out.println("The second highest mark is :"+largestNumber(marks));
    }
}
