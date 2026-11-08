class Solution {
    public int sequence(int n) {
        long mod = 1000000007;
        long totalSum = 0;
        int start = 1; // Tracks the starting number of the current term

        for (int i = 1; i <= n; i++) {
            long termProduct = 1;

            // Multiply i consecutive numbers for the i-th term
            for (int j = 1; j <= i; j++) {
                termProduct = (termProduct * start) % mod;
                start++;
            }

            // Add the term product to the total sum
            totalSum = (totalSum + termProduct) % mod;
        }

        return (int) totalSum;
    }
}