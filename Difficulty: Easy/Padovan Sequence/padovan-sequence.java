class Solution {
    public int padovanSequence(int n) {
        if (n <= 2) {
            return 1;
        }

        long p0 = 1;
        long p1 = 1;
        long p2 = 1;
        long current = 0;
        long mod = 1000000007;

        for (int i = 3; i <= n; i++) {
            current = (p1 + p0) % mod;
            p0 = p1;
            p1 = p2;
            p2 = current;
        }

        return (int) p2;
    }
}