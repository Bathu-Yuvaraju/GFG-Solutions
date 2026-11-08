class Solution {
    public Node addOne(Node head) {
        head = reverse(head);
        Node curr = head;
        int carry = 1;

        while (curr != null) {
            int sum = curr.data + carry;
            carry = sum / 10;
            curr.data = sum % 10;

            if (carry == 0) {
                break;
            }

            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
                break;
            }

            curr = curr.next;
        }

        return reverse(head);
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}