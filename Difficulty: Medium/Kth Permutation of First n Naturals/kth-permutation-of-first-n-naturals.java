class Solution {
    public static String kthPermutation(int n, int k) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);

        k--;
        StringBuilder sb = new StringBuilder();

        while (true) {
            sb.append(numbers.remove(k / fact));
            if (numbers.isEmpty()) {
                break;
            }
            k %= fact;
            fact /= numbers.size();
        }

        return sb.toString();
    }
}