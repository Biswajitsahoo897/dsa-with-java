package Bit_manipulation;

import java.util.ArrayList;

public class MissingAndRepeating {
    static ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        int setBit = xor & -xor;
        int x = 0, y = 0;
        for (int num : arr) {
            if ((num & setBit) != 0)
                x ^= num;
            else
                y ^= num;
        }
        for (int i = 1; i <= n; i++) {
            if ((i & setBit) != 0)
                x ^= i;
            else
                y ^= i;
        }
        for (int num : arr) {
            if (num == x) {
                list.add(x); 
                list.add(y);
                return list;
            }
        }
        list.add(y);
        list.add(x);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println(findTwoElement(arr));
    }
}
