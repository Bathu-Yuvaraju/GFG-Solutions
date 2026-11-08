class MinHeap {
    private java.util.ArrayList<Integer> heap;

    public MinHeap() {
        heap = new java.util.ArrayList<>();
    }

    public void push(int x) {
        heap.add(x);
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (heap.get(currentIndex) < heap.get(parentIndex)) {
                int temp = heap.get(currentIndex);
                heap.set(currentIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    public void pop() {
        if (heap.isEmpty()) {
            return;
        }
        int lastElement = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            int currentIndex = 0;
            int size = heap.size();
            while (true) {
                int leftChild = 2 * currentIndex + 1;
                int rightChild = 2 * currentIndex + 2;
                int smallest = currentIndex;

                if (leftChild < size && heap.get(leftChild) < heap.get(smallest)) {
                    smallest = leftChild;
                }
                if (rightChild < size && heap.get(rightChild) < heap.get(smallest)) {
                    smallest = rightChild;
                }

                if (smallest != currentIndex) {
                    int temp = heap.get(currentIndex);
                    heap.set(currentIndex, heap.get(smallest));
                    heap.set(smallest, temp);
                    currentIndex = smallest;
                } else {
                    break;
                }
            }
        }
    }

    public int peek() {
        if (heap.isEmpty()) {
            return -1;
        }
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }
}