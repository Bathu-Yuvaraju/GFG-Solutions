class Solution {
    public static String concatenatedString(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) == -1) {
                result.append(c);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (s1.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.length() == 0 ? "-1" : result.toString();
    }
}