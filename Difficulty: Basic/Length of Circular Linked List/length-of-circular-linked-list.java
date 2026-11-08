class Solution {
    public static int getLength(Node head) {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }
}