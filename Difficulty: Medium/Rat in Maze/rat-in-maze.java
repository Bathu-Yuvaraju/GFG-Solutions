class Solution {
    private void solve(int row, int col, int[][] maze, int n, String currentPath, ArrayList<String> result, boolean[][] visited) {
        if (row == n - 1 && col == n - 1) {
            result.add(currentPath);
            return;
        }

        String directions = "DLRU";
        int[] dRow = {1, 0, 0, -1};
        int[] dCol = {0, -1, 1, 0};

        for (int i = 0; i < 4; i++) {
            int nextRow = row + dRow[i];
            int nextCol = col + dCol[i];

            if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n && 
                !visited[nextRow][nextCol] && maze[nextRow][nextCol] == 1) {
                visited[nextRow][nextCol] = true;
                solve(nextRow, nextCol, maze, n, currentPath + directions.charAt(i), result, visited);
                visited[nextRow][nextCol] = false;
            }
        }
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return result;
        }

        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        solve(0, 0, maze, n, "", result, visited);
        return result;
    }
}