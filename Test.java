// import java.util.Arrays;
// import java.util.Collections;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {10, 11, 8},
            {3, 14, 15},
            {16, 17, 1},
            {9, 5, 6},
            {8, 8, 97},
            {19, 20, 21}
        };

        Arrays.sort(arr,Comparator.comparingInt(o->o[1]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Note:
u can only use Collections.reverseOrder() in an Integer array not int array

*/