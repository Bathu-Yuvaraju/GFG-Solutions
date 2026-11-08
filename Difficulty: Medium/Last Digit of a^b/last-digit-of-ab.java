class Solution {
    public int getLastDigit(String a, String b) {
        if (b.equals("0")) return 1;

        // Correct way to get the last digit of string 'a'
        int n = a.charAt(a.length() - 1) - '0';

        int p = 0;
        // Correct way to loop through characters of string 'b'
        for (char c : b.toCharArray()) {
            p = (p * 10 + (c - '0')) % 4;
        }

        if (n == 0 || n == 1 || n == 5 || n == 6) return n;
        else if (n == 4 || n == 9) {
            p = (p % 2);
            if (p == 1) return n == 4 ? 4 : 9;
            else return n == 4 ? 6 : 1;
        } else {
            p = (p % 4);
            if (p == 1) {
                if (n == 2) return 2;
                else if (n == 3) return 3;
                else if (n == 7) return 7;
                else return 8;
            } else if (p == 2) {
                if (n == 2) return 4;
                else if (n == 3) return 9;
                else if (n == 7) return 9;
                else return 4;
            } else if (p == 3) {
                if (n == 2) return 8;
                else if (n == 3) return 7;
                else if (n == 7) return 3;
                else return 2;
            } else {
                if (n == 2) return 6;
                else if (n == 3) return 1;
                else if (n == 7) return 1;
                else return 6;
            }
        }
    }
}