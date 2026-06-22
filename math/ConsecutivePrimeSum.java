package math;
import java.util.*;

public class ConsecutivePrimeSum {
    
    // Sieve of Eratosthenes to generate primes up to limit
    public static List<Integer> sieveOfEratosthenes(int limit) {
        if (limit < 2) {
            return new ArrayList<>();
        }
        
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i=2;i*i<=limit;i++) {
            if (isPrime[i]) {
                for (int j=i*i;j<=limit;j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i=2;i<=limit;i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }


    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Count primes that are sum of consecutive primes starting from 2
    public static int countConsecutivePrimeSum(long N) {
        int limit = (int) Math.min(N, 200000);
        List<Integer> primes = sieveOfEratosthenes(limit);
        
        int count = 0;
        long cumulativeSum = 0;
        
        for (int i = 0; i < primes.size(); i++) {
            cumulativeSum += primes.get(i);
            
            // if sum exceeds then stop
            if (cumulativeSum > N) {
                break;
            }
            
            // Need at least 2 primes in the sum (skip i=0 which is just 2)
            if (i > 0 && isPrime(cumulativeSum)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        
        int result = countConsecutivePrimeSum(N);
        System.out.println(result);
        
        scanner.close();
    }
}
