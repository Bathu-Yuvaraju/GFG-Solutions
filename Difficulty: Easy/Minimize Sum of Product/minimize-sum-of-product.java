class Solution {
    public int minProductSum(int[] a, int[] b) {
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        int n = a.length;
        int minSum = 0;
        for (int i = 0; i < n; i++) {
            minSum += a[i] * b[n - 1 - i];
        }
        return minSum;
    }
}