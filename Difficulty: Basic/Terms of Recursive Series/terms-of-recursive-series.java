class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        if (n >= 1) {
            result.add(0);
        }
        if (n >= 2) {
            result.add(1);
        }
        for (int i = 2; i < n; i++) {
            long prev2 = result.get(i - 2);
            long prev1 = result.get(i - 1);
            int nextTerm = (int) (prev2 * prev2 - prev1);
            result.add(nextTerm);
        }
        return result;
    }
}