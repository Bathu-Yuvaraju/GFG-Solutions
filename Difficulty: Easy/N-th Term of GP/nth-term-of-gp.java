class Solution {
    public int nthTerm(int a, int r, int n) {
        long mod = 1000000007;
        long ans = a;
        long base = r;
        long power = n - 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans = (ans * base) % mod;
            }
            base = (base * base) % mod;
            power >>= 1;
        }

        return (int) ans;
    }
}