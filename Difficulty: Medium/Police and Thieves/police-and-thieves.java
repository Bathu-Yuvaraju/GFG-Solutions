class Solution {
    public int catchThieves(char[] arr, int k) {
        int n = arr.length;
        int ans = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            while (i < n && arr[i] != 'P') {
                i++;
            }
            while (j < n && arr[j] != 'T') {
                j++;
            }

            if (i < n && j < n) {
                if (Math.abs(i - j) <= k) {
                    ans++;
                    i++;
                    j++;
                } else if (i < j) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        return ans;
    }
}