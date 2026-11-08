class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        java.util.LinkedHashMap<Integer, Integer> map = new java.util.LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
}