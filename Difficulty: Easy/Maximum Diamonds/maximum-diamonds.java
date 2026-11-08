class Solution {
    public long maxDiamonds(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int val : arr) {
            maxHeap.add(val);
        }

        long totalDiamonds = 0;
        for (int i = 0; i < k; i++) {
            int current = maxHeap.poll();
            totalDiamonds += current;
            maxHeap.add(current / 2);
        }

        return totalDiamonds;
    }
}