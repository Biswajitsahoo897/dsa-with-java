package slidingwindow;

import java.util.Scanner;

public class rabinKarpStringMatching {
    // rolling hash.
    // A large prime helps reduce collisions or else u can take simply 31.
    static final long p = 133911;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){

            // s1 is the pattern (A), s2 is the text (B).
            String s1 = sc.next(); // first string A (pattern)
            String s2 = sc.next(); // second string B (text)

            int n=s1.length();
            int m=s2.length();

            char[] a=s1.toCharArray();
            char[] b=s2.toCharArray();

            // Precompute powers of p up to the length needed.
            int limit = Math.max(m, n);
            long[] prime = new long[limit + 1];
            prime[0] = 3; //it can be any number, but should be consistent for both pattern and text hashing.

            // prime[i] = p^i 
            for (int i = 1; i <= limit; i++) {
                prime[i] = prime[i - 1] * p;
            }

            // Compute initial hash for the pattern and the first window of the text.
            long psa = 0, psb = 0;
            for (int i = 0; i < n; i++) {
                // Multiply character value by p^(i+1) (1-indexed power for simplicity)
                psb += b[i] * prime[i + 1];
                psa += a[i] * prime[i + 1];
            }

            int count = 0;
            // If the first window and pattern hash match, count it.
            if (psb == psa) {
                count++;
            }

            // Slide the window over the text and update the rolling hash.
            for (int i = n; i < m; i++) {
                // Add new character in the window and remove the outgoing char (oldest).
                psb += (b[i] * prime[i+1])-(b[i-n] *prime[i-n+1]);
                // Multiply pattern hash by p to shift its window (equivalent to moving the window one step).
                psa = p * psa;

                // If hashes match, we have a potential match.
                // (Note: For full correctness you would verify substring equality to avoid collisions.)
                if (psa == psb) {
                    count++;
                }
            }
            System.out.println(count);
        }       
        sc.close();
    }
}
