class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> result = new ArrayList<>();
        Node current = head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }
}