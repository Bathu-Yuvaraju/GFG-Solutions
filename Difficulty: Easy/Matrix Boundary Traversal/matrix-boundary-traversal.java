class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        if (n == 0 || m == 0) return result;

        if (n == 1) {
            for (int j = 0; j < m; j++) {
                result.add(mat[0][j]);
            }
            return result;
        }

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                result.add(mat[i][0]);
            }
            return result;
        }

        for (int j = 0; j < m; j++) {
            result.add(mat[0][j]);
        }

        for (int i = 1; i < n; i++) {
            result.add(mat[i][m - 1]);
        }

        for (int j = m - 2; j >= 0; j--) {
            result.add(mat[n - 1][j]);
        }

        for (int i = n - 2; i > 0; i--) {
            result.add(mat[i][0]);
        }

        return result;
    }
}