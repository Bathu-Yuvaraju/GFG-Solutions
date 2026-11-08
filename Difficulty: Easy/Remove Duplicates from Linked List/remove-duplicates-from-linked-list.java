class Solution {
    public Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        seen.add(current.data);

        while (current.next != null) {
            if (seen.contains(current.next.data)) {
                current.next = current.next.next;
            } else {
                seen.add(current.next.data);
                current = current.next;
            }
        }

        return head;
    }
}