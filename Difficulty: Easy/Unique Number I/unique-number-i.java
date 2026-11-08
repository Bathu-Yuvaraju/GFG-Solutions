class Solution {
    public int findUnique(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        return ans;
    }
}