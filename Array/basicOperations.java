package Array;

public class basicOperations {
    public static void printArray(int array[],int nonChangable){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int marks[]={2,3,4,6,7,10,33};
        int nonChangable=5;
        printArray(marks, nonChangable);
        System.err.println("The value remain unchanged");
        System.out.println(nonChangable);
    }
}
