class Solution {
    public int findSize(Node head) {
        int count = 0;
        Node current = head;

        // Traverse the doubly linked list and count each node
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}