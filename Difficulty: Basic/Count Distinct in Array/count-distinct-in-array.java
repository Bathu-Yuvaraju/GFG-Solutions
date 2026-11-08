class Solution {
    public int countDistinct(int arr[]) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}