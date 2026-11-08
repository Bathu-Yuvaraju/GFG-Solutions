class Solution {
    public int toyCount(int[] arr, int k) {
        java.util.Arrays.sort(arr);
        int count = 0;
        long currentSum = 0;

        for (int cost : arr) {
            currentSum += cost;
            if (currentSum <= k) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}