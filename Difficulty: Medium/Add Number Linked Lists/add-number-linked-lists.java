class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);

        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        Node result = reverse(dummyHead.next);

        while (result != null && result.data == 0 && result.next != null) {
            result = result.next;
        }

        return result;
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}