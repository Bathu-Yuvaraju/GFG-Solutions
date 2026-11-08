
class Solution {
    public int largestSumCycle(int[] edge) {
        int n = edge.length;
        int[] visited = new int[n];
        int maxSum = -1;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                int curr = i;
                int step = 1;

                while (curr != -1 && visited[curr] == 0) {
                    visited[curr] = step;
                    step++;
                    curr = edge[curr];
                }

                if (curr != -1 && visited[curr] > 0) {
                    int cycleSum = 0;
                    int start = curr;
                    do {
                        cycleSum += curr;
                        curr = edge[curr];
                    } while (curr != start);

                    maxSum = Math.max(maxSum, cycleSum);
                }

                curr = i;
                while (curr != -1 && visited[curr] > 0) {
                    int next = edge[curr];
                    visited[curr] = -1;
                    curr = next;
                }
            }
        }

        return maxSum;
    }
}