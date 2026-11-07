class Solution {
    public int helper(int[] arr, int k, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == k) {
            return mid; 
        } else if (arr[mid] > k) {
            return helper(arr, k, lo, mid - 1);
        } else {
            return helper(arr, k, mid + 1, hi);
        }
    }

    public int binarySearch(int[] arr, int k) {
        int n = arr.length;
        return helper(arr, k, 0, n - 1);
    }
}