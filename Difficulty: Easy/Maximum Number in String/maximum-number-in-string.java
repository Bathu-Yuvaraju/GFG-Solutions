class Solution {
    static int extractMaximum(String s) {
        int maxVal = -1;
        int currentVal = 0;
        boolean hasNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                currentVal = currentVal * 10 + (c - '0');
                hasNumber = true;
            } else {
                if (hasNumber) {
                    maxVal = Math.max(maxVal, currentVal);
                    currentVal = 0;
                    hasNumber = false;
                }
            }
        }

        if (hasNumber) {
            maxVal = Math.max(maxVal, currentVal);
        }

        return maxVal;
    }
}