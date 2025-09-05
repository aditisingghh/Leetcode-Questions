class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;                    // no primes below 2

        boolean[] isComposite = new boolean[n]; // false ⇢ potentially prime
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {              // i is prime
                count++;
                if ((long) i * i < n) {         // mark multiples of i
                    for (int j = i * i; j < n; j += i)
                        isComposite[j] = true;
                }
            }
        }
        return count;
    }
}
