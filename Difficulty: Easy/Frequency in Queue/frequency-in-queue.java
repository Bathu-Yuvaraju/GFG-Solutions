class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        if (!q.contains(k)) {
            return -1;
        }
        int count = 0;
        for (int item : q) {
            if (item == k) {
                count++;
            }
        }
        return count;
    }
}