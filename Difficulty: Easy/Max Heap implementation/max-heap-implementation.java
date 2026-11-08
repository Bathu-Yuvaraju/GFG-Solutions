import java.util.ArrayList;

class maxHeap {
    private ArrayList<Integer> heap;

    public maxHeap() {
        heap = new ArrayList<>();
    }

    public void push(int x) {
        heap.add(x);
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (heap.get(currentIndex) > heap.get(parentIndex)) {
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
                int largest = currentIndex;

                if (leftChild < size && heap.get(leftChild) > heap.get(largest)) {
                    largest = leftChild;
                }
                if (rightChild < size && heap.get(rightChild) > heap.get(largest)) {
                    largest = rightChild;
                }

                if (largest != currentIndex) {
                    int temp = heap.get(currentIndex);
                    heap.set(currentIndex, heap.get(largest));
                    heap.set(largest, temp);
                    currentIndex = largest;
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