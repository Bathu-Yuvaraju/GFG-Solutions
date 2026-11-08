class Solution {
    public boolean isBinary(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}