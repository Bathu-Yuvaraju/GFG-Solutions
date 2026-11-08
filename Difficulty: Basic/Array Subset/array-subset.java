class Solution {
    public boolean isSubset(int a[], int b[]) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }
        return true;
    }
}