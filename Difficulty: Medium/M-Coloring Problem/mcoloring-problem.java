
class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        int[] color = new int[v];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return solve(0, adj, color, m, v);
    }

    private boolean solve(int node, List<List<Integer>> adj, int[] color, int m, int v) {
        if (node == v) {
            return true;
        }

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, adj, color, i)) {
                color[node] = i;
                if (solve(node + 1, adj, color, m, v)) {
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int node, List<List<Integer>> adj, int[] color, int col) {
        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == col) {
                return false;
            }
        }
        return true;
    }
}