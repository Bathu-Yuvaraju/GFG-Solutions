class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if (dfs(mat, word, i, j, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] mat, String word, int r, int c, int idx, boolean[][] visited) {
        if (idx == word.length()) {
            return true;
        }

        if (r < 0 || c < 0 || r >= mat.length || c >= mat[0].length || visited[r][c] || mat[r][c] != word.charAt(idx)) {
            return false;
        }

        visited[r][c] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            if (dfs(mat, word, r + dr[i], c + dc[i], idx + 1, visited)) {
                return true;
            }
        }

        visited[r][c] = false;
        return false;
    }
}