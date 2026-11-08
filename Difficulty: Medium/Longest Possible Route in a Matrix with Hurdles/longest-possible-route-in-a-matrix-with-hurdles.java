class Solution {
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        return dfs(mat, xs, ys, xd, yd, visited);
    }

    private int dfs(int[][] mat, int r, int c, int xd, int yd, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= mat.length || c >= mat[0].length || mat[r][c] == 0 || visited[r][c]) {
            return -1;
        }

        if (r == xd && c == yd) {
            return 0;
        }

        visited[r][c] = true;
        int maxLen = -1;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int res = dfs(mat, r + dr[i], c + dc[i], xd, yd, visited);
            if (res != -1) {
                maxLen = Math.max(maxLen, 1 + res);
            }
        }

        visited[r][c] = false;
        return maxLen;
    }
}