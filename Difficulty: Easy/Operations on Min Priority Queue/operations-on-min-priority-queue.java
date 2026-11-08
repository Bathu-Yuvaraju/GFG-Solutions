class minPriorityQueue {
    private PriorityQueue<Integer> pq;

    public minPriorityQueue() {
        pq = new PriorityQueue<>();
    }

    public void push(int x) {
        pq.offer(x);
    }

    public int pop() {
        if (pq.isEmpty()) {
            return -1;
        }
        return pq.poll();
    }

    public int peek() {
        if (pq.isEmpty()) {
            return -1;
        }
        return pq.peek();
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public int size() {
        return pq.size();
    }
}