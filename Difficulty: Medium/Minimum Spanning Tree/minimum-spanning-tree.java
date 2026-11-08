class Solution {
    public int primMST(ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        int V = adj.size();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        boolean[] visited = new boolean[V];

        pq.add(new int[]{0, 0});
        int totalWeight = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int weight = curr[1];

            if (visited[u]) continue;
            visited[u] = true;
            totalWeight += weight;

            for (ArrayList<Integer> neighbor : adj.get(u)) {
                int v = neighbor.get(0);
                int w = neighbor.get(1);

                if (!visited[v]) {
                    pq.add(new int[]{v, w});
                }
            }
        }

        return totalWeight;
    }
}