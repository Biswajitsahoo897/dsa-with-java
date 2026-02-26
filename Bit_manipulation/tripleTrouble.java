package Bit_manipulation;
import java.util.Scanner;

public class tripleTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < 31; i++) {
                count = 0;
                for (int num : arr) {
                    if (((num >> i) & 1) == 1) {
                        count++;
                    }
                }
                if (count % 3 != 0) {
                    ans |= (1 << i);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
