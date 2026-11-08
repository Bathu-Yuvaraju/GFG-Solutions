class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        curr.next = head;

        curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}