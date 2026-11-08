class Solution {
    public Node insertInMiddle(Node head, int x) {
        if (head == null) {
            return new Node(x);
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newNode = new Node(x);
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}