class Solution {
    public boolean isEven(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        return count % 2 == 0;
    }
}