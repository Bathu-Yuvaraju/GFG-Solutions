class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                if (result.isEmpty()
                        || result.get(result.size() - 1) != arr[i]) {
                    result.add(arr[i]);
                }
            }
        }

        return result;
    }
}