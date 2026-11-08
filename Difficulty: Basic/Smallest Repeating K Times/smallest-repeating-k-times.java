class Solution {
    public int findDuplicate(int[] arr, int k) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int minElement = Integer.MAX_VALUE;
        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == k) {
                if (entry.getKey() < minElement) {
                    minElement = entry.getKey();
                }
            }
        }
        return minElement == Integer.MAX_VALUE ? -1 : minElement;
    }
}