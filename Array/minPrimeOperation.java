package Array;

public class minPrimeOperation {
    public int minOperations(int[] nums) {
        int totalCost = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                totalCost += costToPrime(nums[i]);
            } else {
                totalCost += costToNonPrime(nums[i]);
            }
        }

        return totalCost;
    }

    static int costToPrime(int n) {
        int count = 0;
        while (!isPrime(n)) {
            count++;
            n++;
        }
        return count;
    }

    static int costToNonPrime(int n) {
        int count = 0;
        while (isPrime(n)) {
            count++;
            n++;
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false; 
        }

        return true;
    }
}

