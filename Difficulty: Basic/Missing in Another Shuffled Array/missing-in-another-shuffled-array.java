class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr1) {
                map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : arr2) {
                map.put(x, map.get(x) - 1);
            }
            for (int x : arr1) {
                if (map.get(x) > 0) {
                    return x;
                    }
                }
                return -1;
            }
        }