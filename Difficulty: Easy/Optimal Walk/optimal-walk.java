class Solution {
    public int optimalWalk(int n, int a, int b) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + a;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + b);
            } else {
                dp[i] = Math.min(dp[i], dp[(i + 1) / 2] + b + a);
            }
        }

        return dp[n];
    }
}