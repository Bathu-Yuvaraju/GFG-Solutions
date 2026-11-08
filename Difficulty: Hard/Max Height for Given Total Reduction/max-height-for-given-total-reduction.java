class Solution {
    public int maxHeight(int[] arr, int m) {
        int low = 0;
        int high = 0;

        // Find the maximum height in the array to set the upper bound
        for (int height : arr) {
            high = Math.max(high, height);
        }

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, m, mid)) {
                ans = mid;         // mid is a valid height, try for a higher one
                low = mid + 1;
            } else {
                high = mid - 1;    // wood collected is less than m, reduce height
            }
        }

        return ans;
    }

    private boolean isPossible(int[] arr, int m, int h) {
        long totalWood = 0;
        for (int height : arr) {
            if (height > h) {
                totalWood += (height - h);
            }
            // Early optimization: if total wood already meets or exceeds m
            if (totalWood >= m) {
                return true;
            }
        }
        return totalWood >= m;
    }
}