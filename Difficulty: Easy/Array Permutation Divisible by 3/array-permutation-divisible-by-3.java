class Solution {
    public boolean isPossible(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum % 3 == 0;
    }
}