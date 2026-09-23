class Solution {
    static int countPairs(int a[], int b[], int x) {
        int l = 0;
        int r = b.length - 1;
        int c = 0;
        while (l < a.length && r >= 0) {
            int sum = a[l] + b[r];
            if (sum == x) {
                c++;
                l++;
                r--;
            } else if (sum > x) {
                r--;
            } else {
                l++;
            }
        }
        return c;
    }
}