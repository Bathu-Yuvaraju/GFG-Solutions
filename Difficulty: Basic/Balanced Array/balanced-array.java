class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n / 2; i++) {
            leftSum += arr.get(i);
        }

        for (int i = n / 2; i < n; i++) {
            rightSum += arr.get(i);
        }

        return Math.abs(leftSum - rightSum);
    }
};