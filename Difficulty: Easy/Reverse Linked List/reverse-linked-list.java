class Solution {
    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextTemp = current.next; // Store the next node
            current.next = prev;          // Reverse the current node's pointer
            prev = current;               // Move prev one step forward
            current = nextTemp;           // Move current one step forward
        }

        return prev; // prev will be the new head of the reversed list
    }
}