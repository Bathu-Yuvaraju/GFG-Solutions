class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> ans = new ArrayList<>();
        ans.add(n);

        while (n != 1) {
            long next;
            if (n % 2 == 0) {
                // Even number case: floor(sqrt(n))
                next = (long) Math.pow(n, 0.5);
            } else {
                // Odd number case: floor(n^(3/2))
                next = (long) Math.pow(n, 1.5);
            }
            n = next;
            ans.add(n);
        }

        return ans;
    }
}