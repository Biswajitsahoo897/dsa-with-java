package Array;

public class moveAllZerosToEnd {
    public static void moveallzerostoend(int []arr){
        int idx = 0;
        //Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }

        //fill remaining with zeros
        while (idx < arr.length) {
            arr[idx++] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,0, 3,-8,0,5, 7, -1, 2, 3,0};
        moveallzerostoend(nums);
        printArray(nums);
    }
}
