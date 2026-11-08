class Solution {
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans) {
        vis[node] = true;
        ans.add(node);
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(neighbor, adj, vis, ans);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, adj, vis, ans);
        return ans;
    }
}