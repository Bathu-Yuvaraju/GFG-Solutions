import java.util.*;
class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : arr2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        List<pair> r = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int complement = target - arr1[i];
            if (map2.containsKey(complement)) {
                int count = map2.get(complement);
                for (int k = 0; k < count; k++) {
                    r.add(new pair(arr1[i], complement));
                }
            }
        }
        return r.toArray(new pair[0]);
    }
}