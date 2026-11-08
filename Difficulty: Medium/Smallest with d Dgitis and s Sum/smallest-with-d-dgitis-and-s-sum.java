
class Solution {
    public String smallestNumber(int s, int d) {
        if (s > 9 * d || s <= 0) {
            return "-1";
        }

        char[] result = new char[d];
        s -= 1;

        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                result[i] = (char) ('0' + 9);
                s -= 9;
            } else {
                result[i] = (char) ('0' + s);
                s = 0;
            }
        }

        result[0] = (char) ('0' + s + 1);

        return new String(result);
    }
}