class Solution {
    public int maxSum(int[] arr, int k) {
        long currentSum = 0;
        long maxSum = 0;

        for (int num : arr) {
            if (num <= k) {
                currentSum += num;
                maxSum = Math.max(maxSum, currentSum);
            } else {
                currentSum = 0;
            }
        }

        return (int) maxSum;
    }
}