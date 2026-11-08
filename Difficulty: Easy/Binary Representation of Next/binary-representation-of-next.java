class Solution {
    public String binaryNextNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();

        int idx = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (sb.charAt(i) == '0') {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            sb.insert(0, '1');
            for (int i = 1; i <= n; i++) {
                sb.setCharAt(i, '0');
            }
        } else {
            sb.setCharAt(idx, '1');
            for (int i = idx + 1; i < n; i++) {
                sb.setCharAt(i, '0');
            }
        }

        int firstOne = 0;
        while (firstOne < sb.length() && sb.charAt(firstOne) == '0') {
            firstOne++;
        }

        return sb.substring(firstOne);
    }
}