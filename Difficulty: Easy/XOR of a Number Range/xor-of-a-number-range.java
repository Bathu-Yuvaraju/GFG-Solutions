class Solution {
    public int findXOR(int l, int r) {
        return computeXOR(r) ^ computeXOR(l - 1);
    }

    private int computeXOR(int n) {
        if (n <= 0) {
            return 0;
        }
        int remainder = n % 4;
        if (remainder == 0) {
            return n;
        } else if (remainder == 1) {
            return 1;
        } else if (remainder == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}