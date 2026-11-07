class Solution {
    public int solve(int b, List<Integer> arr) {
        for (int ele : arr) {
            if (ele == b) {
                b = b * 2;
            }
        }
        return b;
    }
}