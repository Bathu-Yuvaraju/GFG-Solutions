class Solution {
    public int kthDistinct(int[] arr, int k) {
        java.util.LinkedHashMap<Integer, Integer> map = new java.util.LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == k) {
                    return entry.getKey();
                }
            }
        }
        return -1;
    }
}