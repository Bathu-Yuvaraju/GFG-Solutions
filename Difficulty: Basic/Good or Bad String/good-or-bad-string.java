class Solution {
    boolean isGoodOrBad(String s) {
        int vowelCount = 0;
        int consCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                consCount = 0;
            } else if (ch == '?') {
                vowelCount++;
                consCount++;
            } else {
                consCount++;
                vowelCount = 0;
            }

            if (vowelCount > 5 || consCount > 3) {
                return false;
            }
        }

        return true;
    }
}