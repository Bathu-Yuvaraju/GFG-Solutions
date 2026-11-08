class Solution {
    public int minOperations(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int x = 1; x * x <= i; x++) {
                if (i % x == 0) {
                    dp[i] = Math.min(dp[i], dp[i - x] + 1);
                    int y = i / x;
                    if (y < i && y > 0) {
                        dp[i] = Math.min(dp[i], dp[i - y] + 1);
                    }
                }
            }
        }
        return dp[n];
    }
}