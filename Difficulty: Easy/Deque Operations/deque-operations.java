import java.util.LinkedList;

class MyDeque {
    private LinkedList<Integer> deque;

    public MyDeque() {
        deque = new LinkedList<>();
    }

    public void addFront(int x) {
        deque.addFirst(x);
    }

    public void addBack(int x) {
        deque.addLast(x);
    }

    public int removeFront() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.removeFirst();
    }

    public int removeBack() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.removeLast();
    }

    public int elementAtFront() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getFirst();
    }

    public int elementAtBack() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }
}