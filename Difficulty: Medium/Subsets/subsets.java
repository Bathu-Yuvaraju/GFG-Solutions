
class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] arr, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(arr, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}