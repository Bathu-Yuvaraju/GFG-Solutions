class Solution {
    public int minimumInteger(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        long minVal = Long.MAX_VALUE;
        for (int num : arr) {
            if ((long) arr.length * num >= sum) {
                if (num < minVal) {
                    minVal = num;
                }
            }
        }
        return (int) minVal;
    }
}