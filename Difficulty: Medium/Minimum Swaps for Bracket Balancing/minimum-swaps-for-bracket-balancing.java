class Solution {
    static int minimumNumberOfSwaps(String s) {
        int countOpen = 0, countClose = 0, mismatched = 0, swaps = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '[') {
                countOpen++;
                if (mismatched > 0) {
                    swaps += mismatched;
                    mismatched--;
                }
            } else {
                countClose++;
                mismatched = countClose - countOpen;
            }
        }
        return swaps;
    }
}