class Solution {
    public int countPrimes(int n) {

        boolean[] prime = new boolean[n];

        // Initially assume every number is prime
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Mark non-prime numbers
        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Count remaining primes
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}
