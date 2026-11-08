
class Solution {
    public boolean checkEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        ArrayList<Integer> neighbors = adj.get(u);
        for (int i = 0; i < neighbors.size(); i++) {
            if (neighbors.get(i) == v) {
                return true;
            }
        }
        return false;
    }
}