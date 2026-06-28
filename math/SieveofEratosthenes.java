package math;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] prime = new boolean[n + 1];

        Arrays.fill(prime, true);

        if (n >= 0)
            prime[0] = false;
        if (n >= 1)
            prime[1] = false;

        for (int i = 2; i * i <= n; i++) {

            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
