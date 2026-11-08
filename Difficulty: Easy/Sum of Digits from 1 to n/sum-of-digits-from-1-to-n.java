class Solution {
    public int sumOfDigits(int n) {
        if (n < 0) {
            return 0;
        }
        int totalSum = 0;
        int factor = 1;

        while (factor <= n) {
            int low = n % factor;
            int current = (n / factor) % 10;
            int high = n / (factor * 10);

            totalSum += high * 45 * factor;
            totalSum += current * (current - 1) / 2 * factor;
            totalSum += current * (low + 1);

            factor *= 10;
        }

        return totalSum;
    }
}