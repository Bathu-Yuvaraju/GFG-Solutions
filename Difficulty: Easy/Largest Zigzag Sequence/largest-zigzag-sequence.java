class Solution {
    public int zigzagSequence(int[][] mat) {
        int n = mat.length;
        int[] dp = new int[n];

        for (int j = 0; j < n; j++) {
            dp[j] = mat[0][j];
        }

        for (int i = 1; i < n; i++) {
            int[] nextDp = new int[n];
            for (int j = 0; j < n; j++) {
                int maxPrev = 0;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        maxPrev = Math.max(maxPrev, dp[k]);
                    }
                }
                nextDp[j] = mat[i][j] + maxPrev;
            }
            dp = nextDp;
        }

        int ans = 0;
        for (int j = 0; j < n; j++) {
            ans = Math.max(ans, dp[j]);
        }

        return ans;
    }
}