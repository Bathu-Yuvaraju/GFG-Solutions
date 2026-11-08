class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        Collections.sort(arr, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}