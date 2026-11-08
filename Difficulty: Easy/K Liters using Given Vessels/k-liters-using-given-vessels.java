class Solution {
    public boolean canFillContainer(int[] arr, int k) {
        boolean[] dp = new boolean[k + 1];
        dp[0] = true;

        for (int i = 0; i <= k; i++) {
            if (dp[i]) {
                for (int vessel : arr) {
                    if (i + vessel <= k) {
                        dp[i + vessel] = true;
                    }
                }
            }
        }

        return dp[k];
    }
}