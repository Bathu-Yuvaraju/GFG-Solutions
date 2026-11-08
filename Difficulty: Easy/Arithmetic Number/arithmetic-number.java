class Solution {
    static int inSequence(int a, int b, int c) {

        if (c == 0) {
            if (a == b)
                return 1;
            else
                return 0;
        }

        if ((b - a) % c == 0 && (b - a) / c >= 0)
            return 1;
        else
            return 0;
    }
}