class Solution {
    public int binarySubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count * (count - 1) / 2;
    }
}