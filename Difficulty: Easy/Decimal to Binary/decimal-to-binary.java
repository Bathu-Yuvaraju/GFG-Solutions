class Solution {
    static String decToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }

        return binary.reverse().toString();
    }
}