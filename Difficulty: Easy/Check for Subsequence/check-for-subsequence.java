class Solution {
    public boolean isSubSeq(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int l = 0, r = 0;
        while (l < l1 && r < l2) {
            if (s1.charAt(l) == s2.charAt(r)) {
                l++;
            }
            r++;
        }
        return l == l1;
    }
}