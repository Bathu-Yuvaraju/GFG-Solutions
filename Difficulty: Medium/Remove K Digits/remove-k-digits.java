
class Solution {
    public String removeKdig(String s, int k) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1) > c) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(c);
        }

        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        int nonZeroIdx = 0;
        while (nonZeroIdx < stack.length() && stack.charAt(nonZeroIdx) == '0') {
            nonZeroIdx++;
        }

        String result = stack.substring(nonZeroIdx);
        return result.length() == 0 ? "0" : result;
    }
}