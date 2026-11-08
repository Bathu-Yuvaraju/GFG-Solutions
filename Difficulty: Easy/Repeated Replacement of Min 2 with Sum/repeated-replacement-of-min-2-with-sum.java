class Solution {
    public int minOperations(int[] arr, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int x : arr) {
            pq.add((long) x);
        }

        int count = 0;
        while (pq.peek() < k) {
            if (pq.size() < 2) {
                return -1;
            }
            long first = pq.poll();
            long second = pq.poll();
            long sum = first + second;
            pq.add(sum);
            count++;
        }

        return count;
    }
}