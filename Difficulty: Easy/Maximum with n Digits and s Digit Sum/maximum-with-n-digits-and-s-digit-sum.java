
class Solution {
    static String findLargest(int n, int s) {
        if (s == 0) {
            return n == 1 ? "0" : "-1";
        }
        if (s > 9 * n) {
            return "-1";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            result.append(digit);
            s -= digit;
        }

        return result.toString();
    }
}