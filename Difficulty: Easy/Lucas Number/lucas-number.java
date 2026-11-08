class Solution {
    public long lucas(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;

        long mod = 1000000007;
        long a = 2;
        long b = 1;
        long c = 0;

        for (int i = 2; i <= n; i++) {
            c = (a + b) % mod;
            a = b;
            b = c;
        }

        return b;
    }
}