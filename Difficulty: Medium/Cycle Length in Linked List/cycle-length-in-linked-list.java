class Solution {
    public int lengthOfLoop(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;
        boolean hasLoop = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        if (!hasLoop) {
            return 0;
        }

        int length = 1;
        Node current = slow.next;
        while (current != slow) {
            length++;
            current = current.next;
        }

        return length;
    }
}