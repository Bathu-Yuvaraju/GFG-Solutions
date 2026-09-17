import java.util.*;
class Solution {
    public int minimumEdgeReversal(int[][] edges, int n, int src, int dst) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(new int[]{v, 0});
            adj.get(v).add(new int[]{u, 1});
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Deque<Integer> dq = new ArrayDeque<>();
        dist[src] = 0;
        dq.addFirst(src);
        while(!dq.isEmpty()) {
            int node = dq.removeFirst();
            for(int[] edge : adj.get(node)) {
                int next = edge[0];
                int cost = edge[1];
                if(dist[node] + cost < dist[next]) {
                    dist[next] = dist[node] + cost;
                    if(cost == 0)
                        dq.addFirst(next);
                    else
                        dq.addLast(next);
                }
            }
        }
        if(dist[dst] == Integer.MAX_VALUE)
            return -1;
        return dist[dst];
    }
}