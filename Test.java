// import java.util.Arrays;
// import java.util.Collections;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        int []arr={1,5,7,2,4,5,6};
        int xor = 0;
        int n=arr.length;
        // Step 1: XOR all array elements
        for (int num : arr) {
            xor ^= num;
        }
        
        // Step 2: XOR 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        System.out.println(xor);
    }
}

/*
Note:
u can only use Collections.reverseOrder() in an Integer array not int array

*/