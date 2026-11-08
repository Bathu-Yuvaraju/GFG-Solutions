class Solution {
    public boolean isDivBy8(String s) {
        int n = s.length();
        if (n == 0) return false;

        if (n <= 3) {
            int num = Integer.parseInt(s);
            return num % 8 == 0;
        }

        String lastThree = s.substring(n - 3);
        int num = Integer.parseInt(lastThree);
        return num % 8 == 0;
    }
}