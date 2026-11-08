class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        if (x < 0 || x >= deq.size()) {
            return;
        }

        int n = deq.size();
        if (x < n / 2) {
            for (int i = 0; i < x; i++) {
                deq.addLast(deq.removeFirst());
            }
            deq.removeFirst();
            for (int i = 0; i < x; i++) {
                deq.addFirst(deq.removeLast());
            }
        } else {
            for (int i = 0; i < n - 1 - x; i++) {
                deq.addFirst(deq.removeLast());
            }
            deq.removeLast();
            for (int i = 0; i < n - 1 - x; i++) {
                deq.addLast(deq.removeFirst());
            }
        }
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if (start >= end || start < 0 || end > deq.size()) {
            return;
        }

        int n = deq.size();
        for (int i = 0; i < start; i++) {
            deq.addLast(deq.removeFirst());
        }

        int countToRemove = end - start;
        for (int i = 0; i < countToRemove; i++) {
            deq.removeFirst();
        }

        for (int i = 0; i < start; i++) {
            deq.addFirst(deq.removeLast());
        }
    }

    public void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}