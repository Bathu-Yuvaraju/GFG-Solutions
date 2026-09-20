import java.util.HashSet;
class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Long> seen = new HashSet<>();
        int zeroCount = 0;
        for (int num : arr) {
            long x = num;
            if (x == 0) {
                zeroCount++;
                if (target == 0 && (seen.size() > 0 || zeroCount > 1)) {
                    return true;
                }
                seen.add(x);
                continue;
            }
            if (target % x == 0) {
                long complement = target / x;
                if (seen.contains(complement)) {
                    return true;
                }
            }
            seen.add(x);
        }
        return false;
    }
}