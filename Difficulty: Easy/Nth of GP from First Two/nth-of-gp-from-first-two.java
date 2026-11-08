class Solution {
    public int termOfGP(int a, int b, int n) {
        double r = (double) b / a;
        return (int) Math.round(a * Math.pow(r, n - 1));
    }
}