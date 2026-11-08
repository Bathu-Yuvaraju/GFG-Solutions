class Solution {
    public int minMen(int[] arr) {
        int n = arr.length;
        int[][] intervals = new int[n][2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int left = Math.max(0, i - arr[i]);
                int right = Math.min(n - 1, i + arr[i]);
                intervals[count++] = new int[]{left, right};
            }
        }

        java.util.Arrays.sort(intervals, 0, count, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        int ans = 0;
        int target = 0;
        int i = 0;

        while (target < n) {
            int farthest = -1;
            while (i < count && intervals[i][0] <= target) {
                farthest = Math.max(farthest, intervals[i][1]);
                i++;
            }

            if (farthest < target) {
                return -1;
            }

            target = farthest + 1;
            ans++;
        }

        return ans;
    }
}