class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n < 0) return res;

        long mod = 1000000007;
        long a = 0, b = 1;

        res.add(0);
        if (n == 0) return res;

        res.add(1);
        for (int i = 2; i <= n; i++) {
            long next = (a + b) % mod;
            res.add((int) next);
            a = b;
            b = next;
        }

        return res;
    }
}