import java.util.Stack;

class myQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public myQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    void enqueue(int x) {
        s1.push(x);
    }

    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }

    int front() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    int size() {
        return s1.size() + s2.size();
    }
}