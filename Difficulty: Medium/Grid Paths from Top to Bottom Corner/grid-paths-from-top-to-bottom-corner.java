class Solution {
    public ArrayList<ArrayList<Integer>> allPaths(int[][] mat) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        backtrack(mat, 0, 0, currentPath, result);
        return result;
    }

    private void backtrack(int[][] mat, int r, int c, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> result) {
        int n = mat.length;
        int m = mat[0].length;

        currentPath.add(mat[r][c]);

        if (r == n - 1 && c == m - 1) {
            result.add(new ArrayList<>(currentPath));
        } else {
            if (r + 1 < n) {
                backtrack(mat, r + 1, c, currentPath, result);
            }
            if (c + 1 < m) {
                backtrack(mat, r, c + 1, currentPath, result);
            }
        }

        currentPath.remove(currentPath.size() - 1);
    }
}