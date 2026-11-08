class Solution {
    public Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node zeroHead = new Node(0);
        Node oneHead = new Node(0);
        Node twoHead = new Node(0);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node curr = head;

        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }
}