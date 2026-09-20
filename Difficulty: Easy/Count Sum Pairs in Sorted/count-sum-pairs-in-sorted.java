class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int e: arr) {
            int sum = target - e;

            count+=map.getOrDefault(sum, 0);
            map.put(e, map.getOrDefault(e, 0)+1);
        }

        return count;
    }
}