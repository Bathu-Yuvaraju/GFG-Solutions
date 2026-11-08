class Solution {
    boolean isMultipleOf3(String s) {
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        return Math.abs(oddCount - evenCount) % 3 == 0;
    }
}