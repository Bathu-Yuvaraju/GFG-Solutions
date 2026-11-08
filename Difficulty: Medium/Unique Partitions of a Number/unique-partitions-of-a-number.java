class Solution {
    public ArrayList<ArrayList<Integer>> uniquePartitions(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(n, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int target, int maxVal, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = Math.min(target, maxVal); i >= 1; i--) {
            current.add(i);
            backtrack(target - i, i, current, result);
            current.remove(current.size() - 1);
        }
    }
}