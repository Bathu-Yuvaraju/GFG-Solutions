class Solution {
    public int sumBetweenK1K2(int[] arr, int k1, int k2) {
        java.util.Arrays.sort(arr);
        int sum = 0;
        for (int i = k1; i < k2 - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }
}